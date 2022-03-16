package Exercises;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yiel = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int sum = 0;



        while (yiel >= 100) {
            int workedSp = yiel - 26;
            sum += workedSp;
            yiel -= 10;
            days ++;

        }

        System.out.println(days);
        if (sum >= 26) {
            sum -= 26;
        }
        System.out.println(sum);

    }
}
