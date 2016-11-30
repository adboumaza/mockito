package com.adaming.helloworld.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.adaming.helloworld.dao.ProductDao;
import com.adaming.helloworld.entity.Product;
import com.adaming.helloworld.exception.InsufficientProductsException;
import com.adaming.helloworld.service.ProductService;
import com.adaming.helloworld.service.ProductServiceImpl;

public class MockVerifyingTest {

	private ProductService productService;

	@Mock
	private ProductDao productDao;
	@Mock
	private Product product;

	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
		productService = new ProductServiceImpl();
		productService.setProductDao(productDao);
	}

	@Test
	public void testStubbing() throws InsufficientProductsException {
		Mockito.when(productDao.getAvailableProducts(product)).thenReturn(30);
		assertEquals(30, productDao.getAvailableProducts(product));
		productService.buy(product, 5);
		Mockito.verify(productDao).orderProduct(product, 6);
	}
}
