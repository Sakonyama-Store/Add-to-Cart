package com.addToCart.Cart.repository;

import com.addToCart.Cart.repository.entity.AddToCartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddToCartRepository extends JpaRepository<AddToCartEntity, Long> {
}
