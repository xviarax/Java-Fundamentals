package Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsinAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> maps = new LinkedHashMap<>();
        for (char a : text.toCharArray()) {
            if (a == ' ') {
                continue;
            }
            if (maps.containsKey(a)){
                maps.put(a, maps.get(a) + 1);
            } else {
                maps.put(a, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
