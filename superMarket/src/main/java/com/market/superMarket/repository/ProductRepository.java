<<<<<<< HEAD
package com.market.superMarket.repository;

import com.market.superMarket.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
=======
package com.market.superMarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.market.superMarket.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
>>>>>>> f44467b762a00adac988e8ec9325261accd60c48
