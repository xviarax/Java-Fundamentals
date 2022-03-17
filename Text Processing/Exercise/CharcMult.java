package Exercise;

import java.util.Scanner;

public class CharcMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" +");
        String first = input[0].trim();
        String second = input[1].trim();
        int sum = 0;

        for (int i = 0; i < Math.max(first.length(), second.length()); i++) {
            if(i < first.length() && i < second.length()){
                sum += first.charAt(i) * second.charAt(i);
            }else if(i < first.length()){
                sum += first.charAt(i);
            }else{
                sum += second.charAt(i);
            }
        }

        System.out.println(sum);
    }
}
