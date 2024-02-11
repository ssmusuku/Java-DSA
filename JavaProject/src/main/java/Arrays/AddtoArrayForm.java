package Arrays;

import java.util.ArrayList;
import java.util.List;

public class AddtoArrayForm {
    public static void main(String[] args) {
       AddtoArrayForm obj = new AddtoArrayForm();
       int[] num = {1,2,0,0};
       int k = 23;
       obj.addToArrayForm(num, k);
    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> x = new ArrayList<>();
        int sum =0;
        for(int i = 0;i<num.length;i++){
            sum = sum*10+num[i];
        }
        int value = sum +k;
        while(value!=0){
            int a = value%10;
            x.add(0,a);
            value = value/10;

        }
        return x;
    }
}
