package ExamPr2;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encr = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        while (!input.equals("Decode")){
            String[] splittie = input.split("\\|");
            switch (splittie[0]) {
                case "Move":
                    int index = Integer.parseInt(splittie[1]);
                    String first = encr.substring(0, index);
                    String sec = encr.substring(index, encr.length());
                    encr = sec + "" + first;
                    break;
                case "Insert":
                    int index1 = Integer.parseInt(splittie[1]);
                    String fir = encr.substring(0,index1);
                    String second = encr.substring(index1,encr.length());
                    encr = fir + splittie[2] + "" + second;
                    break;
               case "ChangeAll":
                   String replacement = splittie[2];
                   encr = encr.replace(splittie[1], replacement);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.print("The decrypted message is: " + encr);

    }
}
