package com.adaming.helloworld.unittest;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import com.adaming.helloworld.dao.ProductDao;
import com.adaming.helloworld.entity.Product;

public class MockCreationTest {
	private ProductDao productDao;
	private Product product;

	@Before
	public void setupMock() {
		product = mock(Product.class);
		productDao = mock(ProductDao.class);
	}

	@Test
	public void testMockCreation() {
		assertNotNull(product);
		assertNotNull(productDao);
	}
}