package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        System.out.println(arrayList);
        ArrayListExample obj = new ArrayListExample();
        int[] arr = {1,22,3,4,9};
        obj.swap(arr);
    }
    public void swap(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
