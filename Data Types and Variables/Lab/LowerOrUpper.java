import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        if (a.equals(a.toUpperCase())) {
            System.out.println("upper-case");
        }
        if (a.equals(a.toLowerCase())) {
            System.out.println("lower-case");
        }
    }
}
