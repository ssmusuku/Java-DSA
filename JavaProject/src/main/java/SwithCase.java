import java.util.Scanner;

public class SwithCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit){
            case "apple":
                System.out.println("Red Apple");
                break;
            case "Orange":
                System.out.println("Orange Orange");
                break;
            case "Banana":
                System.out.println("Yellow Banana");
                break;
            default:
                System.out.println("Not Entered anything");
        }

    }
}
