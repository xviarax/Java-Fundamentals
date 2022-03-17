package Exercise;
import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        if (input == null || input.length() == 0) {
            return;
        }
        char first = input.charAt(0);
        sb.append(first);
        for (int i = 1; i < input.length(); i++) {
            char sec = input.charAt(i);
            if (sec != first) {
                sb.append(sec);
                first = sec;
            }
        }

        System.out.println(sb);
    }
}