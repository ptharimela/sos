/**
 * 
 */
package com.poornima_T.sos;

import java.io.Serializable;


/**
 * @author poornima.tharimela
 *
 */
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String order_ref;
	private int noOfBricks;
	private Boolean fulfillOrder;
	private Boolean dispatchOrder;
	
	
	
	public Order(int nob){
		
		this.noOfBricks = nob;
	
	}
	
	
	/**
	 * @return the order_ref
	 */
	public String getOrder_ref() {
		return order_ref;
	}
	/**
	 * @param order_ref the order_ref to set
	 */
	public void setOrder_ref(String order_ref) {
		this.order_ref = order_ref;
	}
	/**
	 * @return the noOfBricks
	 */
	public int getNoOfBricks() {
		return noOfBricks;
	}
	/**
	 * @param noOfBricks the noOfBricks to set
	 */
	public void setNoOfBricks(int noOfBricks) {
		this.noOfBricks = noOfBricks;
	}
	/**
	 * @return the fulfillOrder
	 */
	public Boolean getFulfillOrder() {
		return fulfillOrder;
	}
	/**
	 * @param fulfillOrder the fulfillOrder to set
	 */
	public void setFulfillOrder(Boolean fulfillOrder) {
		this.fulfillOrder = fulfillOrder;
	}
	/**
	 * @return the dispatchOrder
	 */
	public Boolean getDispatchOrder() {
		return dispatchOrder;
	}
	/**
	 * @param dispatchOrder the dispatchOrder to set
	 */
	public void setDispatchOrder(Boolean dispatchOrder) {
		this.dispatchOrder = dispatchOrder;
	}
	
	
}
