package com.addToCart.Cart.controller;

import com.addToCart.Cart.repository.entity.AddToCartEntity;
import com.addToCart.Cart.service.AddToCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class AddToCartController {
    @Autowired
    private AddToCartService addToCartService;

    @PostMapping("/addCart")
    public ResponseEntity<AddToCartEntity> addProductToCart(@RequestBody String productDetail){
        AddToCartEntity addToCartEntity = addToCartService.addProductToCart(productDetail);
        return new ResponseEntity<>(addToCartEntity, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public List<AddToCartEntity> getCartItemById(@PathVariable Long id) {
        return addToCartService.getCartItemById(id);
    }

}
