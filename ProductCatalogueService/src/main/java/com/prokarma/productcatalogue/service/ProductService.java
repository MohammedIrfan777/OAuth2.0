package com.prokarma.productcatalogue.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.prokarma.productcatalogue.model.Price;
import com.prokarma.productcatalogue.model.Product;
import com.prokarma.productcatalogue.model.ProductPredicate;
import com.prokarma.productcatalogue.servInterface.PricingServiceIntf;
import com.prokarma.productcatalogue.servInterface.ProductServiceIntf;

@Service
public class ProductService implements ProductServiceIntf {
	
	@Autowired
	private PricingServiceIntf client;
	
	
	static ConcurrentHashMap<Integer, Product> m = new ConcurrentHashMap<>(); 
	int count =6;
	static {
		m.put(1, new Product(1,"Dettol","BED","Soap"));
		m.put(2, new Product(2,"Lifeboy","BED","Soap"));
		m.put(3, new Product(3,"Medimix","BED","Soap"));
		m.put(4, new Product(4,"Levis","BED","Cloth"));
		m.put(5, new Product(5,"flyingmachine","BED","Cloth"));
		
	}
	@Override
	@HystrixCommand(fallbackMethod = "getDummyProducts")
	public List<ProductPredicate> getAllProducts(String name) {
		
		
		List<Product> collect = m.values().stream()
		.filter(f -> f.getProductName().equalsIgnoreCase(name) || f.getProductCategory().equalsIgnoreCase(name) )
		.collect(Collectors.toList());	
		
		 return collect.stream()
                .map(e -> {
                    //Price price = client.getForObject("http://PRICING-SERVICE/price/getprice?id=" +e.getProductId() , Price.class);
                	Price price = client.getPrice(e.getProductId());
                    return new ProductPredicate(e.getProductId(), e.getProductName(), e.getProductDescription(),e.getProductCategory(),price.getPrice());
                })
                .collect(Collectors.toList());
		
		}
	public List<ProductPredicate> getDummyProducts(String name){
		List<ProductPredicate> list = new ArrayList<>();
		list.add(new ProductPredicate(0, "Dummy", "Dummy", "Dummy", 0));
		return list;
		
	}

	@Override
	public Product addProduct(Product product) {
		if(product.getProductId()==null)
			product.setProductId(count++);
		m.put(product.getProductId(), product);
		return product;
	}

	@Override
	public void deleteProduct(int id) {
		m.values().removeIf(f->f.getProductId().equals(id));
	}
	
	@Override
	public Product getProductById(int id) {
		List<Product> list = m.values().stream().collect(Collectors.toList());
		 for (Product product : list) {
		        if (product.getProductId().equals(id)) {
		            return product;
		        }
		    }
		    return null;
	}
		
		
	

		
		
	
	
	

}
