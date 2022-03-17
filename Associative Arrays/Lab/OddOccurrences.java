import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] things = scanner.nextLine().split(" ");

        Map<String, Integer> maps = new LinkedHashMap<>();

        for (String s : things) {
            String lCase = s.toLowerCase(Locale.ROOT);

            if (maps.containsKey(lCase)) {
                int count = maps.get(lCase);
                maps.put(lCase, count + 1);
            } else {
                maps.put(lCase, 1);
            }
        }
        List<String> oddCount = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            int count = entry.getValue();
            if (count % 2 != 0) {
                oddCount.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddCount));


    }
}
