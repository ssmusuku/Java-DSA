public class Fibonnacci {
    public static void main(String[] args) {
        int sum =0;
        int a=1;
        int b=1;
        System.out.print(a +" "+b);
        for( int i=0 ;sum<50;i++){
            sum = a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }

    }
}
