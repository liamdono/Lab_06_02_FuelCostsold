import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println("Gas amount.");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many galons of gas are in your tank? ");
        float inTheTank = keyboard.nextFloat();

        System.out.print("How many miles per gallon does your car get ");
        int mpg = keyboard.nextInt();

        System.out.print("What is the cost for a gallon of gas ");
        float gasPrice = keyboard.nextFloat();



        System.out.println("With gas at $" + gasPrice + " per gallon, going 100 miles will cost you $" + (gasPrice * 100) );

        System.out.println("Since your car's efficiency is " + mpg + " mpg and given that you have " +  inTheTank + " gallons in the tank, by my calculations you can go " + (int)(mpg * inTheTank) + " miles before you run out of gas.");


    }
}
