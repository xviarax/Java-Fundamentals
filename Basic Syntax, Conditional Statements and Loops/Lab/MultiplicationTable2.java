import java.util.Scanner;
class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        if (m <= 10){

            for (int i = m; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n",n,i,n*i);
            }
        } else {
            System.out.printf("%d X %d = %d", n,m,n*m);
        }
    }
}
