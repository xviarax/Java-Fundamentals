package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        List<Integer> secondList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int firstPlayerCard = 0;
        int secondPlayerCard = 0;
        int sumOne = 0;
        int sumTwo = 0;

        while (firstList.size() != 0 && secondList.size() != 0) {
            firstPlayerCard = firstList.get(0);
            secondPlayerCard = secondList.get(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstList.add(firstPlayerCard);
                firstList.add(secondPlayerCard);
                secondList.remove(0);
                firstList.remove(0);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondList.add(secondPlayerCard);
                secondList.add(firstPlayerCard);
                firstList.remove(0);
                secondList.remove(0);
            } else if (secondPlayerCard == firstPlayerCard){
                firstList.remove(0);
                secondList.remove(0);
            }
        }
        if (firstList.size() == 0) {
            for (int n : secondList) {
                sumTwo += n;
            }
            System.out.printf("Second player wins! Sum: %d", sumTwo);
        } else if (secondList.size() == 0) {
            for (int n : firstList) {
                sumOne += n;
            }
            System.out.printf("First player wins! Sum: %d", sumOne);
        }


    }
}

