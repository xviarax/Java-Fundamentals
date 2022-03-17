package Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger integ = new BigInteger(scanner.nextLine());
        BigInteger sec = new BigInteger(scanner.nextLine());

        System.out.println(integ.multiply(sec));
    }
}
