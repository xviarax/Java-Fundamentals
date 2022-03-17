package Exercise;

import java.util.Locale;
import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+\\t");
        double sum1 = 0;
        for (int i = 0; i < arr.length ; i++) {
            double sum = 0;
            String split = arr[i];
            char first = split.charAt(0);
            char sec = split.charAt(split.length()-1);
            StringBuilder sb = new StringBuilder(split);
            double num = Double.parseDouble((sb.deleteCharAt(0).deleteCharAt(sb.length()-1).toString()));
            if (Character.isLowerCase(split.charAt(0))){
                int position1 = (int)first - 96;
                //sum += num * position1;
                sum += num * position1;
            } else {
                int position2 = (int)first - 64;
                sum += num / position2;
            }
            if (Character.isLowerCase((sec))) {
                int position3 = (int)sec - 96;
                sum += position3;
            } else {
                int position4 = (int)sec - 64;
                sum -= position4;
            }
            sum1+=sum;
        }

        System.out.printf(Locale.US, "%.2f", sum1);
    }
}
