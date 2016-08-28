/**
 * @author crkimberley on 27/08/2016.
 */
public class MatrixChecker {

    // Revised recursive method used for palindromes earlier
    private boolean isSymmetrical(int[] arrayToCheck) {
        if (arrayToCheck.length < 2) {
            return true;
        }
        if (arrayToCheck[0] != arrayToCheck[arrayToCheck.length - 1]) {
            return false;
        }
        int[] shorterArray = new int[arrayToCheck.length - 2];
        for (int i=0; i<shorterArray.length; i++ ) {
            shorterArray[i] = arrayToCheck[i + 1];
        }
        return isSymmetrical(shorterArray);
    }

    /* Iterative method

    public boolean isSymmetrical(int[] arrayToCheck) {
		for (int i=0;i<arrayToCheck.length/2;i++) {
			if (arrayToCheck[i] != arrayToCheck[arrayToCheck.length-i-1]) {
				return false;
			}
		}
		return true;
	}
     */

    private boolean isSymmetrical(int[][] arrayToCheck) {
        if (arrayToCheck.length != arrayToCheck[0].length) {
            System.out.println("Array dimensions aren't equal");
            return false;
        }
        for (int i=1; i<arrayToCheck.length; i++) {
            for (int j=0; j<i   ; j++) {
                System.out.println("checking element " + i + ", " + j);
                if (arrayToCheck[i][j] != arrayToCheck[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
