import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bann = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannW : bann) {
            if (text.contains(bannW)){
                // moje i tova  ---- String replacement = repeatStr("*", bannW.length());
                text = text.replace(bannW, "*".repeat(bannW.length()));
            }
        }
        System.out.println(text);


//    }
//    public  static String repeatStr ( String wor,int count) {
//        String[] repeatArr = new String[count];
//        for (int i = 0; i < count ; i++) {
//            repeatArr[i] = wor;
//        }
//        return String.join("", repeatArr);
    }
}
