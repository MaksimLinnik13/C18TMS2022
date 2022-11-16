public class EX2 {
    //2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа


    public static void main(String[] args) {
        int timeOfDivision = 3;
        int cell = 2;
        int step = 3;
        for (int time = 3; time <= 24; time = time + step) {
            System.out.printf("%d ", (int) Math.pow(cell, time / timeOfDivision));
        }

        System.out.println();
        int num[] = new int[]{3, 6, 9, 12, 15, 18, 21, 24};

        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d ", (int) Math.pow(cell, num[i] / timeOfDivision));
        }
        System.out.println();
        int numberOfCell = 0;
        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                numberOfCell = num[i] / timeOfDivision * cell;
            } else {
                numberOfCell = numberOfCell * cell;
            }
            System.out.printf("%d ", numberOfCell);
        }
    }
}