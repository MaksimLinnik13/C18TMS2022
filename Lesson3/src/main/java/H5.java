public class H5 {
    public static double calculateHypotenuse(int a, int b) {
        double powA = Math.pow(a, 2);
        double powB = Math.pow(b, 2);
        double sum = powA + powB;
        double sqrtNumbers = Math.sqrt(sum);
        return sqrtNumbers;

    }

    public static void main(String[] args) {
        System.out.println(calculateHypotenuse(3, 4));

    }
}




