package com.prokarma.productcatalogue.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.web.client.RestTemplate;

import com.prokarma.productcatalogue.model.Price;
import com.prokarma.productcatalogue.model.ProductPredicate;
import com.prokarma.productcatalogue.servInterface.PricingServiceIntf;

@Tag("unit")
public class ProductServiceTest {
	/*
	 * 
<<<<<<< Updated upstream
	 * @Mock private PricingServiceIntf client;
=======
	 * @Mock private RestTemplate res;
>>>>>>> Stashed changes
	 * 
	 * @InjectMocks
	 * 
	 * @Spy private ProductService service;
	 * 
	 * 
<<<<<<< Updated upstream
	 * @BeforeEach public void setUp() { MockitoAnnotations.openMocks(this); }
	 * 
	 * 
	 * @Test void whenPassingNameReturnAllProducts() {
	 * when(client.getPrice(Mockito.anyInt())) .thenReturn(buildPrice());
=======
	 * 
	 * @BeforeEach public void setUp() { MockitoAnnotations.openMocks(this); }
	 * 
	 * @Test void whenPassingNameReturnAllProducts() {
	 * when(res.getForObject(Mockito.anyString(),
	 * ArgumentMatchers.any(Class.class))) .thenReturn(buildPrice());
>>>>>>> Stashed changes
	 * 
	 * List<ProductPredicate> result =service.getAllProducts("Soap");
	 * assertNotNull(result); assertNotNull(result.get(0)); assertEquals(20,
	 * result.get(0).getPrice());
	 * 
	 * } private Price buildPrice() { Price price = new Price(); price.setPrice(20);
	 * price.setPriceId(2); price.setProductId(2);
	 * 
	 * return price;
	 * 
	 * }
	 * 
<<<<<<< Updated upstream
	 * 
	 * @Test void whenAddingnewProduct() { when(client.getPrice(Mockito.anyInt()))
	 * .thenReturn(buildPrice());
=======
	 * void whenAddingnewProduct() { when(res.getForObject(Mockito.anyString(),
	 * ArgumentMatchers.any(Class.class))) .thenReturn(buildPrice());
>>>>>>> Stashed changes
	 * 
	 * List<ProductPredicate> result =service.getAllProducts("Soap");
	 * assertNotNull(result); assertNotNull(result.get(0)); assertEquals(20,
	 * result.get(0).getPrice());
	 * 
	 * }
	 * 
<<<<<<< Updated upstream
	 * 
=======
>>>>>>> Stashed changes
	 */}
