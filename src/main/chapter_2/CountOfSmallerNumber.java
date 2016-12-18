package main.chapter_2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by cuijl on 12/18/16.
 * 给定一个整数数组 （下标由 0 到 n-1，其中 n 表示数组的规模，数值范围由 0 到 10000），
 * 以及一个 查询列表。对于每一个查询，将会给你一个整数，请你返回该数组中小于给定整数的元素的数量。
 *
 * 样例:
 *      对于数组 [1,2,7,8,5] ，查询 [1,8,5]，返回 [0,4,2]
 *
 *
 */
public class CountOfSmallerNumber {

    public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries){

        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(A);
        for (int index: queries) {
            boolean isTrue = true;
            for(int i=0; i < A.length; ++i){
                if(A[i] >= index){
                    result.add(i);
                    isTrue = false;
                    break;
                }
            }
            if(isTrue){
                result.add(0);
            }

        }
        return result;
    }
    public static void main(String[] args){

        // 测试1
        int[] intArray = new int[] {1, 2, 7, 8, 5};
        int[] queries = new int[]{1, 8, 5};
        CountOfSmallerNumber Solution = new CountOfSmallerNumber();
        ArrayList<Integer> result =  Solution.countOfSmallerNumber(intArray, queries);
        System.out.println(result);

        // 测试2
        //对于[] 返回[0, 0, 0]
        int[] intArray_2 = new int[] {};
        result =  Solution.countOfSmallerNumber(intArray_2, queries);
        System.out.println(result);

    }
}
