public class q1 {

    public static int arraySum (int[] arr) {
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
        }
        return ret;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] ret = new int[arr2D.length];
        int idx = 0;
        for (int[] row : arr2D) {
            ret[idx] = arraySum(row);
            idx++;
            //System.out.println(ret[idx - 1]);
        }
        return ret;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] sums = rowSums(arr2D);
        for (int i = 0; i < sums.length - 1; i++) {
            for (int j = i + 1; j < sums.length; j++) {
                if (sums[i] == sums[j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] testData = {{1, 2, 3, 4, -5, 55},
                        {10, 20, 30}};
        System.out.println(isDiverse(testData));
    }
}
