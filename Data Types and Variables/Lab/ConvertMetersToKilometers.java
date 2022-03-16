import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int met = Integer.parseInt(scanner.nextLine());
        double k = met / 1000.0;
        System.out.printf("%.2f", k);





    }
}
