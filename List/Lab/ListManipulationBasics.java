import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         List<Integer> numList = Arrays
                         .stream(scanner.nextLine().split(" "))
                         .map(Integer::parseInt)
                         .collect(Collectors.toList());
        String command = scanner.nextLine();
        String[] split = command.split( " ");


         while (!command.equals("end")){
             switch (split[0]){
                 case "Add":
                     int a = Integer.parseInt(split[1]);
                     numList.add(a);
                     break;
                 case "Remove":
                     int b = Integer.parseInt(split[1]);
                     numList.remove(Integer.valueOf(b));
                     break;
                 case "RemoveAt":
                     int c = Integer.parseInt(split[1]);
                     numList.remove(c);
                     break;
                 case "Insert":
                     int d = Integer.parseInt(split[1]);
                     int e = Integer.parseInt(split[2]);
                     numList.add(e,d);
                     break;

             }
             command = scanner.nextLine();
            split = command.split( " ");
         }

        for (int n: numList) {
            System.out.print(n + " ");
        }


    }
}
