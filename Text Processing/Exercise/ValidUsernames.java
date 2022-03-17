package Exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(", ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            String name = names[i];

            if (name.length() >= 3 && name.length() <= 16) {
                for (int j = 0; j <= name.length() - 1; j++) {
                    Character a = name.charAt(j);
                    if (Character.isLetterOrDigit(a) || a.equals('-') || a.equals('_')) {
                        if (j == name.length() - 1) {
                            System.out.println(name);
                        }
                    } else {
                       break;
                    }

                }
            }
        }
        System.out.println(sb);
    }
}

