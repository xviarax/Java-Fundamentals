import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String rev = "";
        while (!input.equals("end")){
            for (int i = input.length()-1; i >= 0 ; i--) {
              rev = rev + input.charAt(i) + "";
            }
            System.out.println(input + " = " + rev);
            rev = "";
            input = scanner.nextLine();
        }
    }
}
