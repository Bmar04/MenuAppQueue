
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author Brandon Marquart
 * @version 1.0
 * @date 3/18/2024
 * 
 * A basic application to take users orders and process them using a queue
 */
public class orderApp {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      boolean exit = false;
      boolean exitOrder = false;
      int orderSize = 0;
      int orderNumber = 1;
      String customer;
      Calendar orderDate = Calendar.getInstance();
      char userIn = 'z';
      System.out.println("Order Application Welcome");
      
      //Creates a new queue called orders 
      MyQueue orders = new MyQueue();
      
      while (!exit) {
         System.out.println("Welcome to the order taking application please select an option below");
         System.out.println("A - Add an order");
         System.out.println("B - Process order");
         System.out.println("C - Display order");
         System.out.println("D - Exit the program");
         
         userIn = scnr.next().charAt(0);
         
         switch (Character.toLowerCase(userIn)) {
            case 'a':
               //Resetting order size
               orderSize = 0;
               //Resetting exitOrder loop.
               exitOrder = false;
               System.out.println("");
               System.out.println("Enter customer name");
               scnr.nextLine();
               customer = scnr.nextLine();
               System.out.println("To add an order please select what food for the order");
               //Creating array to be pushed to order.
               Order orderItems = new Order(orderNumber,customer,orderDate);
               while (!exitOrder){
                  try {
                     orderItems.addFoodItem(addItem(scnr));
                  } catch (InputMismatchException imException) {
                     System.out.println("Invalid input");
                  }
                  
                  System.out.println("Would you like to add another item Y/N");
                  userIn = scnr.next().charAt(0);
                  //checks if the program should exit
                  if (Character.toLowerCase(userIn) == 'n') {
                     exitOrder = true;
                  }
                  if (orderSize == 3){
                     exitOrder = true;
                     System.out.println("Order is full max of three items.");
                  }
               }
               //adds the order to the queue
               orders.EnQueue(orderItems);
               orderNumber++;
               System.out.println("Order has been added to the queue");
               System.out.println("");
               break;
               
            //Process the first order in the queue
            case 'b':
               System.out.println("");
               System.out.println("Processing the first order");         
               System.out.println(orders.DeQueue());
               System.out.println("");
               break;
               
            //Displays all orders in the queue
            case 'c':
               System.out.println("");
               System.out.println("Displaying orders");
               orders.printQueue();
               break;
               
           //Exits the program
            case 'd':
               System.out.println("");
               System.out.println("Program stopping");
               exit = true;
         }
      }
   }
   
   /**
    * This method is used to find the information of a new item to add to the stack
    * @param scnr A Scanner used for user input
    * @return A item of type FoodItem with the respective category.
    */
   public static FoodItem addItem(Scanner scnr) {
      char userIn = 'z';
      String name;
      double price;
      
      System.out.println("Please enter what kinda of item you would like to add");
      System.out.println("A - Appetizer");
      System.out.println("B - Main Dish");
      System.out.println("C - Drink");
      System.out.println("D - Dessert");
      
      //takes the users input
      userIn = scnr.next().charAt(0);
      System.out.println("Enter a name for the item");
      scnr.nextLine();
      name = scnr.nextLine();
      System.out.println("Enter a price for the item");
      price = scnr.nextDouble();
      
      //switch to see which kind of item to add to the stack
      switch (Character.toLowerCase(userIn)) {
         
         case 'a' -> {
            return new Appetizer(name, price);
         }
         
         case 'b' -> {
            return new MainDish(name, price);
         }
         
         case 'c' -> {
            return new Drink(name, price);
         }
         
         case 'd' -> {
            return new Dessert(name, price);
         }
         
         //Makes sure the input is valid
         default -> {
            throw new InputMismatchException("Invalid input");
         }
      }
      
   }
   
}
