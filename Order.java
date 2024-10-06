
import java.util.Calendar;


/**
 *
 * @author Brandon Marquart
 * @version 1.0
 * @date 3/18/2024
 * 
 * This class is a representation of a food order with multiple different menu items.
 */
public class Order {
   private final int MAX_SIZE = 10; 
   private int orderNum;
   private double orderTotalPrice;
   private int size; 
   private FoodItem[] food = new FoodItem[MAX_SIZE];
   private String customer;
   private Calendar orderDate;

   public Order(){
      orderNum = 0;
      orderTotalPrice = 0.0;
      customer = null;
      orderDate = null;
      size = 0;
   }
   
   public Order(int orderNum, String customer, Calendar orderDate) {
      this.orderNum = orderNum;
      this.customer = customer;
      this.orderDate = orderDate;
      this.size = 0;
   }

   public Calendar getOrderDate() {
      return orderDate;
   }

   public int getMAX_SIZE() {
      return MAX_SIZE;
   }

   public int getOrderNum() {
      return orderNum;
   }

   public double getOrderTotalPrice() {
      return orderTotalPrice;
   }

   public FoodItem[] getFood() {
      return food;
   }

   public String getCustomer() {
      return customer;
   }

   public void setOrderNum(int orderNum) {
      this.orderNum = orderNum;
   }

   public void setOrderTotalPrice(double orderTotalPrice) {
      this.orderTotalPrice = orderTotalPrice;
   }

   public void setFood(FoodItem[] food) {
      this.food = food;
   }

   public void setCustomer(String customer) {
      this.customer = customer;
   }

   public void setOrderDate(Calendar orderDate) {
      this.orderDate = orderDate;
   }
   
   public void addFoodItem(FoodItem newItem) {
      food[size] = newItem;
      size++;
   }
   
   /**
    * Calculates the total price of an order
    * @return orderTotalPrice: Total price of the order
    */
   public double calcTotal(){
      for (int i = 0; i < size; i++){
         this.setOrderTotalPrice(this.orderTotalPrice + food[i].getPrice());
      }
      return orderTotalPrice;
   }
   /**
    * This method returns all the items in the order in their string form
    * @return items, food items in the order array
    */
   public String displayItems() {
      String items = "";
      
      for (int i = 0; i < size; i++){
         items = items + " " + food[i].toString();
      }
      return items;
   }

   @Override
   public String toString() {
      return "Order Number: " + orderNum + ", Orders Total Price: " + calcTotal() + " Food: " + 
            displayItems() + ", customer: " + customer + ", Order Date: " + orderDate.getTime();
   }

}
