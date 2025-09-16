package com.tnsif.day4;

import com.tnsif.day4.Hybrid.child1;
import com.tnsif.day4.Hybrid.child2;
import com.tnsif.day4.Hybrid.child3;

public class HybridInheritance {

	public static void main(String[] args) {
		child1 obj = new child1();
		obj.show();
		obj. parentmethod();
		
		child2 ob = new child2();
		ob.show1();
		ob. parentmethod();
		
		child3 o = new child3();
		o.show2();
		o.show1();
		o. parentmethod();
		

	}

}
