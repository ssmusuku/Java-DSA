public class HowManyTimesNumberIsRepeated {
    public static void main(String[] args) {
        long originalNumber =15778479,reminder,result=0;
        while (originalNumber!=0){
            reminder = originalNumber%10;
            if(reminder == 7){
                result +=1;
            }
            originalNumber /=10;
        }
        System.out.println(result);

    }
}
