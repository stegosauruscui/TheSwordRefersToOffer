package main.chapter_2;

/**
 * Created by IntelliJ IDEA.
 * User: cuijianlong
 * Date: 5/4/17
 * Time: 3:28 PM
 *
 * 题目： 二进制中有多少个1
 *
 * 计算在一个 32 位的整数的二进制表式中有多少个 1.
 *
 * -1(11111111111111111111111111111111) 期望： 32
 */
public class CountOnes {

    /**
     * 是否通过: N
     * 问题： 对负数右移未做判断, 负数右移，最终该数会变得很大，OFFFFF
     * @param num
     * @return
     *
     *
     */
    public int countOnes(int num){

        int c = 0;
        while(num != 0){
            if( (num & 1) == 1)
                ++c;
            num >>= 1;
        }
        return c;
    }

    /**
     * 是否通过： Y
     * 为了避免死循环，可以不右移该数，
     * @param num
     * @return
     */

    public int countOnes_2(int num){
        int count =0;
        int flag = 1;
        while (flag !=0 ){
            if( (num & flag) !=0 )
                ++count;
            flag = flag<<1;
        }
        return count;
    }


    /**
     * 是否通过： Y
     * @param num
     * @return
     * 解析:
     * 如： 1100 ， 减去1， 得 1011
     *  1100 & 1011 = 1000
     *  结果是把1100 最右边的1变成了0，得到 1000， 可以发现，有多少个1，就可以进行多少次运算。
     */
    public int countOnes_1(int num){
        int count =0;
        while (num !=0 ){
            count++;
            num = (num-1)&num;
        }
        return count;

    }

    public static  void main(String[]args){
        CountOnes count = new CountOnes();
        System.out.println(count.countOnes(32)); // 1
        System.out.println(count.countOnes(5));  // 2
        System.out.println(count.countOnes(1023)); // 9
        //System.out.println(count.countOnes(-1)); // 32

        System.out.println("----------------");
        System.out.println(count.countOnes_2(32)); // 1
        System.out.println(count.countOnes_2(5));  // 2
        System.out.println(count.countOnes_2(1023)); // 9
        System.out.println(count.countOnes_2(-1)); // 32
        System.out.println("----------------");


        System.out.println(count.countOnes_1(32)); // 1
        System.out.println(count.countOnes_1(5));  // 2
        System.out.println(count.countOnes_1(1023)); // 9
        System.out.println(count.countOnes_1(-1)); // 32


    }





}
