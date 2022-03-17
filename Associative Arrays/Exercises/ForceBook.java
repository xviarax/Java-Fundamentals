package Exercises;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, List<String>> forceBook = new LinkedHashMap<>();
        while (!command.equals("Lumpawaroo")) {
            if (command.contains("|")) {
                String forceSide = command.split("\\s+\\|\\s+")[0];
                String forceUser = command.split("\\s+\\|\\s+")[1];
                forceBook.putIfAbsent(forceSide, new ArrayList<>());
                boolean exist = false;
                for (List<String> list : forceBook.values()) {
                    if (list.contains(forceUser)) {
                        exist = true;
                    }
                }
                if (!exist) {
                    forceBook.get(forceSide).add(forceUser);
                }

            } else if (command.contains("->")) {
                String forceUser = command.split("\\s+->\\s+")[0];
                String forceSide = command.split("\\s+->\\s+")[1];
                forceBook.entrySet().forEach(entry -> entry.getValue().remove(forceUser));
                forceBook.putIfAbsent(forceSide, new ArrayList<>());
                forceBook.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }
            command = scanner.nextLine();
        }

        forceBook.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .sorted((e1, e2) -> {
                    int sortedResult = Integer.compare(e2.getValue().size(), e1.getValue().size());
                    if (sortedResult == 0) {
                        sortedResult = e1.getKey().compareTo(e2.getKey());
                    }
                    return sortedResult;
                }).forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(user -> System.out.println("! " + user));
                });


    }
}