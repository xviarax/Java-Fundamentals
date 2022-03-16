package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vtora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    String regex = "[@|#]+(?<color>[a-z]{3,})[@|#]+[^a-zA-Z0-9]*[\\/]+(?<digit>\\d+)[\\/]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int count = 0;

        while (matcher.find()) {
            System.out.printf("You found %s %s eggs!%n", matcher.group("digit"), matcher.group("color"));
        }


    }
}
