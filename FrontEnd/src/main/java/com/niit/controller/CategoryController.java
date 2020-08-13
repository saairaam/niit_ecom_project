package com.niit.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

@SuppressWarnings("unused")
@Controller
public class CategoryController 
{
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/category")
	public String showCategoryPage(Model m) 
	{
		
		List<Category> listCategory = categoryDAO.listCategory();
		m.addAttribute("categoryList", listCategory);
		
		return "Category";
	}
	
	@RequestMapping(value="/addCategory",method=RequestMethod.POST)
	public String addCategory(@RequestParam("categoryName")String categoryName,@RequestParam("categoryDesc")String categoryDesc,Model m) 
	{
		
		Category category = new Category();
		category.setCategoryName(categoryName);
		category.setCategoryDescription(categoryDesc);
		
		categoryDAO.addCategory(category);
		
		List<Category> listCategory = categoryDAO.listCategory();
		m.addAttribute("categoryList", listCategory);
		
		return "Category";
		
	}
	
	@RequestMapping(value="/updateCategory",method=RequestMethod.POST)
	public String updateCategory(@RequestParam("categoryId")int categoryID,@RequestParam("categoryName")String categoryName,@RequestParam("categoryDesc")String categoryDesc,Model m)
	{
		
		Category category = categoryDAO.getCategoryId(categoryID);
		category.setCategoryName(categoryName);
		category.setCategoryDescription(categoryDesc);
		
		categoryDAO.updateCategory(category);
		
		List<Category> listCategory = categoryDAO.listCategory();
		m.addAttribute("categoryList", listCategory);
		
		return "Category";
		
	}
	
	@RequestMapping(value="/editCategory/{categoryId}")
	public String editCategory(@PathVariable("categoryId")int categoryID,Model m) {
		
		Category category = categoryDAO.getCategoryId(categoryID);
		m.addAttribute("categoryData",category);
		
		return "UpdateCategory";
	}
	
	@RequestMapping(value="/deleteCategory/{categoryId}")
	public String deleteCategory(@PathVariable("categoryId")int categoryID,Model m) {
		
		Category category = categoryDAO.getCategoryId(categoryID);
		categoryDAO.deleteCategory(category);
		
		List<Category> listCategory = categoryDAO.listCategory();
		m.addAttribute("categoryList", listCategory);
		
		return "Category";
	}

}
