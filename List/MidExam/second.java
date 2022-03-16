package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class second {
    public static void main(String[] args) {
        //Numbers
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()); // 9 4 5 19
        String command = scanner.nextLine(); // "Add 1"

        while (!command.equals("Finish")) {
            List<String> split = Arrays.stream(command.split(" "))
                                .collect(Collectors.toList());   // "Add" , "1" ....

            switch (split.get(0)) {
                case "Add":
                    int a = Integer.parseInt(split.get(1));
                    numList.add(a);
                    break;
                case "Remove":
                    int b = Integer.parseInt(split.get(1));
                    numList.remove(Integer.valueOf(b));
                    break;
                case "Replace":
                    int value = Integer.parseInt(split.get(1));
                    int replace = Integer.parseInt(split.get(2));
                    numList.set(numList.indexOf(value), replace);
// Понеже използваме лист, лесно с функцията му set ще заместим value с replace, масивите нямат такава и правиш излишен for cycle


                    break;
                case "Collapse":
                    int value1 = Integer.parseInt(split.get(1));
                    for (int i = 0; i <= numList.size()-1 ; i++) { // в твоя код тук сте писали:
                        // (int i = numbers.size ; i >= 0 ; i--)     ---- тук трябва да знаеш, че numbers.size е 4
                                                                    // а листа започва от нула, 4 не съществува като индекс
                        // също това >= е излишно, numbers.size така или иначе е по-голямо от нула и ще върти до нула този цикъл
                        if (numList.get(i) < value1) { // проверява всяко от числата 9 4 5 19 дали е по-малко от примерно от 8
                            numList.remove(i);// махаме числото 4, примерно, защото е по-малко от 8

                            i-=1; // тук е важно да махнеш от i единица понеже да речем, че i=1 и махне числото, което
                            // проверяваме горе дали е по-малко(4), така листа ако е 9 4 5 19 --> 9 5 19, обаче i=1 тоест ще махне числото 4, но
                            // с махането на числото отива горе да се завърти пак цикъла и ще стане i=2 понеже цикъла си продължава, така ще хванеш индекс 2 от листа
                            // индексите са 0 1 2 3 отговарящи на числата 9 4 5 19, обаче махаме 4
                            // индексите стават 0 1 2 --> 9 5 19, no i=2,така втория индекс е 19, и е пропуснало числото 5
                            // затова пишеш i-=1 и то става i=1 проверява 5 дали е < 8 и го махаш така пак ще намалиш i с 1
                            // за да види и 19 дали е по-малко

                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }


        for (int item:numList) {
            System.out.print(item + " ");
        }
    }
}
