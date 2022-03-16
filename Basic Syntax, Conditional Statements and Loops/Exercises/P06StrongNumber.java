package Exercises;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String nz = Integer.toString(N);
        int sum = 0;

        for (int i = 0; i < nz.length(); i++) {
            int sum1 = 1;
            char x = nz.charAt(i);
            int a = Character.getNumericValue(x);
            for (int j = a; j >= 1; j--) {
                sum1 *= j;
            }
            sum += sum1;

        }
        if (N == sum) {
            System.out.printf("yes");
        } else {
            System.out.printf("no");
        }
    }
}
