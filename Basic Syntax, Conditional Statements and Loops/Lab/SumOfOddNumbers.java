import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n*n ; i++) {
            if (i % 2 == 1) {
                sum += i;
                System.out.println(i);
                if (sum == n*n) {
                    break;
                }
            }}
        System.out.printf("Sum: %d", sum);


    }
}