package com.cts.capstone.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.capstone.cart.controller.request.UserId;
import com.cts.capstone.cart.entity.CapstoneCart;
import com.cts.capstone.cart.service.CapstoneCartService;

@RestController
@RequestMapping("/user/Cart/")
public class CartDetailsController {
	
	@Autowired
	CapstoneCartService cartService;
	
	@PostMapping(value = "getCartListBycartId")
	public ResponseEntity<Object> getCartList(@RequestBody UserId id){
		
		List<CapstoneCart> carts = cartService.cartListByCartId(id.getId());
		carts.forEach(System.out::println);
		
		return new ResponseEntity<Object>(carts,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping(value = "updateOrder")
	public ResponseEntity<Object> updateOrder(@RequestBody CapstoneCart cart){
		try {
			cartService.updateByOrderId(cart);
			return new ResponseEntity<Object>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
	}
	
}
