package com.github.nenomm.codility.lesson07;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {
	// https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
	// https://app.codility.com/demo/results/trainingVDK4ET-Z6J/

	private static Map<Character, Character> brackets = new HashMap<Character, Character>(5);

	static {
		brackets.put(')', '(');
		brackets.put(']', '[');
		brackets.put('}', '{');
	}

	public static int solution(String S) {
		Stack<Character> stack = new Stack<Character>();

		for (Character c : S.toCharArray()) {
			if (brackets.containsKey(c)) {
				if (!stack.isEmpty()) {
					if (brackets.get(c) != stack.pop()) {
						return 0;
					}
				} else {
					return 0;
				}
			} else {
				stack.push(c);
			}
		}

		if (stack.isEmpty()) {
			return 1;
		}

		return 0;
	}
}
