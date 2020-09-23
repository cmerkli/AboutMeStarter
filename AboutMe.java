/*
 * Programmer:
 * Date:
 * Purpose:
 */

public class AboutMe {
    public static void main (String [] args) {
        // Declaring the variables
        String myName = "Cyntia Merkli.";
        int myAge = 16;
        double myHeightInMetres = 1.60;

        // Print the values
        System.out.println("Hi, my name is " + myName);
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");

        // Change the variables
        myAge = 22;
        myHeightInMetres = 1.64;

        // Print the new values
        System.out.println("Some time passes...");
        System.out.println("I am now " + myAge + " years old.");
        System.out.println("I have grown and I am " + myHeightInMetres + " m tall.");
    }
}
