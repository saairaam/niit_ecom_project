package com.niit.dao;

import com.niit.model.CartItem;
import java.util.List;

public interface CartDAO 
{
	public boolean addCartItem(CartItem cartItem);
	public boolean deleteCartItem(CartItem cartItem);
	public boolean updateCartItem(CartItem cartItem);
	public List<CartItem> listCartItem(String username);
	public CartItem getCartItem(int cartItemId);	
}
