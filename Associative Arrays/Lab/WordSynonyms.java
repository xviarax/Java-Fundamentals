import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> maps = new LinkedHashMap<>();
        for (int i = 1; i <= n ; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();
            if (maps.containsKey(key)) {
                maps.put(key, maps.get(key) + ", " + value);
            } else  {
                maps.put(key, value);
            }
        }

        for (Map.Entry<String, String> entry : maps.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }

    }
}
