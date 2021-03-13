package com.prokarma.productcatalogue.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.prokarma.productcatalogue.exception.ResourceNotFoundException;
import com.prokarma.productcatalogue.model.ProductPredicate;
import com.prokarma.productcatalogue.service.ProductService;

@Tag("unit")
public class ProductControllerTest {
	/*
	 * 
<<<<<<< Updated upstream
=======
	 * 
>>>>>>> Stashed changes
	 * @InjectMocks
	 * 
	 * @Spy private ProductController controller;
	 * 
	 * @Mock private ProductService service;
	 * 
<<<<<<< Updated upstream
	 * @BeforeEach public void setUp() { MockitoAnnotations.openMocks(this); }
	 * 
	 * 
	 * @Test void testReturnsAllProducts() throws ResourceNotFoundException,
	 * Exception { when(service.getAllProducts(Mockito.anyString()))
	 * .thenReturn(allProducts());
	 * 
	 * 
	 * ResponseEntity<List<ProductPredicate>> response =
	 * controller.getAllProduct("Soap"); assertEquals(HttpStatus.OK,
=======
	 * @BeforeEach public void setUp() { //MockitoAnnotations.openMocks(this); }
	 * 
	 * 
	 * @Test void testReturnsAllProducts() {
	 * when(service.getAllProducts(Mockito.anyString())) .thenReturn(allProducts());
	 * 
	 * 
	 * // ResponseEntity<List<ProductPredicate>> response =
	 * controller.getAllProduct("Soap"); // assertEquals(HttpStatus.OK,
>>>>>>> Stashed changes
	 * response.getStatusCode());
	 * 
	 * }
	 * 
	 * private List<ProductPredicate> allProducts(){ List<ProductPredicate> list
	 * =new ArrayList<ProductPredicate>(); list.add(new
	 * ProductPredicate(1,"Dettol","BED","Soap",10)); list.add(new
	 * ProductPredicate(2,"Lifeboy","BED","Soap",20)); list.add(new
	 * ProductPredicate(1,"Medimix","BED","Soap",30)); return list;
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 */}
