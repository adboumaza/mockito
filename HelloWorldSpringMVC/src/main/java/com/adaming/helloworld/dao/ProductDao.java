package com.adaming.helloworld.dao;

import com.adaming.helloworld.entity.Product;

public interface ProductDao {

	int getAvailableProducts(Product product);

	int orderProduct(Product product, int orderedQuantity);

}
