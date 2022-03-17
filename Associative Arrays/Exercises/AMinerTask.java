package Exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Integer> maps = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            int resorQ = Integer.parseInt(scanner.nextLine());
           if (maps.containsKey(command)){
               maps.put(command, maps.get(command) + resorQ);
           } else {
               maps.put(command,resorQ);
           }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
