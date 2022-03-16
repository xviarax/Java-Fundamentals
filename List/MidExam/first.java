package MidExam;

import java.util.Locale;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        //Burger Bus
        Scanner scanner = new Scanner(System.in);
        int cities = Integer.parseInt(scanner.nextLine());
        double profit = 0;
        double totalP = 0;

        for (int i = 1; i <= cities ; i++) {
            String name = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            if (i % 5 == 0) {
                income -= income*0.1;
            } else if (i % 3 == 0) {
                expenses += expenses*0.5;
            }


            profit = income - expenses;
            totalP += profit;
            System.out.printf(Locale.US,"In %s Burger Bus earned %.2f leva.%n", name,profit );


        }
        System.out.printf(Locale.US, "Burger Bus total profit: %.2f leva.", totalP);

    }

}
