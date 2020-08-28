package com.cts.capstone.cart.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.capstone.cart.entity.CapstoneCart;
import com.cts.capstone.cart.repository.CapstoneCartRepository;

@Component
@Transactional
public class CapstoneCartServiceImpl implements CapstoneCartService {

	@Autowired
	private CapstoneCartRepository cartRepo;
	
	@Override
	public List<CapstoneCart> cartListByCartId(String cartId) {
//		return cartRepo.findAll().stream().filter(s-> s.getCartId().equals(cartId)).collect(Collectors.toList());
		
		return cartRepo.findAll();
	}

	@Override
	public boolean updateByOrderId(CapstoneCart cart) {
		try {
			cartRepo.save(cart);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean checkoutCartById() {
		
		return false;
		
	}

	
	
}
