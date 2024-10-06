

/**
 * This class represents the category of desserts
 * @author Brandon Marquart 
 */
public class Dessert extends FoodItem {
   String catagory;

   /**
    * Default constructor 
    */
   public Dessert() {
      catagory = "Dessert";
   }

   /**
    * Constructor which allows user input 
    * @param name Name of the item
    * @param price Price of the item
    */
   public Dessert(String name, double price) {
      super(name, price);
      catagory = "Dessert";
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
    * @return String version of the object
    */
   @Override
   public String toString() {
      return super.toString() + " Category " + catagory;
   }
    
}
