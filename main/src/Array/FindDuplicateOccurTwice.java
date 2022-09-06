package Array;

import java.util.Arrays;

public class FindDuplicateOccurTwice {

    public static void findDuplicate(int[] arr){

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.print(" "+ arr[i]);
            }
        }

    }

    public static void main(String[] args){

        int[] arr = {88,54,1,90,11,45,2,1,0,2};
        findDuplicate(arr);

    }

}
