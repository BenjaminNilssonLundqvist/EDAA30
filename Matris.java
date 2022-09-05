import java.util.Arrays;

// [y,x]
public class Matris {
    public static void main(String[] args) {
        int[][] m = { { 2, 5, 10 }, { 0, -5, 4 } };
        System.out.println(Arrays.toString(sum(m)));
    }

    public static int[] sum(int[][] m) {
        int total;
        int result[] = new int[m.length];
        
        for (int i = 0; i < m.length; i++) {
            total = 0;
            for (int k = 0; k < m[i].length; k++) {
                total += m[i][k];
            }
            result[i] = total;
        }
        return result;
    }
}