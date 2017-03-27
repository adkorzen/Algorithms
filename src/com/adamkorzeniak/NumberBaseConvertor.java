package com.adamkorzeniak;

public class NumberBaseConvertor {

	public String decimalToBinary(int decimal) {
		String binary = "";
		
		do {
			binary = decimal%2 + binary;
			decimal /= 2;
		} while (decimal > 0);
		
		return binary;
	}
	
	public int binaryToDecimal(String binary) {
		int decimal = 0;
		int multiplier = 1;
		
		char[] bits = binary.toCharArray();
		
		for (int i = bits.length - 1; i >= 0; i--) {
			decimal += Character.getNumericValue(bits[i]) * multiplier;
			multiplier *= 2;
		}
		
		return decimal;
	}
}
