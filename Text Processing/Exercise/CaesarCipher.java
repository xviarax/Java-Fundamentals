package Exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder encr = new StringBuilder();

        for (char sym : text.toCharArray()) {
            char newsym = (char) (sym + 3);
           // encr += newsym; със Стринг Билдер нещата се случват по-бързо
            encr.append(newsym);
        }
        System.out.println(encr);
    }
}
