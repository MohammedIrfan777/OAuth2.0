package com.prokarma.productcatalogue.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Price {
	
	private Integer priceId;
	private Integer productId;

	private Integer price;
	//private Integer priceId;



}
