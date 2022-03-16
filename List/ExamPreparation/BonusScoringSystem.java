package ExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStud = Integer.parseInt(scanner.nextLine());
        int countLectures = Integer.parseInt(scanner.nextLine());
        int aditBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int maxAtt = 0;


        for (int i = 0; i < countStud; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            double bonus = attendances * 1.0/ countLectures * (5 + aditBonus);

            if (bonus > maxBonus){
                maxBonus = bonus;
                maxAtt = attendances;
            }
           // attendances = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("Max Bonus: %.0f.", Math.ceil(maxBonus));
        System.out.println();
        System.out.printf("The student has attended %d lectures.", maxAtt);

    }
}
