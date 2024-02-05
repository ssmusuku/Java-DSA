package Arrays;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        RunningSum obj = new RunningSum();
        int[] nums = {1,2,3,4};
        obj.runningSum(nums);
    }
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            arr[i] = sum;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
