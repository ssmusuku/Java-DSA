package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0; i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int[] a:arr
             ) {
            System.out.println(Arrays.toString(a));
        }

    }
}
