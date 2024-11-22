package javabasic.exio;

import java.io.Serializable;
import java.util.List;

public class Shop implements Serializable{
	private static final long serialVersionUID = 8797868545L;
	
	
	private String shopname;
	private List<String> pdlist;
	Product product;
	
	public Shop(String shopname, List<String> pdlist, Product product) {
		super();
		this.shopname = shopname;
		this.pdlist = pdlist;
		this.product = product;
	}


	@Override
	public String toString() {
		return shopname + "\n" + pdlist + "\n" + "-" +product.name +"\n-" +product.serialNum + "\n-" + product.price;
	}
	

}
