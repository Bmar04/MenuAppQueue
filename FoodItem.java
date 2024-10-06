

/**
 * The primary FoodItem class
 * @author Brandon Marquart
 */

public class FoodItem {
   private String name;
   private double price;

   /**
    * Default constructor
    */
   public FoodItem(){
      this.name = null;
      this.price = 0.0;
   }
   
   /**
    * Constructor which allows input
    * @param name Name of the item
    * @param price Price of the item
    */
   public FoodItem(String name, double price) {
      this.name = name;
      this.price = price;
   }

   /**
    * Returns the name of the item
    * @return name: the name of the item
    */
   public String getName() {
      return name;
   }

   /**
    * Returns the price of the item
    * @return price: the price of the item
    */
   public double getPrice() {
      return price;
   }

   /**
    * This method sets a new name for the object
    * @param name The new string to set to name
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * This Method sets a new price for the object
    * @param price The new double to set the price
    */
   public void setPrice(double price) {
      this.price = price;
   }
   
   /**
    * Formats the item into a string
    * @return String object
    */
   @Override
   public String toString() {
      return "Name: " + name + " Price: $" + price;
   }

   
   
   
         
   
   
   
}
