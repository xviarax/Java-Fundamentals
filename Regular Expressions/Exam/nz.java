package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class nz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder password = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        String pass = password.toString();

        while (!command.equals("Complete")) {
            String[] commandData = command.split(" ");
            String commandName = commandData[0];

            switch (commandName) {
                case "Make":
                    String caps = commandData[1];
                    int index = Integer.parseInt(commandData[2]);
                    if (caps.equals("Upper")) {
                        char charToReplace = password.charAt(index);
                        charToReplace = Character.toUpperCase(charToReplace);
                        password.setCharAt(index, charToReplace);
                        System.out.println(password);


                    } else if (caps.equals("Lower")) {
                        char charToReplace = password.charAt(index);
                        charToReplace = Character.toLowerCase(charToReplace);
                        password.setCharAt(index, charToReplace);
                        System.out.println(password);

                    }

                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(commandData[1]);
                    String charToInsert = commandData[2];
                    char charInsert = charToInsert.charAt(0);
                    int lastIndex = password.length() - 1;
                    if (indexToInsert < 0 || indexToInsert > lastIndex) {
                        break;

                    } else {
                        password.insert(indexToInsert, charInsert);
                        System.out.println(password);
                    }
                    break;
                case "Replace":
                    char toReplace = commandData[1].charAt(0);
                    String replace = commandData[1];
                    int value = Integer.parseInt(commandData[2]);
                    int ascii = (int) toReplace;
                    int sum = ascii + value;
                    char newReplace = (char) sum;

                    if (password.toString().contains(replace)) {
                        while (password.toString().contains(replace)) {
                            String text = password.toString().replace(replace, String.valueOf(newReplace));
                            password.replace(0, password.length(), text);
                            System.out.println(password);
                        }

                    } else {
                        break;

                    }
                    break;
                case "Validation":
                    String regex1 = "[A-Za-z][A-Za-z0-9_]*$";
                    Pattern pattern1 = Pattern.compile(regex1);
                    Matcher matcher1 = pattern1.matcher(password);

                    String regex2 = "\\d+";
                    Pattern pattern2 = Pattern.compile(regex2);
                    Matcher matcher2 = pattern2.matcher(password);

                    if (password.length() < 8) {
                        System.out.println("Password must be at least 8 characters long!");
                    }  if (!matcher1.find()) {
                    System.out.println("Password must consist only of letters, digits and _!");

                }  if (!password.toString().chars().anyMatch(Character::isUpperCase)) {
                    System.out.println("Password must consist at least one uppercase letter!");
                }  if (!password.toString().chars().anyMatch(Character::isLowerCase)) {
                    System.out.println("Password must consist at least one lowercase letter!");
                }  if (!matcher2.find()) {
                    System.out.println("Password must consist at least one digit!");
                }
                    break;

                default:
                    break;
            }



            command = scanner.nextLine();
        }
    }

}


