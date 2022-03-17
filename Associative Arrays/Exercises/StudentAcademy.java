package Exercises;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> maps = new LinkedHashMap<>();

        for (int i = 0; i < countStudents; i++) {
            String nameSt = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!maps.containsKey(nameSt)) {
                maps.put(nameSt, new ArrayList<>());
            }
            maps.get(nameSt).add(grade);
        }

        Map<String, Double> averGrade = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : maps.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade (grades);
            if(averageGrade >= 4.50) {
                averGrade.put(studentName, averageGrade);
            }
        }
        averGrade.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade(List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades) {
            sumGrades += grade;
        }
        return sumGrades / grades.size();




    }
}
