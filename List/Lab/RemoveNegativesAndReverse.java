import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        for (int i = 0; i <= numList.size()-1; i++) {
            int n = numList.get(i);
            if (n < 0) {
                numList.remove(i);
                i -= 1;
            }
        }
        if (numList.size() > 0){
        for (int i = numList.size()-1; i >= 0 ; i--) {
            System.out.print(numList.get(i) + " ");
        }}else {
            System.out.println("empty");
        }


    }
}
