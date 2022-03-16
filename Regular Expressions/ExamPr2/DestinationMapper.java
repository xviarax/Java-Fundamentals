package ExamPr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(=|\\/)(?<name>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        int sum = 0;
        List<String> llist = new ArrayList<>();
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            sum += matcher.group("name").length();
            llist.add(matcher.group("name"));
        }
        System.out.printf("Destinations: ");
        for (int i = 0; i < llist.size(); i++) {
            if (i == llist.size() - 1) {
                System.out.print(llist.get(i).replace("=", "").replace("/", ""));
            } else {
                System.out.print(llist.get(i).replace("=", "").replace("/", "") + ", ");
            }
        }
        System.out.println();
        System.out.printf("Travel Points: %d", sum);

    }
}
