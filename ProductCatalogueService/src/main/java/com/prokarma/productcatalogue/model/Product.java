package com.prokarma.productcatalogue.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@ApiModelProperty(notes = "Unique id of the product")
	private Integer productId;
	@ApiModelProperty(notes = "Name of the product")
	private String productName;
	@ApiModelProperty(notes = "Product Description")
	private String productDescription;
	@ApiModelProperty(notes = "Product Category")
	private String productCategory;
    //private Price price;	

}
