package MoreEx;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=N ; i++) {
            double f = Double.parseDouble(scanner.next());
            double s = Double.parseDouble(scanner.next());
            int sum = 0;

            if (f > s){
                double numFirst = Math.abs(f);
                while (numFirst > 0) {
                    sum += (numFirst % 10);
                    numFirst /= 10;
                }} else {
                double numSecond = Math.abs(s);
                while (numSecond > 0) {
                    sum += (numSecond % 10);
                    numSecond /= 10;
                }
            }
            System.out.println(Math.abs(sum));





        }



    }
}
