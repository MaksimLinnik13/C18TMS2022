public class H4 {
    public static double average(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = sum / array.length;
        return avg;

    }

    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4, 5};
        int[] test2 = new int[0];
        System.out.println(average(test));
        System.out.println(average(test2));
    }
}
