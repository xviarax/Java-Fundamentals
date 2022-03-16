package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();


            //5 12 42 95 32 1
        while (!command.equals("End")) {
            List<String> comanis = Arrays
                    .stream(command.split("\\s"))
                    .collect(Collectors.toList());

            switch (comanis.get(0)) {
                case "Add":
                    int num = Integer.parseInt(comanis.get(1));
                    numList.add(num);
                    break;
                case "Insert":
                    int numTh = Integer.parseInt(comanis.get(1));
                    int index = Integer.parseInt(comanis.get(2));
                    if (index > numList.size()-1 || index < 0) {
                        System.out.println("Invalid index");
                    } else {
                    numList.add(index, numTh);}
                    break;
                //3 5 12 42 95 32 8 1
                case "Remove":
                    int numTwo = Integer.parseInt(comanis.get(1));
                    if (numTwo > numList.size()-1 || numTwo < 0) {
                        System.out.println("Invalid index");
                        break;
                    } else {
                    numList.remove(numTwo);}
                    break;
                case "Shift":
                    if (comanis.get(1).equals("left")) {
                        for (int i = 0; i < Integer.parseInt(comanis.get(2)); i++) {
                            int hui = numList.get(0);
                            numList.add(hui);
                            numList.remove(0);
                        }
                    } else if (comanis.get(1).equals("right")) {   //3 5 12 42 95 32 8 1
                      //  numList.add(numList.size()+1 - Integer.parseInt(comanis.get(2)), numList.size() - 1);
                        for (int i = 0; i < Integer.parseInt(comanis.get(2)); i++) {
                            int kur = numList.get(numList.size() - 1);
                            numList.remove(numList.size() - 1);
                            numList.add(0, kur);
                        }
                    } //8 - 1, 7-1


            }

            command = scanner.nextLine();
        }
        for (int item : numList) {
            System.out.print(item + " ");
        }
    }
}
