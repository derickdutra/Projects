package com.market.superMarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.market.superMarket.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
