import java.util.Locale;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());


        System.out.printf(Locale.US,"Name: %s, Age: %d, Grade: %.2f", name,age,grade);
    }
}