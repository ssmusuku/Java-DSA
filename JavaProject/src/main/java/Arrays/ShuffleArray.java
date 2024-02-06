package Arrays;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n=3;
        ShuffleArray obj = new ShuffleArray();
        obj.shuffleArray(arr, n);
    }
    public void shuffleArray(int[] arr, int n){
        int[] shuffledArray = new int[arr.length];
        for(int i=0;i<n;i++){
            shuffledArray[i*2] = arr[i];
            shuffledArray[i*2+1] = arr[n+i];
        }
        System.out.println(Arrays.toString(shuffledArray));
    }
}
