package Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String , Integer> materials = new TreeMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        Map<String, Integer> junks = new TreeMap<>();
        boolean isOver = false;

        while (!isOver){
            String command = scanner.nextLine();
            String[] input = command.split(" ");
            for (int i = 0; i < input.length ; i+=2) {
                int n = Integer.parseInt(input[i]);
                String mater = input[i + 1].toLowerCase();
                if (mater.equals("shards") || mater.equals("fragments") || mater.equals("motes")){
                    materials.put(mater, n + materials.get(mater));
                    if (materials.get(mater) >= 250){
                        if (mater. equals("shards")){
                            System.out.println("Shadowmourne obtained!");
                        } else  if (mater.equals("fragments")){
                            System.out.println("Valanyr obtained!");
                        } else if (mater.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        materials.put(mater, materials.get(mater)-250);
                        isOver = true;
                        break;
                    }

                } else {
//                    junks.putIfAbsent(mater, n); // добавя САМО ако го НЯМА
                    if (!junks.containsKey(mater)){
                        junks.put(mater, n);
                   } else {
                        junks.put(mater, junks.get(mater)+n);
                    }
                }
            }
        }
        materials.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        junks.entrySet()
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

    }
}
