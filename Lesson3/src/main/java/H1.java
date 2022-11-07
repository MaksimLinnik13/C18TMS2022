public class H1 {


    public static void main(String[] args) {


        System.out.println(sum(Integer.MAX_VALUE, 7));

    }

    public static int sum(int a, int b) {
        long sum = (long) a + (long) b;
        if (sum > Integer.MAX_VALUE) {
            return -1;
        } else {
            return (int) sum;
        }

    }
}


























