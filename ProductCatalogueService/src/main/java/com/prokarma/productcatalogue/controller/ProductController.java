package com.prokarma.productcatalogue.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prokarma.productcatalogue.exception.AddingProductException;
import com.prokarma.productcatalogue.exception.ResourceNotFoundException;
import com.prokarma.productcatalogue.model.Product;
import com.prokarma.productcatalogue.model.ProductPredicate;
import com.prokarma.productcatalogue.service.ProductService;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	@ApiOperation(value="Get List Of All Products",
	notes="Get product by passing name/category/description",
	response=ProductController.class)
	public ResponseEntity<List<ProductPredicate>> getAllProduct(@RequestParam String name) throws ResourceNotFoundException,Exception {
		logger.info("Inside getAllProduct() Method");
		List<ProductPredicate> allProducts = service.getAllProducts(name);
		logger.info("Ended getAllProduct() Method");
		if(allProducts.isEmpty()) {
			logger.error("Products not found :: " + name);
			throw new ResourceNotFoundException("Products not found :: " + name);
			
		}
		return new ResponseEntity<List<ProductPredicate>>(allProducts,HttpStatus.OK) ;
		
	
		
		
			
	}
	@PostMapping("/addProduct")
	@ApiOperation(value="Adds a product",
	notes="Adds a product by passing Product",
	response=ProductController.class)
	public ResponseEntity<?> addProduct(@RequestBody Product prod) throws AddingProductException, Exception {
		Product addProduct = service.addProduct(prod);
        if (addProduct == null) {
            logger.error("Products not found :: " + addProduct);
            throw new AddingProductException("Product already exists :: " + addProduct);    
        }
        logger.info("Ended addProduct() Method");
        return new ResponseEntity<>(addProduct, HttpStatus.OK);

	}
	
	@DeleteMapping("/delete/{id}")
	@ApiOperation(value="Deletes a Product by ID",
	notes="Delete product by passing id",
	response=ProductController.class)
	public ResponseEntity<String> deleteProduct(@PathVariable("id")int id) throws ResourceNotFoundException,Exception{
		logger.info("Inside deleteProduct() Method");
		Product product = service.getProductById(id);
		if(product == null) {
			logger.error("Product not found for this id :: "+id);
			throw new ResourceNotFoundException("Product not found for this id :: "+id);
		}
		
		service.deleteProduct(product.getProductId());
		logger.info("Ended deleteProduct() Method");
		return new ResponseEntity<String>("Product deleted successfully",HttpStatus.OK);
	}


}
