package com.adaming.helloworld.service;

import com.adaming.helloworld.dao.ProductDao;
import com.adaming.helloworld.entity.Product;
import com.adaming.helloworld.exception.InsufficientProductsException;

public interface ProductService {
	public boolean buy(Product product, int orderedQuantity)
			throws InsufficientProductsException;

	void setProductDao(ProductDao productDao);
}
