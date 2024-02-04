package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 55;
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        for(int num : arr){
            System.out.println(num);
        }
        String[] a = new String[4];
        for (int i=0;i<a.length;i++){
           a[i] = sc.next();
        }
        System.out.println(Arrays.toString(a));
        a[2] = "sai";
    }
}
