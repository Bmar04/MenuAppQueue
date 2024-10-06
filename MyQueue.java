
/**
 *
 * @author Brandon Marquart
 * @version 1.0
 * @date 3/18/2024
 * 
 * This class is an implementation of a queue data structure.
 */

import java.util.Arrays;
public class MyQueue<E> {
   private final int MAX_SIZE = 10;
   private int size;
   private int front;
   private int rear;
   private Order[] queueArray;
   
   /**
    * Default constructor for a queue
    */
   public MyQueue() {
      queueArray = new Order[MAX_SIZE];
      size = 0;
      front = -1;
      rear = -1;
   }  
   
   /**
    * Adds an item to the end of a queue.
    * @param item the item added to the end of the queue.
    */
   public void EnQueue(Order item) {
      rear++;
      size++;
      queueArray[rear] = item;

   }
   
   public Order DeQueue(){
      if (isEmpty()){
         System.out.println("No items in queue");
         return null;
      }
      else {
         Order value = queueArray[rear];
         queueArray[rear] = null;
         rear--;
         size--;
         return value;
      }
   }
   /**
    * Iterates through the queue and displays the data of each item.
    */
   public void printQueue(){
      if (isEmpty()) {
         System.out.println("No orders in queue");
      }
      else {
         for (int i = 0; i < size; i++){ //iterates through the queue, the queue is implemented with array.
            System.out.println(queueArray[i]);
         }
      }
   }
   /**
    * Checks if the queue is empty;
    * @return boolean value representing if the queue is empty or not.
    */
   public boolean isEmpty(){
      //Checks if the queue is empty
      if (front == rear) {
         return true;
      }
      else {
         return false;
      }
   }
}   

