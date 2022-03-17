import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder lb = new StringBuilder();
        StringBuilder otherb = new StringBuilder();

        for (int i = 0; i <  text.length(); i++) {
            char sym = text.charAt(i);
            if (Character.isDigit(sym)){
                sb.append(sym);
            } else if (Character.isLetter(sym)){
                lb.append(sym);
            } else {
                otherb.append(sym);
            }
        }
        System.out.println(sb);
        System.out.println(lb);
        System.out.println(otherb);
    }
}
