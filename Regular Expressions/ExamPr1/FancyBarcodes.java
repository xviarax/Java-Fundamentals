package ExamPr1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+(?<name>[A-Z][A-Za-z0-9]{4,})[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;

        for (int i = 0; i < n ; i++) {
            String input = scanner.nextLine();
            matcher = pattern.matcher(input);

            if (matcher.find()) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < input.length() ; j++) {
                    char sym = input.charAt(j);
                    if (Character.isDigit(sym)){
                        sb.append(sym);
                    }
                }
                if (sb.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + sb);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
