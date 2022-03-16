package MoreEx;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        double max = 0;
        int maxxA = 0;

        for (int i = 0; i < countStudents; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
           double  bonus = ((attendances * 1.0/ countLectures) * (5 + initialBonus));
            if (bonus > max) {
                max = bonus;
                maxxA = attendances;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(max));
        System.out.printf("The student has attended %d lectures.", maxxA);

    }
}
