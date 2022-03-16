package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class P10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouseP = Double.parseDouble(scanner.nextLine());
        double key = Double.parseDouble(scanner.nextLine());
        double disp = Double.parseDouble(scanner.nextLine());

        int count = 0;
        double allPrice = 0;

        for (int i = 0; i < lostGames; i++) {
            count++;
            if (count % 2 == 0 && count != 0) {
                allPrice += headset;
            }
            if (count % 3 == 0 && count != 0) {
                allPrice += mouseP;
            }
            if (count % 6 == 0 && count != 0) {
                allPrice += key;
            }
            if (count % 12 == 0 && count != 0) {
                allPrice += disp;
            }
        }
        System.out.printf(Locale.US,"Rage expenses: %.2f lv.", allPrice);



    }
}
