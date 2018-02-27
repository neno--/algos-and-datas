package com.github.nenomm.codility.lesson07;

import java.util.Stack;

public class Fish {
	// https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/
	// https://app.codility.com/demo/results/trainingKSBXBW-R6H/

	public static int solution(int[] A, int[] B) {
		final int[] sizes = A; // unique members
		final int[] direction = B;
		final int DOWNSTREAM = 1;

		int aliveUpstreamFishes = 0;

		Stack<Integer> downstreamFishes = new Stack<Integer>();

		for (int i = 0; i < sizes.length; i++) {
			if (direction[i] == DOWNSTREAM) {
				downstreamFishes.push(i);
				continue;
			}

			while (!downstreamFishes.isEmpty()) {
				int fish = downstreamFishes.pop();
				if (sizes[fish] > sizes[i]) {
					downstreamFishes.push(fish);
					break;
				}
			}

			if (downstreamFishes.isEmpty()) {
				aliveUpstreamFishes++;
			}
		}

		return aliveUpstreamFishes + downstreamFishes.size();
	}
}
