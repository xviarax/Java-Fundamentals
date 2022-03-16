package MoreEx;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Queue<Integer> numbers = new LinkedList<>();
        Queue<Character> nonNumbers = new LinkedList<>();
        int textInitialLength = string.length();
        for (int i = 0; i < textInitialLength; i++) {
            char ch = string.charAt(i);
            if (Character.isDigit(string.charAt(i))) {
                numbers.offer(Character.getNumericValue(ch));
            } else {
                nonNumbers.offer(string.charAt(i));
            }
        }

        Queue<Integer> takeList = new LinkedList<>();
        Queue<Integer> skipList = new LinkedList<>();
        while (numbers.size() > 0) {
            takeList.offer(numbers.poll());
            skipList.offer(numbers.poll());
        }
        String result = "";

        while (takeList.size() > 0 && skipList.size() > 0) {
            int takeChars = takeList.poll();
            int skipChars = skipList.poll();
            result += take(nonNumbers, takeChars);
            skip(nonNumbers, skipChars);
        }
        System.out.println(result);
    }

    private static String take(Queue<Character> chars, int countChars) {
        String result = "";
        for (int i = 0; i < countChars; i++) {
            result += chars.poll();
        }
        return result;
    }

    private static Queue<Character> skip(Queue<Character> chars, int skipCount) {
        int q = 0;
        while (q < skipCount) {
            chars.poll();
            q++;
        }
        return chars;
    }
}
