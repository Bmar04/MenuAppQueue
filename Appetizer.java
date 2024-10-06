

/**
 * This class represents the appetizers
 * @author Brandon Marquart
 */
public class Appetizer extends FoodItem {
   String category;

   
   /**
    * Constructor which allows user input
    * @param name the name of the item
    * @param price the price of the item 
    */
   public Appetizer(String name, double price) {
      super(name, price);
      category = "Appetizer";
   }

   /**
    * Returns the category
    * @return category: Returns the category
    */
   public String getCategory() {
      return category;
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
      return super.toString() + " Category " + category;
   }
   
}
