package com.tnsif.main;

import com.tnsif.application.GSNormalAcc;
import com.tnsif.application.GSPrimeAcc;

public class MainFactory {

	public static void main(String[] args) {
		GSPrimeAcc gsprime = new GSPrimeAcc(101,"Nikhith",4000,true);
		GSNormalAcc gsnormal = new GSNormalAcc(102,"Rahul",3500,36.3f);

		gsprime.bookProduct(10.4f);
		gsnormal.bookProduct(22.3f);
		
	}

}