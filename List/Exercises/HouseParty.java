package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();

            String isOrNotComing = command.split(" ")[2];
            String Names = command.split(" ")[0];

            if (isOrNotComing.equals("going!")) {
                if (names.contains(Names)) {
                    System.out.printf("%s is already in the list!%n",Names);
                } else {
                    names.add(Names);
                }
             } else if (isOrNotComing.equals("not")) {
                if (names.contains(Names)) {
                   names.remove(Names);
                } else {
                    System.out.printf("%s is not in the list!%n",Names);
                }
            }
    }
        for (String item : names) {
            System.out.println(item);
        }
}}
