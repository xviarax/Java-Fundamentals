import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            List<String> split = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            switch (split.get(0)) {
                case "Contains":
                    int a = Integer.parseInt(split.get(1));
                    if (numList.contains(a)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String b = split.get(1);
                    if (b.equals("even")) {
                        for (int n : numList) {
                            if (n % 2 == 0) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    } else if (b.equals("odd")){
                        for (int n : numList) {
                            if (n % 2 == 1) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numList.size(); i++) {
                        sum = sum + numList.get(i);
                    }
                    System.out.println(sum);
                    break;
                    case "Filter":
                    String d = split.get(1);
                    int e = Integer.parseInt(split.get(2));
                    if (d.equals("<")) {
                        for (int n : numList) {
                            if (n < e) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    } else  if (d.equals(">")) {
                        for (int n : numList) {
                            if (n > e) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    } else  if (d.equals(">=")) {
                        for (int n : numList) {
                            if (n >= e) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    } else  if (d.equals("<=")) {
                        for (int n : numList) {
                            if (n <= e) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
            command = scanner.nextLine();

        }


    }
}
