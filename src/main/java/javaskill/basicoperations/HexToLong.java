package javaskill.basicoperations;

import java.math.BigInteger;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.junit.Test;

/**
*@author    created by Teddy
*@date  Jul 17, 2020---5:40:51 PM
*/
public class HexToLong {
	public final static int[] arr = {0,1,2} ;
	public static void main(String[] args) {
		String hex = Integer.toHexString(-527745998);
		System.out.println(hex);
		String strNum = "0xcfa2ee4a";
		String s = "4d0d08ada45f9dde1e99cad9";
		BigInteger bi = new BigInteger(s, 16);
		System.out.println(bi);
		System.out.println(Long.decode(strNum));  //3767221298
		
//		Function<String, Integer> parseInt = s -> Integer.parseInt(s);
//		
//		BiFunction<Integer, Integer, Integer> multiplier = 
//				  (i1, i2) -> i1 * i2; //you can’t omit parenthesis here!
		
		HexToLong.arr[2] = 1;
		System.out.println(HexToLong.arr[2]);
		byte b= 0x3F;
		String singleValue = String.format("%02x", b);
		System.out.println(singleValue);
		

		int fileTypeInt = Integer.parseInt("240");
		byte fileType = (byte) (fileTypeInt & 0xFF);
		System.out.println("===============" + fileType);
		
		HexToLong htl = new HexToLong();
		byte[] hexBytes = {0x1F,0x32,(byte) 0xf0};
		byte[] ret = htl.hexToAsciiToBytes(hexBytes );
		System.out.println("-------------Input----------------------------");
		for (byte r :hexBytes) {
			String singleValu1e = String.format("%02x",r);
			System.out.println(singleValu1e);
		}
		System.out.println("-------------Output----------------------------");
		for (byte r :ret) {
			String singleValu1e = String.format("%02x",r);
			System.out.println(singleValu1e);
		}
		System.out.println("string: "+new String(ret));
	}
	
	public byte[] hexToAsciiToBytes(byte[] hexBytes) {
		StringBuilder sb = new StringBuilder(hexBytes.length * 2);
		for (byte b : hexBytes) {
			String singleValue = String.format("%02x", b);
			Character string1 = singleValue.charAt(0);
			Character string2 = singleValue.charAt(1);
			if (isNumeric(string1)) {
				sb.append(string1);
			}
			if (isNumeric(string2)) {
				sb.append(string2);
			}
		}
		return sb.toString().getBytes();
	}

	private boolean isNumeric(Character strNum) {
		if (strNum == null || !Character.isDigit(strNum)) {
			return false;
		}
		return true;
	}


}
