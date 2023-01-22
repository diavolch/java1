package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        ex3();
    }

    private static void ex1() {
        int[] arr = {8, 1, -5, 12, 6, 4, 3, -4};
        int maxNumber = arr[0];
        int minNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }
        System.out.printf("Минимальное число в массиве = %d;\nМаксимальное число в массиве = %d;", minNumber, maxNumber);
    }

    public static void ex2() {
        System.out.printf("Введите год: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        scan.close();
        boolean result = false;
        if (year % 4 == 0 ) {
            result = true;
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        System.out.println(result);
    }

    private static void ex3() {
        int[] arr = {3, 2, 3, 1, 0, 3, 2, 1};
        int val = 3;
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            if (arr[left] == val && arr[right] != val) {
                arr[left] = arr[right];
                arr[right] = val;
                left++;
                right--;
            }
            if (arr[left] != val) {
                left++;
            }
            if (arr[left] == val && arr[right] == val) {
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
