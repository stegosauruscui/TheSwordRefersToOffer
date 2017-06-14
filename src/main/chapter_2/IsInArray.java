package main.chapter_2;

/**
 * Created by IntelliJ IDEA.
 * User: cuijianlong
 * Date: 5/8/17
 * Time: 10:38 AM
 */
public class IsInArray {

    public boolean isInArray(int[] arr){
        if(arr.length == 0){
            return false;
        }
        int mid = arr.length % 2;
        return true;
    }

    public boolean find(int[] arr, int num){
        if(arr.length == 0){
            return false;
        }
        int first = 0;
        int end = arr.length - 1;
        int mid = (first + end) / 2;

        while(true) {
            if(num == arr[mid]){
                return true;
            }

            if (num > arr[mid] && first < mid) {
                first = mid + 1;

            } else if (num < arr[mid] && mid > first) {
                end = mid -1;
            }
            else{
                return false;
            }
            mid = (first + end) / 2;
            if(first == end){
                return false;
            }
        }

        //return false;
    }

    static public void main(String[] args){
        // int[] arr = new int[] {7, 8, 9, 1, 3, 4, 5, 6};
        int[] arr_1 = new int[] {1,2,3,4,5,6};

        IsInArray isarray = new IsInArray();
        System.out.println(isarray.find(arr_1, 2));
        //System.out.println(isarray.find(arr_1, 1));
    }
}
