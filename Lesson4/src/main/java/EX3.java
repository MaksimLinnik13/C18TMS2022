import java.util.Scanner;

public class EX3 {
    //3) Меньшее по модулю число
//Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
// пользователем вещественных чисел с консоли.
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        System.out.println("Введи число 1");
        a = test.nextInt();
        System.out.println("Введи число 2");
        b = test.nextInt();
        System.out.println("Введи число 3");
        c = test.nextInt();
        if ((Math.abs(a) < Math.abs(b)) & (Math.abs(a) < (Math.abs(c)))) {
            System.out.println(Math.abs(a));
        } else if ((Math.abs(b)) < (Math.abs(a)) & (Math.abs(b)) < (Math.abs(c))) {
            System.out.println(Math.abs(b));
        } else {
            System.out.println(Math.abs(c));
        }
    }
}


