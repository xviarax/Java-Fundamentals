package Exercises;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte fi = scanner.nextByte();
        byte s = scanner.nextByte();
        byte t = scanner.nextByte();
        byte f = scanner.nextByte();

        int result = ((fi+s)/t) * f;
        System.out.println(result);
    }
}
