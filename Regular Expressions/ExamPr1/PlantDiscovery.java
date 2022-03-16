package ExamPr1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> maps = new HashMap<>();
        String input = scanner.nextLine();
        Map<String, Double> mappie = new HashMap<>();
        double averageRating = 0;


        for (int i = 0; i < n ; i++) {
            String[] split =  input.split("<->");
           // maps.putIfAbsent(split[0], 0);
            mappie.putIfAbsent(split[0],0.0);
          //  if (maps.get(split[0]) > 0){
                maps.put(split[0], Integer.parseInt(split[1]));
          //  }

            input = scanner.nextLine();
        }

        while (!input.equals("Exhibition")){
            String[] split =  input.split(" ");

            if (!maps.containsKey(split[1])) {
                System.out.println("error");
            } else  {
            switch (split[0]){
                case "Rate:":
                    if (mappie.containsKey(split[1]) && mappie.get(split[1]) != 0) {
                        mappie.put(split[1], (Double.parseDouble(split[3]) + mappie.get(split[1]))/2);
                    } else {
                        mappie.put(split[1], Double.parseDouble(split[3]));
                    }
                    break;
                case "Update:":
                    maps.put(split[1], Integer.parseInt(split[3]));
                    break;
                case "Reset:":
                    mappie.put(split[1], 0.0);
                    break;
                default:
                    System.out.println("error");
            } }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        maps.entrySet().stream().sorted((p1,p2) -> { int result = p2.getValue() - p1.getValue();
            if (result == 0){
                double res = (mappie.get(p2.getKey()) - mappie.get(p1
                        .getKey()));
                return (int) res;
            }
            return result;
        })
                .forEach(entry -> {
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), mappie.get(entry.getKey()));
                });


    }
}
