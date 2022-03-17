import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fir = scanner.nextLine();
        String sec = scanner.nextLine();

        int index = sec.indexOf(fir);
        while (index != -1) {
          sec =  sec.replace(fir, "");
           index = sec.indexOf(fir);
        }
        System.out.println(sec);

    }
}
