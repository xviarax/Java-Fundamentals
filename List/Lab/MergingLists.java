import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> numListTwo = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();

        int minSize = Math.min(numList.size(), numListTwo.size());


        for (int i = 0; i < minSize; i++) {
           int firstNum = numList.get(i);
           int secondNum = numListTwo.get(i);

           resultList.add(firstNum);
           resultList.add(secondNum);
        }
        if (numList.size() > numListTwo.size()) {
            resultList.addAll(numList.subList(numListTwo.size(),numList.size()));
        } else  {
            resultList.addAll(numListTwo.subList(numList.size(),numListTwo.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]",""));
    }
}
