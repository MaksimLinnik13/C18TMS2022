import java.util.Random;

public class EX1 {
    //        Задачи:
//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.
    public static void main(String[] args) {
        Random rnd = new Random();
        int dayOftheWeek = rnd.nextInt(1, 7);
        System.out.printf("%d ", dayOftheWeek);
        switch (dayOftheWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("ВТ");
                break;
            case 3:
                System.out.println("СР");
                break;
            case 4:
                System.out.println("ЧТ");
                break;
            case 5:
                System.out.println("ПТ");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
        }
    }
}
