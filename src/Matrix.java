/**
 * @author crkimberley on 25/08/2016.
 */
public class Matrix {
    private int[][] matrix;

    public Matrix(int x, int y) {
        matrix = new int[x][y];
        for (int i=0; i<x; i++) {
            for (int j=0; j<y; j++) {
                matrix[i][j] = 1;
            }
        }
    }


}
