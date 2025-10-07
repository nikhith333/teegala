package com.tnsif.day12;

public class LambdaParameterMain {
	
	public static void main(String[] args) {
		LambdaParameter w = (a) ->
		{
			System.out.println("The value of a is :" +a);
			return a;	
		};
		
		w.hello(6);

	}

}
