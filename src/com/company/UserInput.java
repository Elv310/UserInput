package com.company;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where are you from?");
        String userInput1 = scanner.nextLine();
        System.out.println("Wow Id love to visit " + userInput1);

        System.out.println("How many kids do you have?");
        Byte userInput2 = scanner.nextByte();
        System.out.println("Must be great being a parent to " + userInput2 + " kids ");

        System.out.println(" Whats your age?");
        short userInput3 = scanner.nextShort();
        System.out.println(" Wow must be great being " + userInput3 + " years old");

        System.out.println("How many are there? ");
        int userInput4 = scanner.nextInt();
        System.out.println(userInput4 + " , I didnt know you had that much");

        System.out.println(" What did you get back in change?");
        float userInput5 = scanner.nextFloat();
        System.out.println(" Oh I see you got " + userInput5 + " back in change ");


        System.out.println(" there will be how many again? ");
        long userInput6 = scanner.nextLong();
        System.out.println(" great " + userInput6 + " is enough ");

        System.out.println("whats the computer reading? ");
        double userInput7 = scanner.nextDouble();
        System.out.println(" Alright " + userInput7 + " great ");


    }
}
