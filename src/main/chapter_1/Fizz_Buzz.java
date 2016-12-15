package main.chapter_1;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

/**
 * Created by cuijl on 12/15/16.
 */
public class Fizz_Buzz {

    public ArrayList<String> fizzBuzz(int n){

        ArrayList<String> results = new ArrayList<>();
        for (int i=1; i<= n; ++i){
            if(i % 15 == 0){
                results.add("fizz buzz");
            }
            else if(i % 3 == 0){
                results.add("fizz");
            }
            else if(i % 5 == 0){
                results.add("buzz");
            }
            else{
                results.add(String.valueOf(i));
            }
        }
        return results;
    }

    public static void main(String[] args){
        Fizz_Buzz Solution = new Fizz_Buzz();
        ArrayList<String> result = Solution.fizzBuzz(15);
        System.out.println(result);
        //for (String value: result) {
        //    System.out.println(value);
        //}
    }
}
