package Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        Map<String, Integer> racers = new LinkedHashMap<>();
        names.forEach(racer -> racers.put(racer, 0));
        String regexName = "[A-Za-z]+";
        Pattern pattern = Pattern.compile(regexName);

        String regexNum = "[0-9]";
        Pattern patter = Pattern.compile(regexNum);


        while (!input.equals("end of race")) {
            StringBuilder sb = new StringBuilder();
            Matcher mach = pattern.matcher(input);
                while (mach.find()){
                    sb.append(mach.group());
                }
                Matcher macher = patter.matcher(input);
                int distance = 0;
                while (macher.find()){
                   distance+=Integer.parseInt(macher.group());
                }
                if (racers.containsKey(sb.toString())) {
                    racers.put(sb.toString(), distance + racers.get(sb.toString()));
                }
                    input = scanner.nextLine();
        }
               List<String> firstThree =  racers.entrySet().stream()
                       .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                       .limit(3)
                       .map(entry -> entry.getKey())
                       .collect(Collectors.toList());

        System.out.printf("1st place: %s%n", firstThree.get(0));
        System.out.printf("2nd place: %s%n", firstThree.get(1));
        System.out.printf("3rd place: %s%n", firstThree.get(2));

    }
}
