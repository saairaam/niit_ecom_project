package com.niit.model;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Product 
{ 
  @Id
  @GeneratedValue
  int productId;
  float productPrice;
  float productQuantity;
  String productName;
  String productDescription;
  int supplierId;
  int categoryId;
  
 
  @Transient
	MultipartFile productImage;
	
	public MultipartFile getProductImage() {
		return productImage;
	}
	
	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}
public int getProductId()
{
	return productId;
}

public void setProductId(int productId) 
{
	this.productId = productId;
}

public float getProductPrice() 
{
	return productPrice;
}

public void setProductPrice(float productPrice)
{
	this.productPrice = productPrice;
}

public float getProductQuantity()
{
	return productQuantity;
}

public void setProductQuantity(float productQuantity) 
{
	this.productQuantity = productQuantity;
}

public String getProductName() 
{
	return productName;
}

public void setProductName(String productName) 
{
	this.productName = productName;
}

public String getProductDescription() 
{
	return productDescription;
}

public void setProductDescription(String productDescription) 
{
	this.productDescription = productDescription;
}

public int getSupplierId() 
{
	return supplierId;
}

public void setSupplierId(int supplierId) 
{
	this.supplierId = supplierId;
}

public int getCategoryId() 
{
	return categoryId;
}

public void setCategoryId(int categoryId) 
{
	this.categoryId = categoryId;
}



}
