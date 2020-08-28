package com.cts.capstone.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.capstone.cart.entity.CapstoneCart;

public interface CapstoneCartRepository extends JpaRepository<CapstoneCart, String> {

}
