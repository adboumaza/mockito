package com.adaming.helloworld.service;

import com.adaming.helloworld.dao.ProductDao;
import com.adaming.helloworld.entity.Product;
import com.adaming.helloworld.exception.InsufficientProductsException;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	public boolean buy(Product product, int orderedQuantity)
			throws InsufficientProductsException {
		boolean transactionStatus = false;
		int availableQuantity = productDao.getAvailableProducts(product);
		if (orderedQuantity > availableQuantity) {
			throw new InsufficientProductsException();
		}
		productDao.orderProduct(product, orderedQuantity);
		transactionStatus = true;
		return transactionStatus;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

}
