package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
	Map<Character, Character> mappings = new HashMap<>();
	ValidParenthesis(){
		mappings.put('(', ')');
		mappings.put('[', ']');
		mappings.put('{', '}');
	}

	/* create a mapping map of all the parenthesis types (=), [=], {=} 
	 * loop through the input string and read each character one by one 
	 * check if the character is available in keySet
	 * 	push the value of character key in the stack
	 * else check if character is available in valueSet 
	 * 	return false if stack is empty or top of stack is not equal to character
	 * 
	 * after scanning each character form string return true if the stack remains empty at the end
	 * */

	public boolean isValid1(String s) {        
		Stack<Character> parenthesis = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (mappings.containsKey(c)) {
				parenthesis.push(mappings.get(c));
			} else if (mappings.containsValue(c)) {
				if (parenthesis.isEmpty() || parenthesis.pop() != c) {
					return false;
				}
			}
		}
		return parenthesis.isEmpty();
	}

	public static void main(String[] args) {
		ValidParenthesis vp = new ValidParenthesis();
		System.out.println(vp.isValid1("((()[]]{{}}"));
		System.out.println(vp.isValid2("((()[]]{{}}"));
	}

	private boolean isValid2(String string) {
		Stack<Character> stk = new Stack<Character>();
		char chFromString;
		for(int counter = 0;counter<string.length();counter++) {
			chFromString = string.charAt(counter);
			if(chFromString == '(' || chFromString == '[' || chFromString == '{') {
				stk.push(chFromString);
				continue;
			}
			else {
				if(stk.isEmpty())
					return false;
				char chFromStack = stk.pop();
				switch (chFromString) {
				case ')':
					if(chFromStack == '[' || chFromStack == '{')
						return false;
					break;
				case ']':
					if(chFromStack == '(' || chFromStack == '{')
						return false;
					break;
				case '}':
					if(chFromStack == '[' || chFromStack == '(')
						return false;
					break;
				}
			}
		}
		return stk.isEmpty();
	}
}
