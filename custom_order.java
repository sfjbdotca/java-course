// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
    //  System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	  
	Scanner keyboard = new Scanner (System.in);
	String firstName;
	String itemOrder;
	String frostingType;
	String fillingType;
	String toppings;
	String input;
	
	double cost = 15.00;
	final double TAX_RATE = .08;
	double tax;
	
	System.out.println("Welcome to Java's Cake & Cupcake Cafe");
	System.out.println("We make custom cakes and Cupcakes");

	 
    // Introduce shop and prompt user to input first name
      

	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   
   System.out.print("What's your name?");
   firstName = keyboard.nextLine();
   
   System.out.print(firstName + ", please see our menu.");
   System.out.print("\n");
	  
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

	System.out.println("_____________________________________");
	System.out.println("Menu              Quantity Base Cost");
    System.out.println("_____________________________________");  
	System.out.println("Cake                       1    $15");
	System.out.println("Set of Cupcakes   6             $15");
	System.out.println("-------------------------------------");
	System.out.println("Frostings (vanilla, chocolate)");
	System.out.println("Fillings (mocha, mint, lemon)");
	System.out.println("Toppings (sprinkles, cinnamon, cocoa)");
	System.out.println("_____________________________________");
	
    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

    System.out.println("Do you want cupcakes or cake?");
	itemOrder = keyboard.nextLine();
	
    
	  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

    System.out.println("What type of FROSTING do you want?");
	System.out.println("Vanilla, Chocolate");
	frostingType = keyboard.nextLine();
	 
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING

	System.out.println("What type of FILLING do you want?");
	System.out.println("Mocha, Mint, Lemon");
	fillingType = keyboard.nextLine();
	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS

	System.out.println("What type of TOPPINGS do you want?");
	System.out.println("Sprinkles, Cinnamon, Cocoa");
	toppings = keyboard.nextLine();
	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION

	System.out.println("\n\n");
	System.out.println(firstName + ", You ordered " + itemOrder + " with " 
	+ frostingType + " frosting, " + fillingType + " filling and " +
	toppings + " toppings.");
      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
    
	System.out.printf("The cost of your order is : $%.2f\n", cost);
	tax = cost * TAX_RATE;
	System.out.printf("The tax is: $%.2f\n", tax);
	System.out.printf("The total due is $%.2f\n", (tax + cost));
	
	
	
    }   
}