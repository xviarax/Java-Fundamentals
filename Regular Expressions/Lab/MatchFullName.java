import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexx = "\\b[A-Z]{1}[a-z]+ [A-Z][a-z]+\\b";
        String text = scanner.nextLine();
        Pattern pat = Pattern.compile(regexx);
        Matcher matcher = pat.matcher(text);

       while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

    }
}
