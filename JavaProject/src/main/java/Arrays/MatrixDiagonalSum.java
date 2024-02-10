package Arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        MatrixDiagonalSum obj = new MatrixDiagonalSum();
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        obj.diagonalSum(a);
    }

    public int diagonalSum(int[][] mat) {
        int sum =0;
            int n= mat.length;
            for(int i=0;i<n;i++){
                sum += mat[i][i];
                sum += mat[i][n-i-1];
            }
            int oddLength= sum-mat[n/2][n/2];
            return (n%2==0) ?sum: oddLength;
        }
    }

