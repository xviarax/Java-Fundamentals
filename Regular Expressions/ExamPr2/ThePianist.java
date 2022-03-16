package ExamPr2;

import java.util.*;
import java.util.stream.Collectors;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> compositor = new TreeMap<>();

        for (int i = 0; i < n  ; i++) {
            List<String> listtie = new LinkedList<>();
            String[] split = scanner.nextLine().split("\\|");   //  Fur Elise|Beethoven|A Minor
            listtie.add(split[1]);
            listtie.add(split[2]);
            compositor.put(split[0], listtie);
        }
        String commands = scanner.nextLine();

        while (!commands.equals("Stop")) {
            List<String> listtie = new ArrayList<>();
            String[] splittie = commands.split("\\|");
                switch (splittie[0]){
                    case "Add":
                        if (compositor.containsKey(splittie[1])){
                                System.out.printf("%s is already in the collection!%n", splittie[1]);
                            } else {
                                listtie.add(splittie[2]);
                                listtie.add(splittie[3]);
                                compositor.put(splittie[1], listtie);
                            System.out.printf("%s by %s in %s added to the collection!%n", splittie[1], splittie[2], splittie[3]);
                            }
                        break;
                    case "Remove":
                        if (compositor.containsKey(splittie[1])) {
                            compositor.remove(splittie[1]);
                            System.out.printf("Successfully removed %s!%n", splittie[1]);
                        }  else {
                            System.out.printf("Invalid operation! %s does not exist in the collection.%n", splittie[1]);
                        }
                        break;
                    case "ChangeKey":
                        if (compositor.containsKey(splittie[1])) {
                            compositor.get(splittie[1]).set(1, splittie[2]);
                            System.out.printf("Changed the key of %s to %s!%n", splittie[1], splittie[2]);
                        } else {
                            System.out.printf("Invalid operation! %s does not exist in the collection.%n", splittie[1]);
                        }
                        break;
            }
            commands = scanner.nextLine();
        }
        compositor.forEach((key, value) -> System.out.printf("%s -> Composer: %s, Key: %s%n", key, value.get(0), value.get(1)));

    }
}
