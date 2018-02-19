package com.github.nenomm.bitsnbytes;

public class ByteUtils {
	public static int countOnes(int number) {
		int result = 0;

		for (int i = 0; i < 4 * 8; i++) {
			if ((number & 1) > 0) {
				result++;
			}
			number = number >> 1;
		}

		return result;
	}

	public static String showBits(int number) {
		char[] word = new char[32];

		for (int i = 0; i < 32; i++) {
			if ((number & 1) > 0) {
				word[31 - i] = '1';
			} else {
				word[31 - i] = '0';
			}
			number = number >> 1;
		}

		return new String(word);
	}
}
