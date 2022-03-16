package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String neZnam = command.split(" ")[0];
            int numberFr = Integer.parseInt(command.split(" ")[1]);
            switch (neZnam) {
                case "Delete":
                    numList.removeAll(Arrays.asList(numberFr));
                    break;
                case "Insert":
                    int b = Integer.parseInt(command.split(" ")[2]);
                    numList.add(b, numberFr);
                    break;
            }
            command = scanner.nextLine();
        }
        for (int item : numList) {
            System.out.print(item + " ");
        }
    }
}
