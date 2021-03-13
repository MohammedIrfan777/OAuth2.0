package com.prokarma.productcatalogue.model;



import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductPredicate {

	@ApiModelProperty(notes = "Unique id of the product")
	private Integer productId;
	@ApiModelProperty(notes = "Product Name")
	private String productName;
	@ApiModelProperty(notes = "Product Description")
	private String productDescription;
	@ApiModelProperty(notes = "Product Category")
	private String productCategory;
	@ApiModelProperty(notes = "Product price")
	private Integer Price;
}
