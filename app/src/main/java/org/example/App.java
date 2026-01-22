package org.example;

public class App {
  public static void main(String[] args ) {
    Converter converter = new Converter();
    System.out.println("Welcome to the Terribly Weighty Subject!");
    int ounces = 56;
    System.out.println("Testing converter with " + ounces + " ounces.\n");
    System.out.println(ounces + " oz is equivalent to " + converter.toPoundsAndOunces(ounces) + ".");
    System.out.println(ounces + " oz is equivalent to " + converter.toPounds(ounces) + ".\n");
    System.out.println("Thank you Goodbye!");
  }
}
