package Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<name>[A-za-z]+)[@!-:>]*:(?<population>[0-9]*)[@!-:>]*!(?<attack>[A\\D])![@!-:>]*->(?<soldiers>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String encrypted = scanner.nextLine();
            int countLetters = getCountLetters(encrypted);
            StringBuilder decr = new StringBuilder();
            for (char sym : encrypted.toCharArray()) {
                char newChar = (char) (sym - countLetters);
                decr.append(newChar);
            }
            Matcher matcher = pattern.matcher(decr);
            if (matcher.find()) {
                String planetName = matcher.group("name");
                int population = Integer.parseInt(matcher.group("population"));
                String attack = matcher.group("attack");
                if (matcher.group("attack").equals("A")){
                   attacked.add(planetName);
                } else {
                    destroyed.add(planetName);
                }
                int soldiers = Integer.parseInt(matcher.group("soldiers"));
            }
        }
        System.out.println("Attacked planets: " + attacked.size());
        Collections.sort(attacked);
        attacked.forEach(planet -> System.out.println("-> "+ planet));
        System.out.println("Destroyed planets: " + destroyed.size());
        Collections.sort(destroyed);
        destroyed.forEach(planet -> System.out.println("-> "+ planet));
    }

    private static int getCountLetters(String encrypted) {
        int count = 0;
        for (char s : encrypted.toLowerCase().toCharArray()) {
            if (s == 's' || s == 't' || s == 'a' || s == 'r') {
                count++;
            }
        }
        return count;

    }
}
