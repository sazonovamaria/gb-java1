package lesson1;

import java.rmi.MarshalException;

public class hw1 {
    byte byteValue = 15;
    short shortValue = 10000;
    int intValue = 2_000_000_000;
    long longValue = 1_000_000_000_000L;
    float floatValue = 0.5f;
    double doubleValue = 0.5;
    boolean booleanValue = true;
    char charValue = '0';

    public static void main(String[] args) {
        System.out.println(task3(2, 4, 6, 2));
        System.out.println(task4(3, 4));
        System.out.println(task5(-7));
        System.out.println(task6(-9));
        task7("Маша");
    }

    static int task3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    static boolean task4(int x1, int x2) {
        int sum = (x1 + x2);
        return sum >= 10 && sum <= 20;
    }

    static boolean  task5( int value) {
        if (value > 0)
            System.out.println("Положительное");
     else if (value ==0) {
        System.out.println("Ноль");
    } else {
        System.out.println("Отрицательное");
    } return value >0;
    }
    static boolean task6(int a) {

        if (a < 0) {
        }
        return true;

}
static void task7(String name) {
    System.out.println("Привет," + name);
}
}



