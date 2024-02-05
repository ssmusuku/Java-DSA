package Arrays;

public class RichestSum {
    public static void main(String[] args) {
        RichestSum obj = new RichestSum();
        int[][] arr={{1,2,3},{3,4,5}};
        obj.maximumWealth(arr);
    }
    public int maximumWealth(int[][] accounts) {
        int max =0;
        int row = accounts.length;
        for(int i=0;i<row;i++){
            int sum =0;
            for(int j=0;j<accounts[i].length;j++){
                sum = sum+accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
        return max;
    }
}
