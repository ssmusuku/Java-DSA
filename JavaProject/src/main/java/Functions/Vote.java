package Functions;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Vote vote = new Vote();
        vote.voteEligibility(a);
    }

    private void voteEligibility(int a) {
        if( a >= 18){
            System.out.println("Eligible for Vote");
        }else {
            System.out.println("Not eligible for Vote");
        }
    }
}
