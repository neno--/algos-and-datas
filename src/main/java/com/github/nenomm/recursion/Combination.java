package com.github.nenomm.recursion;

public class Combination {

	/**
	 * iterative approach, repeatable - this is wrong, this is NOT returning all combinations!
	 */
	public static void simple(String source) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < source.length(); i++) {
			result.append(source.charAt(i));
			System.out.println(result);
			for (int j = 0; j < source.length(); j++) {
				if (i == j) {
					continue;
				}
				if (j < i) {
					result.append(source.charAt(j));
					System.out.println(result);
				}
			}
			result = new StringBuilder();
		}
	}

	/**
	 * recursive approach, repeatable
	 */

	public static void simpleRecursive(String source) {
		for (char[] word : simpleRecursiveInternal(source, 0)) {
			System.out.println(new String(word));
		}
	}

	private static char[][] simpleRecursiveInternal(String source, int position) {
		if (position == (source.length() - 1)) {
			return new char[][]{{source.charAt(position)}};
		} else {
			char[][] intermediateResult = simpleRecursiveInternal(source, position + 1);
			char[][] temp = new char[intermediateResult.length * 2 + 1][];
			System.arraycopy(intermediateResult, 0, temp, 0, intermediateResult.length);

			temp[intermediateResult.length] = new char[]{source.charAt(position)};

			int offset = intermediateResult.length + 1;
			for (int i = 0; i < intermediateResult.length; i++) {
				temp[i + offset] = new char[intermediateResult[i].length + 1];
				temp[i + offset][0] = source.charAt(position);
				System.arraycopy(intermediateResult[i], 0, temp[i + offset], 1, intermediateResult[i].length);
			}
			return temp;
		}
	}
}
