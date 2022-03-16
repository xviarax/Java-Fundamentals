package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class P09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int countStud = Integer.parseInt(scanner.nextLine());
        double lightsaber = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        int freeBelts = countStud / 6;


        double equipmentPrice = lightsaber*Math.ceil(countStud + 0.10*countStud) + robes*countStud + belts*(countStud - freeBelts);


        if (equipmentPrice <= money) {
            System.out.printf(Locale.US,"The money is enough - it would cost %.2flv.", equipmentPrice);
        } else {
            System.out.printf(Locale.US,"George Lucas will need %.2flv more.", equipmentPrice - money);
        }

    }
}
