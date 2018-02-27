package com.github.nenomm.codility.lesson07;

import java.util.Stack;

public class StoneWall {
	// https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/
	// solution https://codility.com/media/train/solution-stone-wall.pdf
	// https://app.codility.com/demo/results/trainingHWSJP6-GGQ/ 14%
	// inspired by https://gist.github.com/Ceva24/8493120
	// https://app.codility.com/demo/results/trainingK8WDK4-J7Z/

	public static int solution(int[] H) {
		Stack<Integer> stack = new Stack<Integer>();
		int blocks = 0;
		int currentHeight = 0;

		for (int h : H) {
			if (h < currentHeight) {

				while (!stack.isEmpty()) {
					currentHeight -= stack.pop();
					if (h >= currentHeight) {
						break;
					}
				}
			}

			if (h > currentHeight) {
				stack.push(h - currentHeight);
				blocks++;
				currentHeight = h;
			}
		}

		return blocks;
	}
}