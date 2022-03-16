package Exercises;

import com.sun.source.tree.IfTree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        int max = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] split = command.split(" ");

            if (split[0].equals("Add")) {
                wagons.add(Integer.parseInt(split[1]));
                    } else {
                       int currN = Integer.parseInt(split[0]);
                                for (int i = 0; i < wagons.size() ; i++) {
                                    if (currN + wagons.get(i) <= max){
                                        wagons.set(i, currN+wagons.get(i));
                                        break;
                                    }
                                }

                        }
            command = scanner.nextLine();
                    }
//        for (int item : wagons) {
//            System.out.print(item + " ");
//        }
        wagons.forEach(w -> System.out.print(w + " "));




         }

    }

