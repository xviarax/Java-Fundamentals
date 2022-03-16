import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";
        String text = scanner.nextLine();
        Pattern pat = Pattern.compile(regex);
        Matcher matcher = pat.matcher(text);

        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());
        }

        System.out.println(String.join(", ", list));
    }
}
