package com.tnsif.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamapiDemoMain {

	public static void main(String[] args) {
		
		List<StreamapiDemo> pl=new ArrayList<StreamapiDemo>();
		
		pl.add(new StreamapiDemo(1,"hp",25000f));
		pl.add(new StreamapiDemo(2,"Dell",30000f));
		pl.add(new StreamapiDemo(1,"Apple",95000f));
		pl.add(new StreamapiDemo(1,"lenova",15000f));
		
		List<Float> pl2=pl.stream().filter(p->p.price>30000)//filtering data
				.map(p->p.price)// fetching the price
				.collect(Collectors.toList());// collecting as a list
				System.out.println(pl2);
	}
	
}
