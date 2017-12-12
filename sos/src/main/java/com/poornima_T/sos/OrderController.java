/**
 * 
 */
package com.poornima_T.sos;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author poornima.tharimela
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController {

	@RequestMapping(value = "/makeOrder", method = RequestMethod.GET, headers="Accept=application/json")
	public Order makeOrder(@RequestParam("noOfbricks") int noOfbricks) {
		
		CreateOrderService createOrderService = new CreateOrderService();
		return createOrderService.makeOrder(noOfbricks);
	}
	
	@RequestMapping(value="/getOrder/{orderRef}",method = RequestMethod.GET,headers="Accept=application/json")
	public Order getOrder(@PathVariable("orderRef") String orderRef)
	{
		
		RetrieveOrderService retrieveOrderService = new RetrieveOrderService();
		return retrieveOrderService.getOrder(orderRef);
	}
	
}
