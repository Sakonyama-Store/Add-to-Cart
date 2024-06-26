package com.addToCart.Cart.service;

import com.addToCart.Cart.repository.AddToCartRepository;
import com.addToCart.Cart.repository.entity.AddToCartEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AddToCartService {
    @Autowired
    private AddToCartRepository addToCartRepository;

    public AddToCartEntity addProductToCart(String productDetail){
        AddToCartEntity addToCartEntity = new AddToCartEntity(productDetail);
        return addToCartRepository.save(addToCartEntity);
    }
    public List<AddToCartEntity> getCartItemById(Long id){
        return addToCartRepository.findAllById(Collections.singleton(id));
    }

}
