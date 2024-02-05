package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            ReverseArray obj = new ReverseArray();
            obj.rev(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public void rev(int[] arr, int Start, int end){
        int temp = arr[Start];
        arr[Start] = arr[end];
        arr[end] = temp;

    }
}
