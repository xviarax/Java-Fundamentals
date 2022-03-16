package MoreEx;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

                if (i % 2 == 0 && i != 2) {
                    isPrime = false;
                    
                }

            System.out.printf("%d -> %b%n", i, isPrime);
        }



    }
}
