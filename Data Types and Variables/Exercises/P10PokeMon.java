package Exercises;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        int pokedtarget = 0;
        int valueCopy = N;

        while (N >= M) {
            N -= M;
             pokedtarget += 1;
            if (N == valueCopy * 0.5 && Y!=0) {

                    N = N/Y;


            }}
            System.out.println(N);
            System.out.println(pokedtarget);




}}
