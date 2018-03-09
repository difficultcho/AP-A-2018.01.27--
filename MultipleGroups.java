import java.util.*;

public class MultipleGroups {
    public List<NumberGroup> contents;

    public MultipleGroups() {
        contents = new ArrayList();
    }

    public boolean contains(int num) {
        for (NumberGroup ng : contents) {
            if (ng.contains(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MultipleGroups mg = new MultipleGroups();
        mg.contents.add(new Range(5, 8));
        mg.contents.add(new Range(10, 12));
        mg.contents.add(new Range(1, 6));

        System.out.println(mg.contains(5));
        System.out.println(mg.contains(11));
        System.out.println(mg.contains(2));
        System.out.println(mg.contains(9));
    }
}
