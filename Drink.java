
/**
 * This class represents the category of Drinks
 * @author Brandon Marquart
 */
public class Drink extends FoodItem {
   String catagory;

   /**
    * Default constructor
    */
   public Drink() {
      catagory = "Drink";
   }

   /**
    * Constructor which allows user input
    * @param name Name of the item
    * @param price Price of the item
    */
   public Drink(String name, double price) {
      super(name, price);
      catagory = "Drink";
   }
   
   @Override
   public String getName() {
      return super.getName();
   }
   
   @Override
   public void setName(String newName) {
      super.setName(newName);
   }

   @Override
   public void setPrice(double newPrice) {
      super.setPrice(newPrice);
   }
   
   /**
    * Formats the object into a string
    * @return String version of object
    */
   @Override
   public String toString() {
      return super.toString() + " Category " + catagory;
   }
   
}
   
   