package com.prokarma.productcatalogue.servInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prokarma.productcatalogue.model.Price;

@FeignClient(name="pricing-service")
public interface PricingServiceIntf {
	

	@GetMapping(value="/price/getprice")
	Price getPrice(@RequestParam Integer id);

}
