import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length, width, height = 0;
        length = Double.parseDouble(scanner.nextLine());
        System.out.print("Length: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        height = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");

        double volume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f",volume);

    }
}
