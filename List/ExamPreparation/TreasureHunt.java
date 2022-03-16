package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> loots = Arrays
                        .stream(scanner.nextLine().split("\\| "))
                        .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Yohoho")) {
            List<String> split = Arrays
                    .stream(command.split(" "))
                    .collect(Collectors.toList());
            switch (split.get(0)){
                case "Loot":

                    break;
                case "Drop":
                    break;
                case "Steal":
                    break;
            }



        }


    }
}
