package Arrays;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        FlippingAnImage obj = new FlippingAnImage();
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        obj.flipAndInvertImage(image);
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] abc = new int[image.length][image.length];
        int n = 3;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(image[i][j] == 0){
                    abc[i][n-j-1] = 1;
                }
                else if(image[i][j] == 1)
                {
                    abc[i][n-j-1] = 0;
                }
                System.out.println(Arrays.toString(abc[i]));
            }
        }
        return abc;
    }
}
