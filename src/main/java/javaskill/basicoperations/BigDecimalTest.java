package javaskill.basicoperations;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		

		System.out.println(0.1+0.2);
		
		float amount1 = 2.15f;
		float amount2 = 1.10f;
		Float a = amount1 - amount2 ;
		Float b = 1.05f;

		System.out.println(a);
		System.out.println(b);
		
		if (amount1 - amount2 == 1.05) 
			System.out.println("OK");
		else
			System.out.println("Not OK");
		
		if (a == b) {
			System.out.println("a equals b");
		}else {
			System.out.println("a not equals b");
		}
		
		if (a.equals(b)) {
			System.out.println("a equals b");
		}else {
			System.out.println("a not equals b");
		}
		
		BigDecimal c = new BigDecimal(a.toString());
		BigDecimal d = new BigDecimal(a.toString());
		
		if (c.equals(d)) { 
			System.out.println("a equals b");
		}else {
			System.out.println("a not equals b");
		}
		float aaa = 0.1f; //disp.getPreAuthAmount()
		float amount = 0.1f;  
		BigDecimal bigDecamount = new BigDecimal(String.valueOf(amount));
		BigDecimal floatPreauth = new BigDecimal(String.valueOf(aaa));
		BigDecimal floatDivPreauth = floatPreauth.divide(new BigDecimal(100)) ;
		
		if (floatPreauth.equals(bigDecamount)|| floatDivPreauth.equals(bigDecamount)) {
			System.out.println("bigDecamount equals bigDecamount " + floatPreauth);
		}
		
		String nullstr = "a";
		if (nullstr.equalsIgnoreCase(null)) {
			System.out.println("null null");
		}
	}
}
