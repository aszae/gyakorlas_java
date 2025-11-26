package gyak2;

public class MatrixDeterminant {
    public static void main(String[] args) {
        double[][] matrix ={{1,2,3},
                            {4,6,3},
                            {7,8,10}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("m[%d][%d] = %.2f ", i+1, j+1, matrix[i][j]);
            }
            System.out.println();
        }
        double determinant =
                matrix[0][0] * matrix[1][1] * matrix[2][2] +
                matrix[1][0] * matrix[2][1] * matrix[0][2] +
                matrix[0][1] * matrix[1][2] * matrix[2][0] -
                matrix[2][0] * matrix[1][1] * matrix[0][2] -
                matrix[1][0] * matrix[0][1] * matrix[2][2] -
                matrix[2][1] * matrix[1][2] * matrix[0][0];
        System.out.printf("Determinant = %.2f", determinant);
    }
}
