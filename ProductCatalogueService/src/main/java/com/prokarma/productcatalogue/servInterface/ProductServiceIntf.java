package com.prokarma.productcatalogue.servInterface;

import java.util.List;
import java.util.Map;

import com.prokarma.productcatalogue.model.Product;
import com.prokarma.productcatalogue.model.ProductPredicate;

public interface ProductServiceIntf {
	
	public List<ProductPredicate> getAllProducts(String name);
	public Product addProduct(Product product);
	public void deleteProduct(int id);
	public Product getProductById(int id);

}
