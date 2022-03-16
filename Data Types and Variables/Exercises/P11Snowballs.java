package Exercises;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        double maxV = Double.MIN_VALUE;
        int highS = 0;
        int highT = 0;
        int highQ = 0;

        for (int i = 1; i <=N ; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            double value = Math.pow(snow/time, quality);
            if (value > maxV) {
                maxV = value;
                highS = snow;
                highT = time;
                highQ = quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", highS, highT, maxV, highQ);
    }
}
