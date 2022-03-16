import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine()) + 30;

        if (min > 59) {
            hours += 1;
            min -= 60;
        }
        if (hours > 23) {
            hours = 0;
        }
        if (min < 10) {
            System.out.printf("%d:0%d%n", hours, min);
        } else {
            System.out.printf("%d:%d%n", hours,min);
        }

    }
}

