import java.util.Scanner;
class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        while(true) {

            if (n % 2 ==0) {
                System.out.printf("The number is: %d%n",Math.abs(n));
                break;
            } else {

                System.out.println("Please write an even number.");
                n = Integer.parseInt(scanner.nextLine());
            }


        }

    }
}