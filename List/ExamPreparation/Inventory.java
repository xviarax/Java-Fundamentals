package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> things = Arrays
                        .stream(scanner.nextLine().split(", "))
                        .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            String[] split = command.split(" ");
            switch (split[0]){
                case "Collect":
                    if (things.contains(split[2])) {
                        break;
                    } else {
                        things.add(split[2]);
                    }
                    break;
                case "Drop":
                    things.remove(split[2]);
                    break;
                case "Combine":
                    String[] items = split[3].split(":");
                    if (things.contains(items[0])) {
                        things.add(things.indexOf(items[0]) + 1, items[1]);
                    }
                    break;
                case "Renew":
                    if (things.contains(split[2])) {
                        things.remove(split[2]);
                        things.add(split[2]);
                    }
                    break;
            }
            command = scanner.nextLine();

        }
        for (String item : things) {
            if (things.size() - 1 == things.indexOf(item)) {
                System.out.print(item + " ");
            } else {
                System.out.print(item + ", ");
            }
        }



    }
}
