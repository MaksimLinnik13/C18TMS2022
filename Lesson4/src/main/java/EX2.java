import java.util.Scanner;

public class EX2 {
    //2)Проверка четности числа
//Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
// чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
// Если пользователь введёт не целое число, то сообщать ему об ошибке.

    public static void main(String args[]) {
        Scanner test = new Scanner(System.in);
        try {
            System.out.println("Введи число:");
            int a = test.nextInt();
            if (a % 2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Не четное");
            }
        } catch (Exception EXE) {

            System.out.println("Ошибка!");
        }
    }
}


