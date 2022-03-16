import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        for (int i = 0; i < numList.size() - 1 ; i++) {
            int firstNum = numList.get(i);
            int lastNum = numList.get(numList.size()-1);

            numList.set(i, firstNum+lastNum);
            numList.remove(numList.size()-1);
        }
        for (int num : numList){
            System.out.print(num + " ");
        }
    }
}
