package Q_괄호회전하기;

import java.util.Stack;

class Solution {
	public int solution(String s) {
		int answer = 0;
		int length = s.length();
		
		//스택은 반복문 안에 저장해야할듯
		
		String sample = s;
		
		String arr [] = new String [length];
		arr[0] = sample;
		
		for(int i = 1 ; i< length; i++) {
			String first = arr[i-1].substring(0,1);
			String temp = arr[i-1].substring(1,length);
			arr[i] = temp + first;
			
		}
		
		for(int i = 0 ; i<length; i++) {
			//테스트
			//System.out.println(arr[i]);
			Stack<Character> stack = new Stack<Character>();
			
			for(int j = 0; j < arr[i].length(); j++) {
		
				char c = arr[i].charAt(j);
				if(c == '(' || c == '{' || c == '[') {
					stack.push(c);
				}else if( c == ')') {
					if(!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();
					}else {
						stack.push(c);
					}
				}else if( c == '}') {
					if(!stack.isEmpty() && stack.peek() == '{') {
						stack.pop();
					}else {
						stack.push(c);
					}
				}else if( c == ']') {
					if(!stack.isEmpty() && stack.peek() == '[') {
						stack.pop();
					}else {
						stack.push(c);
					}
				}
			}
			
			if(stack.isEmpty()) {
				answer++;
			}
		}
		
		
		
		

		return answer;
	}
}

public class Main {
	public static void main(String args[]) {
		Solution sol = new Solution();
		String s = "[](){}";
		String s_2 = "}]()[{";
		String s_3 = "[)(]";
		System.out.println(sol.solution(s));
		System.out.println(sol.solution(s_2));
		System.out.println(sol.solution(s_3));
	}
}
