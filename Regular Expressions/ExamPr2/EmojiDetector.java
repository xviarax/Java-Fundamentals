package ExamPr2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([:]{2}|[*]{2})(?<emodji>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        int coolness = 1;
        int currCoolness = 0;

        List<String> names = new ArrayList<>();


        for (Character a : input.toCharArray()) {
            if (Character.isDigit(a)){
                coolness *= Integer.parseInt(a.toString());
            }
        }
        System.out.printf("Cool threshold: %d%n", coolness);

        while (matcher.find()) {
            count++;
            String nameEm = matcher.group("emodji");
            for (Character a : nameEm.toCharArray()) {
                currCoolness += a;
            }
            if (currCoolness >= coolness) {
                names.add(matcher.group());
            }
            currCoolness = 0;
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", count);
        for (String s : names) {
            System.out.println(s);
        }


    }
}
