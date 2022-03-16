package MoreEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = Arrays
                        .stream(scanner.nextLine().split("!"))
                        .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] split = command.split(" ");
            switch (split[0]) {
                case "Urgent":
                    if (products.contains(split[1])) {
                        break;
                    } else {
                        products.add(0, split[1]);
                    }
                    break;
                case "Unnecessary":
                    products.remove(split[1]);
                    break;
                case "Correct":
                    if (products.contains(split[1])) {
                        products.indexOf(split[1]);
                        products.set(products.indexOf(split[1]), split[2]);
                        break;
                    }

                    break;
                case "Rearrange":
                    if (products.contains(split[1])) {
                        String newProd = split[1];
                        products.remove(split[1]);
                        products.add(newProd);
                        break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (String item : products) {
            if (products.size() - 1 == products.indexOf(item)) {
                System.out.print(item + " ");
            } else {
                System.out.print(item + ", ");
            }
        }

    }
}
