package lesson2;

import java.util.Arrays;

public class hw2 {

    static int[] replace1with0(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i] + 1) % 2;
        }

        return a;
    }
    static void generate(int n){
        int[] a = new int[n];
    for (int i = 1; i < n ; i++) {
     a[i] = a[i - 1] + 3;
    }

    }
static int[] process(int [] array){
    for (int i = 0; i < array.length; i++) {
        if (array[i] < 6 ) {
         array[i] *= 2;
        }
    }
    return array;
}

static void diagonal(int size){
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
        matrix[i][i] = 1;
        matrix[i][size - i - 1] = 1;
    }
    System.out.println(Arrays.deepToString(matrix));
    for (int i = 0; i < size; i++)
        System.out.println(Arrays.toString(matrix[i]));
}








    public static void main(String[] args) {
        int[] a = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(replace1with0(a)));
        System.out.println(Arrays.toString(process( new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        diagonal(7);
    }




}
