package com.sathya.collectinslabqestions;

import java.util.ArrayList;
import java.util.List;

public class productEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products=new ArrayList<Product>();
		products.add(new Product(101,"laptop",1200));
		products.add(new Product(102,"mobile",7000));
		products.add(new Product(103,"tab",22000));
		products.add(new Product(104,"speakers",2500));
		products.add(new Product(105,"tv",1100));
		for(Product product:products) {
			if(product.equals("tv")) {
				product.setProPrice(20000);
			}
			System.out.println(product.getProId()+" "+product.getProName()+" "+product.getProPrice());
		}

	}

}
