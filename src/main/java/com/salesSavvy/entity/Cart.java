package com.salesSavvy.entity;

import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    @JsonBackReference
    private Users user;
    
    @OneToMany(
    		mappedBy = "cart",
    		cascade = CascadeType.ALL,
    		orphanRemoval = true
	)
    @JsonManagedReference // Serialize Cart -> CartItems
    private List<CartItem> cartItems = new ArrayList<>();
    
    /* --------- Constructors -------- */
    
    public Cart() {}
    
    public Cart(Long id, Users user, List<CartItem> cartItems) {
        this.id = id;
        this.user = user;
        this.cartItems = cartItems;
    } 
   
    // Getters and Setters
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Users getUser() { return user; }
    public void setUser(Users user) { this.user = user; }
    
    public List<CartItem> getCartItems() { return cartItems; }
    public void setCartItems(List<CartItem> cartItems) { this.cartItems = cartItems; }	
}