package com.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
