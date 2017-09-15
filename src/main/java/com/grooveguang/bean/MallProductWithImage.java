package com.grooveguang.bean;

import java.util.List;

public class MallProductWithImage {
	
	private MallProduct mallProduct;
	
	private List<MallProductImage> mallProductImagelists;
	
	public MallProduct getMallProduct() {
		return mallProduct;
	}

	public void setMallProduct(MallProduct mallProduct) {
		this.mallProduct = mallProduct;
	}


	public List<MallProductImage> getMallProductImagelists() {
		return mallProductImagelists;
	}

	public void setMallProductImagelists(List<MallProductImage> mallProductImagelists) {
		this.mallProductImagelists = mallProductImagelists;
	}
	
	

}
