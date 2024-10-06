

/**
 * This class represents the category of Main dishes
 * @author Brandon Marquart
 */
public class MainDish extends FoodItem {
   String catagory;
   
   /**
    * Default constructor
    */
   public MainDish() {
      catagory = "Main Dish";
   }

   /**
    * Constructor which allows for user input
    * @param name Name of the item
    * @param price Price of the item
    */
   public MainDish(String name, double price) {
      super(name, price);
      catagory = "Main Dish";
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
   
   

