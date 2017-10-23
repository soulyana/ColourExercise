package me.aoa4eva;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* This application creates an array list of colours.
         Modify it to do the following:
         1. Change the for loop into an enhanced for loop
         2. Put the menu in a loop, so that you can add as many colours as you want
         3. Write a method to print all the colours in the array list
         */

        int option=0;
        Scanner keyboard = new Scanner(System.in);
        ArrayList <String> colours = new ArrayList<String>();
        String enterColour="";

        colours.add("blue");
        colours.add("red");
        colours.add("green");
        colours.add("mauve");

        System.out.println("1. Add a colour");
        System.out.println("2. Delete a colour ");
        System.out.println("3. Show the colour list");
        System.out.println("4. Quit");
        System.out.println("Enter a number to select a menu option:");
        option = keyboard.nextInt();
        keyboard.nextLine();

        if(option==1)
        {
            System.out.println("Enter the colour to add to the arraylist of colours");
            enterColour=keyboard.nextLine();
            colours.add(enterColour);
            System.out.println(colours.get(colours.indexOf(enterColour)));

        }

        if(option==2)
        {
            System.out.println("Enter the colour to delete from the arraylist of colours:");
            enterColour=keyboard.nextLine().toLowerCase();;
            if(colours.contains(enterColour))
                colours.remove(enterColour);
            else
                System.out.println("Unable to find that colour");
        }



        if(option==3)
        {
            for(int counter=0; counter<colours.size(); counter++)
            {
                System.out.println(colours.get(counter));
            }
        }




    }

}
