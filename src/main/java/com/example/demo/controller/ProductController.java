package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller

public class ProductController {

	@Autowired
	ProductService ps;

	@GetMapping("/")
	public String homepage()
	{
		return "index";
	}
	@GetMapping("/addProduct")
	public String addproduct(Model m)
	{
		m.addAttribute("data",new Product());
		return "addProductform";
	}
	@PostMapping("/addproductdetails")
	public String addproductdetails(@ModelAttribute("data") Product data)
	{
	    ps.addProductDetails(data)	;
		return "redirect:/listProduct";
	}
	
	
	@GetMapping("/listProduct")
	public String listproduct(Model m)
	{
		List<Product> p= ps.viewallProduct();
		
		m.addAttribute("listdata",p);
		return "viewProductpage";
	}
	@GetMapping("/deleteProduct/{pid}")
	public String deleteproductdata(@PathVariable int pid)
	{
		ps.deleteproductdata(pid);
		return "redirect:/listProduct";
	}
	
	
	@GetMapping("/editProduct/{pid}")
	public String editproductdata(@PathVariable int pid,Model m)
	{
		 Product p= ps.getById(pid);
		 m.addAttribute("d1",p);
		return "editproductpage";
	}
	
	@PostMapping("/editproductdetails")
	public String  editproductdetails(@ModelAttribute("d1")Product d1)
	{
		ps.addProductDetails(d1);
		return "redirect:/listProduct";
	}
}

