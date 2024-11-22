package javabasic.exio;

import java.io.Serializable;
import java.util.List;

public class Shop implements Serializable{
	private static final long serialVersionUID = 8797868545L;
	
	
	private String shopname;
	private List<String> pdlist;
	
	public Shop(String shopname, List<String> pdlist) {
		super();
		this.shopname = shopname;
		this.pdlist = pdlist;
	}


	@Override
	public String toString() {
		return shopname + "\n" + pdlist ;
	}
	

}
