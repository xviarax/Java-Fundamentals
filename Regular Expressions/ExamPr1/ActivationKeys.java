package ExamPr1;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] commands = input.split(">>>");
            switch (commands[0]) {
                case "Contains":
                    if (key.contains(commands[1])) {
                        System.out.printf("%s contains %s%n", key, commands[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(commands[2]);
                    int endIndex = Integer.parseInt(commands[3]);

                    switch (commands[1]) {
                        case "Upper":
                            String replacing = key.substring(startIndex, endIndex);
                            key = key.replace(replacing, replacing.toUpperCase(Locale.ROOT));
                            break;
                        case "Lower":
                            String replacing1 = key.substring(startIndex, endIndex);
                            key = key.replace(replacing1, replacing1.toLowerCase(Locale.ROOT));
                            break;
                    }
                    System.out.println(key);
                    break;
                case "Slice":
                    int startIndex1 = Integer.parseInt(commands[1]);
                    int endIndex2 = Integer.parseInt(commands[2]);
                    String deleteSub = key.substring(startIndex1, endIndex2);
                    key = key.replace(deleteSub, "");
                    System.out.println(key);
                    break;
            }
            input = scanner.nextLine();

        }
        System.out.printf("Your activation key is: %s%n", key);
    }
}
