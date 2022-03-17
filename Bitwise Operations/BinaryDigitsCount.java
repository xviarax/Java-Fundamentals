import java.util.Scanner;

public class BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int binarN = Integer.parseInt(scanner.nextLine());
        int count = 0;

        while (n!=0){
            int left = n % 2;
            if (left == binarN) {
                count ++;
            }
            n = n / 2;
        }
        System.out.println(count);
    }
}
