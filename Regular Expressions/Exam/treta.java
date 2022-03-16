package Exam;

import java.util.*;

public class treta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> mappie = new TreeMap<>();
        int countUnlikeMeals = 0;

        while (!input.equals("Stop")) {
            String[] splittie = input.split("-");
            switch (splittie[0]) {
                case "Like":
                    if (!mappie.containsKey(splittie[1])) {
                        List<String> listtie = new ArrayList<>();
                        listtie.add(splittie[2]);
                        mappie.put(splittie[1], listtie);
                    }
                    else if (mappie.containsKey(splittie[1])) {
                        if (mappie.get(splittie[1]).contains(splittie[2])){
                            break;
                        }
                        mappie.get(splittie[1]).add(splittie[2]);
                    }
                    break;
                case "Dislike":
                    if (mappie.containsKey(splittie[1])) {
                        if (!mappie.get(splittie[1]).contains(splittie[2])) {
                            System.out.printf("%s doesn't have the %s in his/her collection.%n", splittie[1], splittie[2]);
                            break;
                        } else {
                            mappie.get(splittie[1]).remove(splittie[2]);
                            countUnlikeMeals++;
                            System.out.printf("%s doesn't like the %s.%n", splittie[1], splittie[2]);
                        }  } else {
                        System.out.printf("%s is not at the party.%n", splittie[1]);
                    }
                    break;
                default:
                    break;
            }
            input = scanner.nextLine();
        }
        for (String s : mappie.keySet()) {
            System.out.println(s + ": " + mappie.get(s).toString().replace("[", "").replace("]", ""));
        }
        System.out.println("Unliked meals: " + countUnlikeMeals);
    }
}
