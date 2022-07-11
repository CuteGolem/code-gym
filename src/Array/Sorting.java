package Array;

public class Sorting {

    public static int[] sortedArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {78, 1, 3, 90, 34, 1, -4, 6, 55, 20, -65};
        int count = 0;
        int[] res = sortedArray(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

//        for (int i = 0; i < res.length; i++) {
//            for (int j = i + 1; j < res.length; j++) {
//                if (res[i] == res[j]) {
//                    System.out.println("Repeated Number:" + res[i]);
//                    count++;
//                }
//
//            }
//        }
//        System.out.println(count);

    }

}
