package com.github.nenomm.string;

public class ParseInteger {
	public static int toInt(String number) {
		char src[] = number.toCharArray();
		int result = 0;
		char letter;
		int offset = 0;
		int weight = 1;

		if (src[0] == '-') {
			offset = 1;
		}

		for (int i = 0; i < (src.length - offset); i++) {
			letter = src[src.length - 1 - i];
			result += (letter - '0') * weight;
			weight *= 10;
		}

		return (offset == 0 ? result : -result);
	}

	public static String fromInt(int number) {
		String result = "";
		int digit;
		boolean negative = false;

		if (number < 0) {
			negative = true;
			number = -number;
		}

		if (number == 0) {
			return "0";
		}

		while (number != 0) {
			digit = number % 10;
			number = number / 10;

			result = digit + result;
		}

		return (negative ? "-" + result : result);
	}
}
