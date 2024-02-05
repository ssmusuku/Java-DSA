package Arrays;

import java.util.Arrays;

public class ConcatenationOfArrays {
    public static void main(String[] args) {
       ConcatenationOfArrays obj = new ConcatenationOfArrays();
       int[] nums = {1,2,3};
       obj.getConcatenation(nums);
    }
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        for(int i=0; i<n;i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
