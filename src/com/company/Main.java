package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String question = "Name the biggest country in the world";
        String choiceOne = "china";
        String choiceTwo = "canada";
        String choiceThree = "russia";

        System.out.println(question + " : ");
        System.out.println("1- " + choiceOne);
        System.out.println("2- " + choiceTwo);
        System.out.println("3- " + choiceThree);

        Scanner scanner = new Scanner(System.in);

        boolean answer = true;


        while (answer) {
            String input = scanner.next();
            if (input.equals(choiceThree.toLowerCase())) {
                answer = false;
            }
        }
        System.out.println("Congrats! You answer is correct.");
    }
}
