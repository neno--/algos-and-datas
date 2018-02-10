package com.github.nenomm.recursion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Permutation {
	private static Logger log = LoggerFactory.getLogger(Permutation.class);

	public static void permute(String source) {
		boolean[] used = new boolean[source.length()];
		permuteInternal(source, new char[source.length()], used, 0);
	}

	private static void permuteInternal(String source, char[] result, boolean[] used, int offset) {

		//log.info("Current state: {}, offset: {}", new String(result), offset);

		if (offset == source.length()) {
			System.out.println(new String(result));
		} else {
			for (int i = 0; i < source.length(); i++) {
				if (!used[i]) {
					used[i] = true;
					result[offset] = source.charAt(i);
					permuteInternal(source, result, used, offset + 1);
					used[i] = false;
				}
			}
		}
	}
}
