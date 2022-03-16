package Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String things = scanner.nextLine();
        List<String> separatedList = Arrays
                        .stream(things.split("\\|"))
                        .collect(Collectors.toList());
        Collections.reverse(separatedList);
        System.out.println(separatedList.toString()
                .replace("[", "")
                .replace("]", "")
                        .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));
    }
}
