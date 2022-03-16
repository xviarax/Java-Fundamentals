package moreExercises;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        boolean isValid = true;
        double totalSpent = 0.0;
        while (!input.equalsIgnoreCase("Game time")) {
            double currentPrice = 0.0;
            switch (input) {
                case "OutFall 4":
                    currentPrice = 39.99;
                    break;
                case "CS: OG":
                    currentPrice = 15.99;
                    break;
                case "Zplinter Zell":
                    currentPrice = 19.99;
                    break;
                case "Honored 2":
                    currentPrice = 59.99;
                    break;
                case "RoverWatch":
                    currentPrice = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    currentPrice = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    isValid = false;
                    break;
            }
            if (currentPrice > budget && isValid) {
                System.out.println("Too Expensive");
            } else if (isValid) {
                budget -= currentPrice;
                totalSpent += currentPrice;
                if (budget == 0) {
                    System.out.printf("Bought %s\n", input);
                    System.out.println("Out of money!");
                    isValid = false;
                    break;
                } else {
                    System.out.printf("Bought %s\n", input);
                }
            }
            isValid = true;
            input = scanner.nextLine();
        }
        if (isValid) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, budget);
        }
    }
}