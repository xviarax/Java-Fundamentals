import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        Map<Integer, Integer> maps = new TreeMap<>();

        for (int i = 0; i < numList.size(); i++) {
            int n = numList.get(i);

            if (maps.containsKey(n)) {
                maps.put(n, maps.get(n)+1);
            } else {
                maps.put(n, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            System.out.printf("%d -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
