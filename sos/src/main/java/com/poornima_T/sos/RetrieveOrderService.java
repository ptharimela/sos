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
		Order order = getFromDataStore(orderRef);

		return order;
	}

	public ArrayList<Order> retrieveAllOrders() {
		return null;
	}

	private Order getFromDataStore(String orderRef) {
		// TODO Auto-generated method stub
		return null;
	}

}
