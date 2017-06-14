package main.chapter_2;

import java.lang.Character;
/**
 * Created by cuijl on 12/15/16.
 * 空格替换
 * 设计一种方法，将一个字符串中的所有空格替换成 %20 。你可以假设该字符串有足够的空间来加入新的字符，且你得到的是“真实的”字符长度。
 * example:
 * 对于字符串"Mr John Smith", 长度为 13
 * 替换空格之后，参数中的字符串需要变为"Mr%20John%20Smith"，并且把新长度 17 作为结果返回。
 *
 * 测试结构： 100% 数据通过测试   总耗时: 1195 ms
 */
public class ReplaceBlank {
    public int replaceBlank(char[] string, int length){
        /**
         * 先计算移动后的长度，采用向后移的方法实现
         */
        int blankSpaceNum = 0;
        for(int i=0; i<length; ++i){
            if(string[i] == ' '){
                ++blankSpaceNum;
            }
        }
        int lastLength = length + blankSpaceNum * 2;
        int index = lastLength-1;
        for(int i=length-1; i>=0; --i){
            if(string[i] == ' '){
                string[index] = '0';
                --index;
                string[index] = '2';
                --index;
                string[index] = '%';
                --index;
            }
            else{
                //System.out.println(string.length);
                string[index] = string[i];
                --index;
            }
        }
        return lastLength;
    }

    public static void main(String[] args){
        char[] string = new char[1024];
        String s= "Mr John Smith";
        for(int i=0;i<s.length();++i){
            string[i] = s.charAt(i);
        }
        // 把字符串组抓换成字符数组
        System.out.println(string.length);
        System.out.println(string);

        ReplaceBlank replaceBlank = new ReplaceBlank();
        int len = replaceBlank.replaceBlank(string, 13);
        System.out.println(len);
        System.out.println(string);

    }
}
