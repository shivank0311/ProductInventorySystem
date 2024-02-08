package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImplement implements ProductService
{
    @Autowired
	ProductRepository pr;
	@Override
	public void addProductDetails(Product p) {
		System.out.println(" data is getting saved to database");
		pr.save(p);
	}
	@Override
	public List<Product> viewallProduct() {
		return pr.findAll();
	}
	@Override
	public Product viewProductByPId(int pid) {
		 
		return pr.findById(pid).orElse(null);
	}
	@Override
	public void deleteproductdata(int pid) {
		 
		  pr.deleteById(pid);//calling repository method 
	}
	public Product getById(int id)
	{
		return pr.findById(id).orElse(null);
	}

}
