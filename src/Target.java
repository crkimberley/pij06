/**
 * @author crkimberley on 05/09/2016.
 */
public class Target {
    private int[][][] targetArray;

    public Target(int size) {
        targetArray = new int[size][size][size];
        // Set all elements to 0
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                for (int k=0; k<size; k++) {
                    targetArray [i][j][k] = 0;
                }
            }
        }
    }

    private void init() {
        int size = targetArray.length;
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                for (int k=0; k<size; k++) {
                    targetArray [i][j][k] = 0;
                }
            }
        }
        // Set random element to 1
        int x = (int) Math.abs(size * Math.random());
        int y = (int) Math.abs(size * Math.random());
        int z = (int) Math.abs(size * Math.random());
        targetArray[x][y][z] = 1;
    }

    private Result fire(int x, int y, int z) {
        int size = targetArray.length;
        if (x < 0 || x > size -1 || y < 0 || y > size -1 || z < 0 || z > size -1) {
            return Result.OUT_OF_RANGE;
        }
        // Locate target element
        int targetX = -1;
        int targetY = -1;
        int targetZ = -1;
        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                for (int k=0; k<size; k++) {
                    if (targetArray [i][j][k] == 1) {
                        targetX = i;
                        targetY = j;
                        targetZ = k;
                    }
                }
            }
        }
        if (x < targetX) {
            return Result.FAIL_LEFT;
        }
        if (x > targetX) {
            return Result.FAIL_RIGHT;
        }
        if (y < targetY) {
            return Result.FAIL_LOW;
        }
        if (y > targetY) {
            return Result.FAIL_HIGH;
        }
        if (z < targetZ) {
            return Result.FAIL_SHORT;
        }
        if (z > targetZ) {
            return Result.FAIL_LONG;
        }
        return Result.HIT;
    }
}
