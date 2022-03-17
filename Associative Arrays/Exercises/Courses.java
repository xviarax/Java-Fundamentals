package Exercises;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();
        while(!input.equals("end")) {
            String courseName = input.split(" : ")[0];
            String personName = input.split(" : ")[1];

            if(!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }
            courses.get(courseName).add(personName);

            input = scanner.nextLine();
        }
        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));
                });
    }
}


