import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split(" ");

        for (int i = 0; i < arr.length ; i++) {
            String curr = arr[i];
            for (int j = 0; j < curr.length() ; j++) {
                System.out.print(curr);
            }
        }


    }
}
