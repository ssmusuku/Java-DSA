package Functions;

import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        AddNumber addNumber = new AddNumber();
        addNumber.sum(a ,b);
    }

    private void sum(int a, int b) {
        System.out.println(a+b);
    }
}
