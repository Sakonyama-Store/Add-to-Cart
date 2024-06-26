package com.addToCart.Cart.repository.entity;


import javax.persistence.*;

@Entity
@Table(name = "cart")
public class AddToCartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product")
    private String prouductDetail;

    public AddToCartEntity() {}

    public AddToCartEntity(String productDetail) {
        this.prouductDetail = productDetail;
    }
    public String getProuductDetail() {
        return prouductDetail;
    }

    public void setProuductDetail(String prouductDetail) {
        this.prouductDetail = prouductDetail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
