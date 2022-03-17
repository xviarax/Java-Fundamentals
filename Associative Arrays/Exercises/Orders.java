package Exercises;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("en", "US"));

        String command = scanner.nextLine();

        Map<String, Double> price = new LinkedHashMap<>();
        Map<String, Integer> quantityy = new LinkedHashMap<>();

        while(!command.equals("buy")) {
            String product = command.split(" ")[0];
            double pricePerProduct = Double.parseDouble(command.split(" ")[1]);
            int quantity = Integer.parseInt(command.split(" ")[2]);

            price.put(product, pricePerProduct);

            if(!quantityy.containsKey(product)) {
                quantityy.put(product, quantity);
            } else {
                quantityy.put(product, quantityy.get(product) + quantity);
            }

            command = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : price.entrySet()) {
            String productName = entry.getKey();
            double finalSum = entry.getValue() * quantityy.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }


    }
}
