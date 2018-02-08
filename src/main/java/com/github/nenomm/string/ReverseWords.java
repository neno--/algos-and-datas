package com.github.nenomm.string;

public class ReverseWords {
	public static String reverseWords(String words) {
		if (words == null) {
			return null;
		} else if (words.length() <= 1) {
			return new String(words);
		}

		char[] src = words.toCharArray();
		char[] tmp = new char[src.length];

		int i = 0, j = 0;
		int srcIndex;

		while (true) {
			srcIndex = src.length - 1 - i;

			if (i >= src.length) {
				if (j != 0) {
					copyPart(tmp, src, i, j);
				}
				break;

			}

			if (src[srcIndex] == ' ') {
				copyPart(tmp, src, i, j);

				// jump over blanks
				while ((i < src.length) && (src[srcIndex] == ' ')) {
					tmp[i] = ' ';
					i++;
					srcIndex = src.length - 1 - i;
				}

				j = 0;
				continue;
			}

			j++;
			i++;
		}

		return new String(tmp);
	}

	private static void copyPart(char[] tmp, char[] src, int i, int j) {
		int srcIndex = src.length - 1 - i;

		for (int k = 0; k < j; k++) {
			tmp[i - j + k] = src[srcIndex + k + 1];
		}
	}
}
