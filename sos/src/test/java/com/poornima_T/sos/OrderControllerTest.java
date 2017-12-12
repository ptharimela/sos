package com.poornima_T.sos;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest(OrderController.class)

public class OrderControllerTest {
	 
	RetrieveOrderService mockRetrieveService = null;
	CreateOrderService mockCreateOrder = null;
	OrderController orderController = new OrderController();
	    
	  @Test
	  public void testMakeOrders()
	  {
		  Order order = new Order(4);
		  mockCreateOrder = PowerMockito.mock(CreateOrderService.class);
		  PowerMockito.when(mockCreateOrder.makeOrder(4)).thenReturn(order);
		  assertEquals(order.getNoOfBricks(), 4);
		  
		
		  
	  }
	  @Test
	  public void testGetOrders() {
		  Order order = new Order(0);
	     mockRetrieveService = PowerMockito.mock(RetrieveOrderService.class);
	    PowerMockito.when(mockRetrieveService.getOrder("0")).thenReturn(order);	    
	    assertNotNull(orderController.getOrder("0"));
	  }

}
