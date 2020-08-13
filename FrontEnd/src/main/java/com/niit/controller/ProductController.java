package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.dao.SupplierDAO;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	SupplierDAO supplierDAO;
	
	@RequestMapping(value="/product")
	public String showManageProduct(Model m) {
		
		Product product = new Product();
		m.addAttribute("product", product);
		
		List<Product> listProduct = productDAO.listProduct();
		m.addAttribute("productList", listProduct);
		
		List<Category> listCategory = categoryDAO.listCategory();
		m.addAttribute("categoryList", this.getCategoryList(listCategory));
		
		List<Supplier> listSupplier = supplierDAO.listSupplier();
		m.addAttribute("supplierList", this.getSupplierList(listSupplier));
		
		return "Product";
	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product")Product product, @RequestParam("productImage")MultipartFile productImage,Model m,BindingResult result)
	{
				
		productDAO.addProduct(product);
		
		String imagePath = "C:\\Users\\saairaam prasad\\git\\niit_ecom_project\\FrontEnd\\src\\main\\resources\\";
		imagePath=imagePath+String.valueOf(product.getProductId())+".jpg";
		
		File myfile = new File(imagePath);
		
		if(!productImage.isEmpty()) {
			try
			{
				byte[] fileBytes = productImage.getBytes();
				FileOutputStream fos = new FileOutputStream(myfile);
				BufferedOutputStream bs = new BufferedOutputStream(fos);
				bs.write(fileBytes);
				bs.close();
			}
			catch(Exception e) {
				m.addAttribute("errorInfo","Exception Arised:"+e);
			}
		}
		else 
		{
			m.addAttribute("errorInfo", "Error in uploading the image");
		}
		
		Product product1 = new Product();
		m.addAttribute("product", product1);
		
		List<Product> listProduct = productDAO.listProduct();
		m.addAttribute("productList", listProduct);
		
		List<Category> listCategory = categoryDAO.listCategory();
		m.addAttribute("categoryList", this.getCategoryList(listCategory));
		
		List<Supplier> listSupplier = supplierDAO.listSupplier();
		m.addAttribute("supplierList", this.getSupplierList(listSupplier));
		
		return "Product";
	}
	
	public LinkedHashMap<Integer,String> getCategoryList(List<Category> listCategory){
		
		LinkedHashMap<Integer,String> categoryData = new LinkedHashMap<Integer,String>();
		
		int count1 = 0;
		while(count1<listCategory.size()) {
			categoryData.put(listCategory.get(count1).getCategoryId(), listCategory.get(count1).getCategoryName());
			count1++;
		}
		
		return categoryData;
	}
	
	public LinkedHashMap<Integer,String> getSupplierList(List<Supplier> listSupplier){
		
		LinkedHashMap<Integer,String> supplierData = new LinkedHashMap<Integer,String>();
		
		int count2 = 0;
		while(count2<listSupplier.size()) {
			supplierData.put(listSupplier.get(count2).getSupplierId(), listSupplier.get(count2).getSupplierName());
			count2++;
		}
		
		return supplierData;
		
	}
	
	@RequestMapping(value="/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable("productId")int productID,Model m) {
		
		Product product = productDAO.getProductId(productID);
		productDAO.deleteProduct(product);
		
		Product product1 = new Product();
		m.addAttribute("product", product1);
		
		List<Product> listProduct = productDAO.listProduct();
		m.addAttribute("productList", listProduct);
		
		List<Category> listCategory = categoryDAO.listCategory();
		m.addAttribute("categoryList", this.getCategoryList(listCategory));
		
		List<Supplier> listSupplier = supplierDAO.listSupplier();
		m.addAttribute("supplierList", this.getSupplierList(listSupplier));
		
		return "Product";
	}
	
	@RequestMapping(value="/editProduct/{productId}")
	public String editProduct(@PathVariable("productId")int productID,Model m) {
		
		Product product = productDAO.getProductId(productID);
		m.addAttribute("productData",product);
		
		List<Product> listProduct = productDAO.listProduct();
		m.addAttribute("productList", listProduct);
		
		List<Category> listCategory = categoryDAO.listCategory();
		m.addAttribute("categoryList", this.getCategoryList(listCategory));
		
		List<Supplier> listSupplier = supplierDAO.listSupplier();
		m.addAttribute("supplierList", this.getSupplierList(listSupplier));
		
		return "UpdateProduct";
	}
	
	@RequestMapping(value="/updateProduct",method=RequestMethod.POST)
	public String updateProduct(@RequestParam("productId")int productID,@RequestParam("productName")String productName,@RequestParam("productDescription")String productDesc,@RequestParam("productPrice")int price,@RequestParam("productQuantity")int stock,@RequestParam("productImage")MultipartFile image,Model m) 
	{
		
		Product product = productDAO.getProductId(productID);
		product.setProductId(productID);
		product.setProductName(productName);
		product.setProductDescription(productDesc);
		product.setProductPrice(price);
		product.setProductQuantity(stock);
		product.setProductImage(image);
		productDAO.updateProduct(product);
		m.addAttribute("product", product);
		List<Product> listProduct = productDAO.listProduct();
		m.addAttribute("productList", listProduct);
		
		return "Product";
		
	}
	
	@RequestMapping("/productCatalog")
	public String displayAllProduct(Model m) {
		
		
		List<Product> listProduct = productDAO.listProduct();
		m.addAttribute("productList", listProduct);
		
		return "ProductCatalog";
	}
	
	@RequestMapping("/productDisplay/{productId}")
	public String displaySingleProduct(@PathVariable("productId")int productID,Model m){
		
		Product product=productDAO.getProductId(productID);
		product.setProductId(productID);
		m.addAttribute("productInfo", product);
		
		m.addAttribute("product",product);
		return "ProductDisplay";
	}
	}

