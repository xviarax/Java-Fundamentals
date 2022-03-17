package Exercise;

import java.io.File;
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\\\");
        String twoThings = arr[arr.length-1];
        String[] all = twoThings.split("\\.");

        System.out.printf("File name: %s%nFile extension: %s", all[0], all[1] );
    }
}
