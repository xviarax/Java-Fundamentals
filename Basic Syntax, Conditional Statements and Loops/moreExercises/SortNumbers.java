package moreExercises;

import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double x = 0;

        if (b < a) {
            x = a;
            a = b;
            b = x;
        }
        if (c < a) {
            x = c;
            c = a;
            a = x;
        }
        if (c < b) {
            x = c;
            c = b;
            b = x;
        }
        if (a == b) {
            x = a;
            a = b;
            b = x;
        }
        if (a == c) {
            x = a;
            a = c;
            c = x;
        }
        if (b == c) {
            x = b;
            b = c;
            c = x;
        }
        System.out.printf("%.0f\n", c);
        System.out.printf("%.0f\n", b);
        System.out.printf("%.0f", a);
    }
}
