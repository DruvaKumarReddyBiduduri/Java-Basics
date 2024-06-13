import java.util.Arrays;


public class Matrices {
    public static void print(int[][] mat){
        for (int[] arr:mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int[][] add(int[][] mat1,int[][] mat2){
        if(mat1.length!=mat2.length){
            System.out.println("Cannot perform addition on matrices of two different sizes");
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                mat1[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        return mat1;
    }

    public static boolean equal(int[][] mat1,int[][] mat2){
        if(mat1.length!=mat2.length){
            return false;
        }

        for (int i = 0; i < mat1.length; i++) {
            if(mat1[i].length!=mat2.length){
                return false;
            }
            for(int j=0;j<mat2[i].length;j++){
                if(mat1[i][j]!=mat2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static int diagonalSum(int[][] arr) {
        int leftDiagonalSum=0,rightDiagonalSum=0;

        for (int i = 0; i < arr.length; i++) {
            int[] a=arr[i];
            leftDiagonalSum+=a[i];
        }

        int n= arr.length-1;
        for (int[] a : arr) {
            rightDiagonalSum += a[n];
            n--;
        }

        return leftDiagonalSum+rightDiagonalSum;
    }

    public static void transpose(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
