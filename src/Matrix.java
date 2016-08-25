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

    private void setElement(int x, int y, int value) {
        if ((x >= 0 && x < matrix.length && y >= 0 && y <  matrix[0].length)) {
            matrix[x][y] = value;
        }
    }

    private void setRow(int x, String rowString) {
        String[] rowNumbers = rowString.split(",");
        if (x >= 0 && x < matrix.length && rowNumbers.length == matrix[x].length) {
            for (int i=0; i < matrix[x].length; i++) {
                matrix[x][i] = Integer.parseInt(rowNumbers[i]);
            }
        }
    }

    private void setColumn(int y, String columnString) {
        String[] columnNumbers = columnString.split(",");
        if (y >= 0 && y < matrix[0].length && columnNumbers.length == matrix.length) {
            for (int i=0; i<matrix.length; i++) {
                matrix[i][y] = Integer.parseInt(columnNumbers[i]);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                sb.append(matrix[i][j]);
                if (j == matrix[0].length - 1) {
                    if (i == matrix.length - 1) {
                        sb.append("]");
                    } else {
                        sb.append(";");
                    }
                } else {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private void prettyPrint() {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
