package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class third {
    public static void main(String[] args) {
        // deck of cards
        Scanner scanner = new Scanner(System.in);
        List<String> cards = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();

                List<String> split = Arrays.stream(command.split(", ")).collect(Collectors.toList());

                switch (split.get(0)) {
                    case "Add":
                        String cardName =(split.get(1));
                        if (cards.contains(cardName)) {
                            System.out.println("Card is already in the deck");
                            break;
                        } else {
                        cards.add(cardName);
                        System.out.println("Card successfully added");
                        }
                        break;

                    case "Remove":
                        //if (!split.get(1).equals("At")) {
                            String cardName2 = (split.get(1));
                            if (cards.contains(cardName2)) {
                                cards.remove(cardName2);
                                System.out.println("Card successfully removed");
                            } else {
                                System.out.println("Card not found");
                                break;
                            }
                            break;
                    case "Remove At":
                        int c = Integer.parseInt(split.get(1));
                        if (c >= 0 && c <= cards.size()-1) {
                        cards.remove(c);
                            System.out.println("Card successfully removed");
                        break;
                        } else {
                            System.out.println("Index out of range");
                        }
                        break;
                    case "Insert":
                        int index = Integer.parseInt(split.get(1));
                        if (index >=0 && index <= cards.size()-1) {
                            String cardName3 = (split.get(2));
                            if (!cards.contains(cardName3)){
                                cards.add(index, cardName3);

                            System.out.println("Card successfully added");

                            break;
                            } else {
                                System.out.println("Card is already added");
                                break;
                            }
                        } else {
                            System.out.println("Index out of range");
                        }
                        break;
                }
            }

        for (String item : cards) {
            if (cards.size() - 1 == cards.indexOf(item)) {
                System.out.print(item + " ");
            } else {
                System.out.print(item + ", ");
            }
        }
        }
    }

