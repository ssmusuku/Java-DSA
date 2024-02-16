package Arrays;

import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index ={0,1,2,2,1};
        CreateTargetArray obj = new CreateTargetArray();
        obj.createTargetArray( nums ,  index );
    }
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i=0;i<index.length;i++){
            int value = index[i];
            target[i] = nums[value];
        }
        System.out.println(Arrays.toString(target));
        return target;
    }
}
