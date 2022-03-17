package Exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        int strength = 0;

        for (int i = 0; i < sb.length() ; i++) {
            char curr = sb.charAt(i);
            if (curr == '>') {
                strength+= Integer.parseInt(""+sb.charAt(i + 1));
            } else if (curr != '>' && strength > 0) {
                sb.deleteCharAt(i);
                i--;
                strength--;
            }

        }
        System.out.println(sb);
    }
}
