package lesson3;
import java.util.Scanner;
import java.lang.Math;
public class hw3 {
    public static void main(String[] args) {
        GuessTheNumber();
    }
    public static void GuessTheNumber() {
        Scanner in = new Scanner(System.in);

        int a, n = (int) (Math.random() * 10);
        System.out.println("Компьютер загадал число от 0 до 9, угадайте это число. У вас есть 3 попытки, удачи!");
        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка " + (i + 1) + ": ");
            a = in.nextInt();
            if (a < n) System.out.println("Число больше!");
            if (a > n) System.out.println("Число меньше!");
            if (a == n) {
                System.out.println("Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                a = in.nextInt();
                if (a == 1) GuessTheNumber();
                else {
                    System.out.println("Спасибо за игру!");
                    break;
                }
            }
        }
        System.out.println("Вы не угадали :(");
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        a = in.nextInt();
        if (a == 1) GuessTheNumber();
        else {
            System.out.println("Спасибо за игру!");


        }
    }}