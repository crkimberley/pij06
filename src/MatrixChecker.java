/**
 * @author crkimberley on 27/08/2016.
 */
public class MatrixChecker {

    // Same recursive method as used for palindromes earlier
    boolean isSymmetrical(int[] arrayToCheck) {
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
}
