package Exercises;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";
        for (int i = 1; i <= lines ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI *Math.pow(radius, 2) * height;

            if (volume > maxVolume){
                maxVolume = volume;
                maxModel = model;
            }



        }
        System.out.println(maxModel);



    }
}
