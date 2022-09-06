package Array;

import java.util.Arrays;

public class LargestNthElement {

    public static void nThLargestElement(Integer[] arr, int k) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.print("Largest Element: " +arr[k - 1]);

    }

    public static void main(String[] args){

       Integer[] a = {78, 1, 3, 90, 34, 6, 55, 20};
       nThLargestElement(a,7); //Prints 7th Largest element in the array a
    }

}
