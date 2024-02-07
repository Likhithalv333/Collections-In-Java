package com.sathya.collectinslabqestions;

import java.util.ArrayList;
import java.util.List;

public class names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=new ArrayList<String>();
		names.add("ratan");
		names.add("chandhu");
		names.add("chandhu");
		names.add("sravya");
		names.add("anu");
		names.add("raju");
		names.add("rani");
		int c=0;
		for(String name:names) {
			c++;
			System.out.print(name+" ");
		}
		System.out.println("cont.."+c);
		System.out.println("starts with r");
		for(String name:names) {
			if(name.startsWith("r"))
			System.out.print(name+" ");
		}
		System.out.println();
		System.out.println("endwith a");
		for(String name:names) {
			if(name.endsWith("a"))
			System.out.println(name);
		}
		System.out.println("length f each string");
		for(String name:names) {
		
			System.out.print(name.length()+" ");
		}
		//remove raju from list
		names.remove("raju");
		System.out.println("without raju");
		for(String name:names) {
			
			System.out.print(name+" ");
		}
		boolean ispresent=false;
		for(String name:names) {
			if(name.equalsIgnoreCase("sathya")) {
			ispresent=true;
			break;
			
				
			}
			
			
		}
		System.out.println();
		if(ispresent) {
			System.out.println("available");
		}
		else {
			System.out.println("not available");
		}
		
	}

	
		
	}


