package ExamPr2;

import java.util.Scanner;

public class PasswordReser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            String[] split = command.split(":");

            switch (split[0]) {
                case "Add Stop":
                    if (Integer.parseInt(split[1]) < stops.length() && Integer.parseInt(split[1]) >= 0) {
                        String firstHalf = stops.substring(0, Integer.parseInt(split[1]));
                        String secondHalf = stops.substring(Integer.parseInt(split[1]));
                        stops = firstHalf + split[2] + secondHalf;
                    }
                    break;
                case "Remove Stop":
                    if (Integer.parseInt(split[1]) < stops.length() && Integer.parseInt(split[1]) >= 0 && Integer.parseInt(split[2]) >= 0 && Integer.parseInt(split[2]) < stops.length()) {
                        String first = stops.substring(0, Integer.parseInt(split[1]));
                        String second = stops.substring(Integer.parseInt(split[2]) + 1);
                        stops = first + second;
                    }
                    break;
                case "Switch":
                    String newStr = split[2];
                    String oldStr = split[1];
                    if (stops.contains(oldStr)) {
                        stops = stops.replace(oldStr, newStr);
                    }
                    break;
            }

            System.out.println(stops);
            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n", stops);
    }
}
