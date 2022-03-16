package Exam;

import java.util.Locale;
import java.util.Scanner;

public class purva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Complete")) {
            String[] split = input.split(" ");

            switch (split[0]) {
                case "Make":
                    if (split[1].equals("Upper")) {
                        String replacing = pass.substring(Integer.parseInt(split[2]), Integer.parseInt(split[2])+1);
                        pass = pass.replace(replacing, replacing.toUpperCase(Locale.ROOT));

                    } else if (split[1].equals("Lower")) {
                        String replacing1 = pass.substring(Integer.parseInt(split[2]), Integer.parseInt(split[2])+1);
                        pass = pass.replace(replacing1, replacing1.toLowerCase(Locale.ROOT));

                    }
                    System.out.println(pass);
                    break;
                case "Insert":
                    if (Integer.parseInt(split[1]) >=0 && Integer.parseInt(split[1]) <= pass.length()) {
                    String firstHalf = pass.substring(0, Integer.parseInt(split[1]));
                    String secondHalf = pass.substring(Integer.parseInt(split[1]));
                    pass = firstHalf + split[2] + secondHalf;

                    System.out.println(pass); } else {
                        break;
                    }
                    break;
                case "Replace":
                    String oldChar = split[1];
                    if (pass.contains(oldChar)) {
                        char neww = split[1].charAt(0);
                        int newwChar = neww;
                        int sum = newwChar + Integer.parseInt(split[2]);
                        String newChar = Character.toString((char) sum);
                        pass = pass.replace(oldChar, newChar);
                        System.out.println(pass);
                    } else {
                        break;
                    }

                    break;
                case "Validation":
                    int countU = 0;
                    int countL = 0;
                    int countD = 0;
                    int countnz = 0;
                    if (pass.length() < 8) {
                        System.out.println("Password must be at least 8 characters long!");
                    }
                    for (Character s : pass.toCharArray()) {
                        if (Character.isLowerCase(s)) {
                            countL++;
                        } else if (Character.isUpperCase(s)) {
                            countU++;
                        } else if (Character.isDigit(s)) {
                            countD++;
                        } else if (Character.toString(s).equals("_")){
                            countnz++;
                        } else {
                            System.out.println("Password must consist only of letters, digits and _!");
                            break;
                        }
                    }
                    if (countU < 1) {
                        System.out.println("Password must consist at least one uppercase letter!");
                        break;
                    }
                    if (countL < 1) {
                        System.out.println("Password must consist at least one lowercase letter!");
                        break;
                    }

                    if (countD < 1) {
                        System.out.println("Password must consist at least one digit!");
                        break;
                    }
                    break;
                default:
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
