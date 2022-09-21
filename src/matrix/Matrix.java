package matrix;

public class Matrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
       int n =  noOfPaths(matrix, matrix.length,matrix[0].length);
        System.out.println("paths : "+n);
//        System.out.println("columns : " + matrix[0].length);
//        System.out.println("rows : " + matrix.length);
//        int col = matrix[0].length;
//        int rows = matrix.length;
//        for (int i = 0; i < rows; i++) {
//            System.out.print("\n");
//            for (int j = 0; j < col; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//        }
    }

    private static int noOfPaths(int[][] matrix, int i, int j) {
        if(i==1 || j==1){
            return 1;
        }

        return noOfPaths(matrix, i-1, j) + noOfPaths(matrix, i, j-1);

    }
}
