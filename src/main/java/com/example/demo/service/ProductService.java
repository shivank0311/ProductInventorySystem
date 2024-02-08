package com.example.demo.service;

import java.util.List;

import com.example.demo.model.*;

public interface ProductService
{

	public void addProductDetails(Product p);
	public List<Product>  viewallProduct();
	public Product  viewProductByPId(int pid);
	public void deleteproductdata(int pid);
	public Product getById(int id);
}
