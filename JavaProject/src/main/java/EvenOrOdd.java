import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        EvenOrOdd eo = new EvenOrOdd();
        eo.evenOrOdd(a);
    }

    private void evenOrOdd(int a) {
        if(a%2 == 0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
}
