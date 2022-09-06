package Array;

public class LargestAndSmallestElement {

    public static int largestElement(int[] arr){

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    public static int smallestElement(int[] arr){

        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }

    public static void main(String[] args){


    }
}
