package main.chapter_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuijl on 12/17/16.
 * 题目： 螺旋矩阵
 *
 * 给定一个包含 m x n 个要素的矩阵，（m 行, n 列），按照螺旋顺序，返回该矩阵中的所有要素。
 * 如：[
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]]
 * 应返回 [1,2,3,6,9,8,7,4,5]。
 */
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length ==0)
            return result;
        int x1 = 0;
        int y1 =0;
        int x2 = matrix.length-1;
        int y2 = matrix[0].length-1;

        while(x2>=x1 && y2>=y1){
            // 从左到右
            if(x2>=x1 && y2>=y1){
                for(int i=x1; i<=y2; ++i){
                    result.add(matrix[x1][i]);
                }
                ++x1;
            }
            // 从上到下
            if(x2>=x1 && y2>=y1){
                for(int i=x1; i<=x2; ++i){
                    result.add(matrix[i][y2]);
                }
                --y2;
            }
            // 从右到左
            if(x2>=x1 && y2>=y1){
                for(int i=y2; i>=y1; --i) {
                    result.add(matrix[x2][i]);
                }
                --x2;
            }
            // 从下到上
            if(x2>=x1 && y2>=y1) {
                for(int i=x2; i >=x1; i--){
                    result.add(matrix[i][y1]);
                }
                ++y1;
            }
        }
        //if(x2>=x1 && y2>=y1)
        //    result.add(matrix[x1][x2]);
        return result;
    }

    public static void main(String[] args){
        //测试用例1
        int[][] arr_1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //测试用例2
        int[][] arr_2 ={};

        //测试用例3
        int[][] arr_3 = {
                {1,2},
                {3,4}
        };

        //测试用例 4
        int[][] arr_4 = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };


        SpiralOrder order = new SpiralOrder();
        System.out.println(order.spiralOrder(arr_1));
        System.out.println(order.spiralOrder(arr_2));
        System.out.println(order.spiralOrder(arr_3));
        System.out.println(order.spiralOrder(arr_4));
    }
}
