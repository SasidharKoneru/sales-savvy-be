package com.salesSavvy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesSavvy.entity.Product;
import com.salesSavvy.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService{

	@Autowired
	ProductRepository repo;
	
	@Override
	public String addProduct(Product product) {
		repo.save(product);
		return "Product added successfully";
	}

	@Override
	public Product searchProduct(long id) {
		return repo.findById(id).get();
	}

	@Override
	public Product searchProduct(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}

	@Override
	public String updateProduct(Product product) {
		repo.save(product);
		return "Product updated successfully";
	}

	@Override
	public String deleteProduct(long id) {
		repo.deleteById(id);
		return "product delete successfully";
	}

	@Override
	public Product searchProductByCategory(String category) {
		return repo.findByCategory(category);
	}

	@Override
	public List<Product> getAllProducts() {
		return repo.findAll();
	}
	
	
	
}
