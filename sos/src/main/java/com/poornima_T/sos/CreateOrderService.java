/**
 * 
 */
package com.poornima_T.sos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;


/**
 * @author poornima.tharimela
 *
 */
public class CreateOrderService Implements IService {

	
	private static AtomicLong idCounter = new AtomicLong();
	/**
	 * Creates an order returns an OrderReference
	 * @return
	 */
	public Order makeOrder(int noOfbricks) {
		
		Order newOrder = new Order(noOfbricks);
		newOrder.setOrder_ref(generateOrderRef());
		newOrder.setFulfillOrder(Boolean.FALSE);
		newOrder.setDispatchOrder(Boolean.FALSE);
		submitOrder(newOrder);
		return newOrder;
		
	}
	
	/**
	 * Saves the orders to a file system TODO: Need to save them to a DB
	 * @param order
	 */
	public void submitOrder(Order order){
        
        OutputStream ops = null;
        ObjectOutputStream objOps = null;
        try {
            ops = new FileOutputStream("Orders.txt");
            objOps = new ObjectOutputStream(ops);
            objOps.writeObject(order);
            objOps.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(objOps != null) objOps.close();
            } catch (Exception ex){
                 
            }
        }
         
    }

	private String generateOrderRef() {
		return String.valueOf(idCounter.getAndIncrement());
	}

}
