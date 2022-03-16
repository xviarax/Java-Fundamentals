package ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MuOnline2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rooms = scanner.nextLine().split("\\|");
        int health = 100;
        int bitcoins = 0;


        for (int i = 0; i <= rooms.length - 1; i++) {
            String room = rooms[i];
            String[] split = room.split(" ");
            switch (split[0]) {
                case "potion":
                    int health3 = health;
                    health += Integer.parseInt(split[1]);
                    if (health > 100) {
                        int health2 = (100 - health3);
                        System.out.printf("You healed for %d hp.%n", health2);
                        health = 100;
                        System.out.printf("Current health: %d hp.%n", health);
                        break;
                    }
                    System.out.printf("You healed for %d hp.%n", Integer.parseInt(split[1]));
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoins += Integer.parseInt(split[1]);
                    System.out.printf("You found %d bitcoins.%n", Integer.parseInt(split[1]));
                    break;
                default:
                    health -= Integer.parseInt(split[1]);
                    if (health <= 0) {
                        System.out.printf("You died! Killed by %s.%n", split[0]);
                        System.out.printf("Best room: %d%n", i+1);
                        return;
                    } else {
                        System.out.printf("You slayed %s.%n", split[0]);
                    }
                    break;

            }

        }
        if (health > 0 ) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }


    }
}
