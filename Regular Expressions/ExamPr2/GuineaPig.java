package ExamPr2;

import java.util.Locale;
import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodKg = Double.parseDouble(scanner.nextLine())* 1000;
        double hayKg = Double.parseDouble(scanner.nextLine())* 1000;
        double coverKg = Double.parseDouble(scanner.nextLine())* 1000;
        double weightKg = Double.parseDouble(scanner.nextLine()) * 1000;

        for (int i = 1; i <= 30; i++) {
            foodKg -= 300;
//            if (foodKg <= 0 ){
//                System.out.println("Merry must go to the pet store!");
//                break;
//            }


            if (i % 2 == 0) {
//                if (hayKg < 0 ){
//                    System.out.println("Merry must go to the pet store!");
//                    break;
//                }
                hayKg -= foodKg*0.05;
            }
            if (i % 3 == 0) {
//                if (coverKg < 0 ){
//                    System.out.println("Merry must go to the pet store!");
//                    break;
//                }
                coverKg -= weightKg / 3;
//                if (coverKg < 0 ){
//                    System.out.println("Merry must go to the pet store!");
//                    break;
//                }
            }

            if (i == 30 && coverKg >= 0 && hayKg >= 0 && foodKg >= 0){
                System.out.printf(Locale.US,"Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodKg/1000,hayKg/1000, coverKg/1000);
            }
            else if (foodKg < 0 || hayKg < 0 || coverKg < 0) {
                System.out.println("Merry must go to the pet store!");
            }
        }


    }
}
