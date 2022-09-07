package Array;

public class MissingElement {

    int missingNum(int arr[]){

        int n = arr.length;
        int total = n*((n+1)/2);
        int sum = 0;
        for(int i=0;i<n-1;i++) {
            sum += arr[i];
        }
        return total - sum;

    }

    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6,7,8,10};
        MissingElement miss = new MissingElement();
        System.out.println(miss.missingNum(arr));

    }


}
