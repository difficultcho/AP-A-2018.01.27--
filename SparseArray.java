import java.util.*;

public class SparseArray {
    private int numRows;
    private int numCols;

    private List<SparseArrayEntry> entries;

    public SparseArray() {
        entries = new ArrayList<SparseArrayEntry>();
    }

    public SparseArray(int row, int col) {
        this.entries = new ArrayList<SparseArrayEntry>();
        this.numRows = row;
        this.numCols = col;
        this.entries.add(new SparseArrayEntry(3, 5, 100));
    }

    public int getNumRows() {return numRows;}
    public int getNumCols() {return numCols;}

    public int getValueAt(int row, int col) {
        for (SparseArrayEntry sae : entries) {
            if (sae.getRow() == row &&
            sae.getCol() == col) {
                return sae.getValue();
            }
        }
        return 0;
    }

    public void removeColumn(int col) {
        for (SparseArrayEntry sae : entries) {
            int c = sae.getCol();
            if (c < col) {
                ;
            } else if (c == col) {
                entries.remove(sae);
            } else {
                sae.reduceCol();
            }
        }
    }

    public static void main(String[] args) {
        SparseArray sa = new SparseArray(7, 7);
        System.out.println(sa.getValueAt(3, 4));
        sa.removeColumn(2);
        System.out.println(sa.getValueAt(3, 4));
    }
}
