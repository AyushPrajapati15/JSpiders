package com.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
