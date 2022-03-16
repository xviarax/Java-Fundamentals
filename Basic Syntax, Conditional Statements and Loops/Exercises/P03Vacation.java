package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;

        if (day.equals("Friday")) {
            if (typeGroup.equals("Students")) {
                price = 8.45;
                totalPrice = number * price;
                if (number >= 30) {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice * 0.85);
                } else {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice);
                }

            } else if (typeGroup.equals("Business")) {
                price = 10.90;
                totalPrice = number * price;
                if (number >= 100) {
                    number -= 10;
                    totalPrice = number * price;
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice);
                } else {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice);
                }

            } else if (typeGroup.equals("Regular")) {
                price = 15;
                totalPrice = number * price;
                if (number >= 10 && number <= 20) {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice * 0.95);
                } else {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice);
                }

            }
        } else if (day.equals("Saturday")) {
            if (typeGroup.equals("Students")) {
                price = 9.80;
                totalPrice = number * price;
                if (number >= 30) {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice * 0.85);
                } else {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice);
                }
            } else if (typeGroup.equals("Business")) {
                price = 15.60;
                totalPrice = number * price;
                if (number >= 100) {
                    number -= 10;
                    totalPrice = number * price;
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice);
                } else {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice);
                }

            } else if (typeGroup.equals("Regular")) {
                price = 20;
                totalPrice = number * price;
                if (number >= 10 && number <= 20) {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice * 0.95);
                } else {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice);
                }
            }
        } else if (day.equals("Sunday")) {

            if (typeGroup.equals("Students")) {
                price = 10.46;
                totalPrice = number * price;
                if (number >= 30) {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice * 0.85);
                } else {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice);
                }
            } else if (typeGroup.equals("Business")) {
                price = 16;
                totalPrice = number * price;
                if (number >= 100) {
                    number -= 10;
                    totalPrice = number * price;
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice);
                } else {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice);
                }
            } else if (typeGroup.equals("Regular")) {
                price = 22.50;
                totalPrice = number * price;
                if (number >= 10 && number <= 20) {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice * 0.95);
                } else {
                    System.out.printf(Locale.US, "Total price: %.2f", totalPrice);
                }
            }
        }

    }
}
