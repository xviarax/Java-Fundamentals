package ExamPreparation;

import java.util.Locale;
import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double sumPlunder = 0;

        for (int i = 1; i <= days ; i++) {
            sumPlunder += dailyPlunder;

            if (i % 3 == 0 && i > 2) {
                sumPlunder+= dailyPlunder*0.5;
            }
            if (i % 5 == 0 && i > 4) {
                sumPlunder-= sumPlunder*0.3;
            }
        }
        if (sumPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", sumPlunder);
        } else {
            double perc = sumPlunder/expectedPlunder*100;
            System.out.printf(Locale.US,"Collected only %.2f%% of the plunder.", perc);
        }

    }
}
