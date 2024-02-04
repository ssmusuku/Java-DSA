package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] twoDimen = {{1,2,3},{4,5}};
        //System.out.println(Arrays.toString(twoDimen));
        System.out.println(a.length);
        for(int i=0; i<a.length;i++){
            for (int j=0 ; j<a[i].length;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<a.length;i++){
            for (int j=0 ; j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0; i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
        for(int[] ss : a ){
            System.out.println(Arrays.toString(ss));
        }

    }
}
