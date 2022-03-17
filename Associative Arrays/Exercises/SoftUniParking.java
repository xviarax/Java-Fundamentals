package Exercises;

import java.util.*;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> maps = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String command = scanner.nextLine();
            String[] split = command.split(" ");
            if (split[0].equals("register")){
             if (maps.containsKey(split[1]))  {
                 System.out.printf("ERROR: already registered with plate number %s%n", split[2]);
             } else {
                 maps.put(split[1], split[2]);
                 System.out.printf("%s registered %s successfully%n", split[1], split[2]);
             }
            } else if (split[0].equals("unregister")) {
                if (maps.containsKey(split[1])){
                    maps.remove(split[1]);
                    System.out.printf("%s unregistered successfully%n", split[1]);
                } else {
                    System.out.printf("ERROR: user %s not found%n", split[1]);
                }
            }
        }
        for (Map.Entry<String, String> entry : maps.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }


    }
}
