package Functions;

import java.util.Scanner;

public class MaxAndMinNumber {
    public void max(int a, int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println("Max is " + max);
    }
    public void min(int a, int b, int c){
        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        System.out.println("Min is " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        MaxAndMinNumber obj = new MaxAndMinNumber();
        obj.max(num1,num2,num3);
        obj.min(num1,num2,num3);
    }
}
