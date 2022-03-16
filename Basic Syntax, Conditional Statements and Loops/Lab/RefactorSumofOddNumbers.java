import java.util.Scanner;

public class RefactorSumofOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(number);
            sum +=  number;
            number += 2;
        }
        System.out.printf("Sum: %d%n", sum);

    }
}