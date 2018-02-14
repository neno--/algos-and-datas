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

	public static void hardRecursive(String source) {
		hardRecursiveInternal(source, new char[source.length()], 0);
	}

	public static void hardRecursiveInternal(String source, char[] result, int position) {
		for (int i = position; i < source.length(); i++) {
			if (i == position) {
				continue;
			}
			result[position] = source.charAt(i);
			System.out.println(new String(result, 0, position + 1));
			hardRecursiveInternal(source, result, position + 1);
		}
	}

	public static void recursiveChemistry(String source, char[] result, int position) {
		if (position == (source.length() - 1)) {
			result[position] = source.charAt(position);
			System.out.println(new String(result, position, 1));
		} else {
			recursiveChemistry(source, result, position + 1);
			System.out.println(source.charAt(position));
			result[position] = source.charAt(position);
			for (int i = 0; i < (source.length() - position); i++) {
				//System.out.println(source.charAt(position) + );
			}
		}
	}
}
