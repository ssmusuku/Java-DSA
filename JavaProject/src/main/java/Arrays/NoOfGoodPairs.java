package Arrays;

public class NoOfGoodPairs {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        NoOfGoodPairs obj = new NoOfGoodPairs();
        obj.numIdenticalPairs(nums);
    }
    public int numIdenticalPairs(int[] nums) {
        int[] arr=new int[100];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1]++;
        }
        int sum=0;
        for(int i=0;i<100;i++){
            int val=arr[i];
            sum+=(arr[i]*(arr[i]-1))/2;
        }
        return sum;
    }
}
