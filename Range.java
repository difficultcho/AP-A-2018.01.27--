public class Range implements NumberGroup {
    private int min;
    private int max;

    public boolean contains(int num) {
        if (num >= min && num <= max) return true;
        else return false;
    }

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
