package com.sathya.collectinslabqestions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ItemsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<String> > items=new HashMap<String, List<String>>();
		items.put("GT378", List.of("dosa","idly","poori"));
		items.put("AB123", List.of("pizza","pasta","burger"));
		items.put("XY789", List.of("chiken","mutton","fish"));
		items.put("MK345", List.of("dal","paneer","sambar"));
		
		List<String> order789= items.get("XY789");
		System.out.println(order789);
		items.remove("AB123"); 
		for(Entry<String, List<String>> entry :items.entrySet()) {
			String oderid=entry.getKey();
			List<String>  item=entry.getValue();
			System.out.println(oderid+" "+item);
		}

	}

}
