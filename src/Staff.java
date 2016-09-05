/**
 * @author crkimberley on 05/09/2016.
 */
public class Staff {
    static final int INITIAL_LENGTH = 5;
    private String[] names = new String[INITIAL_LENGTH];
    private int[] ids = new int[INITIAL_LENGTH];
    private int size = 0;

    private void addStaff(String name, int id) {
        if (size == names.length) {
            String[] tempNameArray = new String[names.length * 2];
            int[] tempIdArray = new int[ids.length * 2];
            System.arraycopy(names, 0, tempNameArray, 0, names.length);
            System.arraycopy(ids, 0, tempIdArray, 0, ids.length);
            names = tempNameArray;
            ids = tempIdArray;
        }
        names[size] = name;
        ids[size] = id;
        size++;
    }

    private String[] getNames() {
        return names;
    }

    private int[] getIds() {
        return ids;
    }

    private int getSize() {
        return size;
    }
}