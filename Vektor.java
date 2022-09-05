public class Vektor {
    public static void main(String[] args) {
        int [] a= {-10,2,4,5,2,1};
        System.out.println(min(a));
    }
    public static int min(int[] v) {
        int min = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] < min) {
                min = v[i];
            }
        }
        return min;
    }
}

