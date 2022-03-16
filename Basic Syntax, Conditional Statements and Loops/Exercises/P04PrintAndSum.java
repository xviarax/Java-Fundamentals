package Exercises;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStart = Integer.parseInt(scanner.nextLine());
        int numEnd = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = numStart; i <= numEnd; i++) {
            sum += i;
            if (i < numEnd) {
                System.out.print(i + " ");
            } else if (i == numEnd) {
                System.out.printf("%d%nSum: %d", i, sum);
            }

        }

    }
}
