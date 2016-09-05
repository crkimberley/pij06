/**
 * @author crkimberley on 25/08/2016.
 */
public class ArrayCopier {

    private void copy(int[] src, int[] dst) {
        for (int i=0; i<dst.length; i++) {
            dst[i] = (i < src.length ? src[i] : 0);
        }
    }
}
