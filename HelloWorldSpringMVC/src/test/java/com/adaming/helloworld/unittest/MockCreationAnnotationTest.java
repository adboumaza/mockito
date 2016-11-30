package com.adaming.helloworld.unittest;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.adaming.helloworld.dao.ProductDao;
import com.adaming.helloworld.entity.Product;

public class MockCreationAnnotationTest {
	@Mock
	private ProductDao productDao;
	@Mock
	private Product product;

	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testMockCreation() {
		assertNotNull(product);
		assertNotNull(productDao);
	}
}