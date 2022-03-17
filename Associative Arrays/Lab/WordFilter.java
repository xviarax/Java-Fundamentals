import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fruits = Arrays.stream(scanner.nextLine().split(" "))
                .filter(e -> e.length() % 2 == 0) // всели стринг елемент..
                .toArray(String[] :: new);
        System.out.println(String.join(System.lineSeparator(), fruits));
    }
}
