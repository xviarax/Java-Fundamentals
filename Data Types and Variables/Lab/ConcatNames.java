import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nf = scanner.nextLine();
        String ns = scanner.nextLine();
        String delimeter = scanner.nextLine();

        System.out.printf("%s%s%s", nf,delimeter,ns);


    }
}
