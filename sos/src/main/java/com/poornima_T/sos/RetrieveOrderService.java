/**
 * 
 */
package com.poornima_T.sos;

import java.util.ArrayList;

/**
 * @author poornima.tharimela
 *
 */
public class RetrieveOrderService implements IService {

	public Order getOrder(String orderRef) {
		Order order = OrdersRepository.retrieveOrder(orderRef);

		return order;
	}

	public ArrayList<Order> retrieveAllOrders() {
		return null;
	}

/*	private Order getFromDataStore(String orderRef) {
		
		return null;
	}*/

}
