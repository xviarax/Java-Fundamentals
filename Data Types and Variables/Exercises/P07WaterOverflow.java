package Exercises;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int tank = 255;
        int sum = 0;

        for (int i = 1; i <= lines; i++) {
            int water = Integer.parseInt(scanner.nextLine());
            sum += water;

            if (sum > tank) {
                System.out.println("Insufficient capacity!");

                sum-=water;
            }

        }
        System.out.println(sum);


    }
}
