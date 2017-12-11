/**
 * 
 */
package com.poornima_T.sos;
import org.junit.Assert;
import org.junit.Test;
/**
 * @author poornima.tharimela
 *
 */
public class CreateOrderServiceTest {
	 
     public CreateOrderService createService = new CreateOrderService();
     
     @Test
     public void makeOrderTest(){
    	 
    	 Assert.assertNotNull(createService.makeOrder(5));
     }

}
