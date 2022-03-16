package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String[] split = scanner.nextLine().split("\\s+");
        String bombNumber = split[0];
        int power = Integer.parseInt(split[1]);

        while (elements.contains(bombNumber)){
            int elementIndex = elements.indexOf(bombNumber);

            int left = Math.max(0, elementIndex - power);
            int right = Math.min( elementIndex + power, elements.size() - 1);

            for (int i = right; i >= left; i--) {
                elements.remove(i);

            }
        }
        System.out.println(elements.stream().mapToInt(Integer::parseInt).sum());
    }
}