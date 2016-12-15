package main.chapter_2;

/**
 * Created by cuijl on 12/15/16.
 * 查找斐波纳契数列中第 N 个数。
 * 所谓的斐波纳契数列是指：
 * 前2个数是 0 和 1 。
 * 第 i 个数是第 i-1 个数和第i-2 个数的和。
 * 斐波纳契数列的前10个数字是：0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 */

public class Fibonacci {
    /**
     * 这种递归的实现方法比较慢，当数据大于47的时候提交过不去，
     * @param n
     * @return
     */
    public int fibonacci(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    /**
     * 100% 数据通过测试. 总耗时: 1547 ms
     * @param n
     * @return
     */
    public int fibonacci_2(int n){
        int first = 0;
        int second = 1;
        int current = 0;
        for(int i=1; i <= n;++i){
            if(i == 1){
                current = 0;
            }
            else if(i == 2){
                current = 1;
            }
            else{
                current = first + second;
                int temp = first;
                first = second;
                second += temp;
            }
        }
        return current;
    }

    public static void main(String[] args){
        Fibonacci  solution = new Fibonacci();

        //System.out.println(solution.fibonacci(47));

        System.out.println(solution.fibonacci_2(47));
    }

}
