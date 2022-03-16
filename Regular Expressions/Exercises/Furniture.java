package Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listt = new ArrayList<>();
        String input = scanner.nextLine();
        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quan>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        double totalPr = 0;

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                double price = Double.parseDouble(matcher.group("price").toString()) * Integer.parseInt(matcher.group("quan").toString());
                listt.add(matcher.group("name"));
                totalPr += price;
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String s : listt) {
            System.out.println(s);
        }

        System.out.printf(Locale.US, "Total money spend: %.2f", totalPr);

    }
}
