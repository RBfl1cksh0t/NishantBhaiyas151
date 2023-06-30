package Arrays;

import java.util.Arrays;
public class RotateArray {

    static int[] rotateArray (int[] arr, int k){
        int[] tempArr = new  int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tempArr[(i+k)%arr.length] = arr[i];
        }

        arr = tempArr;

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4 , 5,6, 7};
        System.out.println(Arrays.toString(rotateArray(arr,3)));

    }
}
