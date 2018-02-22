package com.github.nenomm.codility.lesson01;

public class BinaryGap {
	public static int solution(int N) {
		int i = 0;
		int maxGap = 0;
		boolean delimited = false;

		while (N != 0) {
			if ((N & 1) == 1) {
				if (delimited) {
					if (maxGap < i) {
						maxGap = i;
					}
					i = 0;
				} else {
					delimited = true;
				}
			} else {
				if (delimited) {
					i++;
				}
			}

			N = N >>> 1;
		}

		return maxGap;
	}
}
