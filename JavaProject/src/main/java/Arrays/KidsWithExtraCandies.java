package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithExtraCandies {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,5,6};
        int n= 4;
        KidsWithExtraCandies obj = new KidsWithExtraCandies();
        obj.kidsWithCandies(arr, n);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> x = new ArrayList<>();
        int max = 0;
        for(int i=0; i<candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int j = 0;j<candies.length;j++){
            int sum = candies[j]+extraCandies;
            if(sum>=max){
                x.add(true);
            }else{
                x.add(false);
            }
        }
        System.out.println(x);
        return x;
    }
}
