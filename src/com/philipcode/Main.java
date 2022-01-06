package com.philipcode;

import java.util.Scanner;

public class Main {
    public static String cat_name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GPS gps = new GPS();

        System.out.println("Welcome to \"See My Cat\"");

        //Cat's Name
        System.out.println("What is your cat name? ");
        String cat_name = sc.nextLine();

        System.out.println(cat_name + "? that name is so sweet:)");

        // Users Name
        System.out.println("Now, What is your name? ");
        String users_name = sc.nextLine();

        System.out.println("Hi " + users_name + " let's take care of " + cat_name+ " together!");

        // Maximum distance
        System.out.println("Is there worry distance for " + cat_name + "?");
        gps.maximum_distance(sc.nextInt());

        System.out.println(cat_name + " current location");
        gps.warning_distance(sc.nextInt());


    }
}
