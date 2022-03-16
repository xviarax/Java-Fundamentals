package Exercises;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String passwords = scanner.nextLine();
        String sum = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char letter = username.charAt(i);
            sum += letter;
        }

        for (int i = 1; i <= 4; i++) {

            if (passwords.equals(sum)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else if (!passwords.equals(sum) && i <= 3) {
                System.out.println("Incorrect password. Try again.");
            } else if (!passwords.equals(sum) && i > 3) {

                System.out.printf("User %s blocked!", username);
                break;
            }
            passwords = scanner.nextLine();

        }
    }
}
