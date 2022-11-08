public class H2 {
    public static int max(int a, int b) {
        int max = Math.max(a, b);
        return max;
    }

    public static int max2(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(10, 30));
        System.out.println(max2(10, 30));
    }
}