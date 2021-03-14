package Q_올바른괄호;

import java.util.Stack;

/*
 * 
 * 반드시 (로 시작해서 )로 끝날것
 * 올바르면 true 아니면 false반환
 * 
 * 
 * */
// 내풀이 Stack x
class Solution {
	boolean solution(String s	) {
		boolean answer = true;
		
		int size = s.length();
		
		if(s.charAt(0) == ')' || s.charAt(size-1) == '(') {
			answer = false;
		}
		else {
			int sum = 0;
			int idx = 0;
			int chance = 0;
			for(int i = 1; i <= size-2; i++) {
				
				if(s.charAt(i) == '(') {
					idx = 1;
					sum += idx;
				}else {
					idx = -1;
					sum += idx;
					if(i > 1 && sum < -1) {
						chance += 1;
					}
				}
			}
			
			if( sum != 0 || chance >0) {
				answer = false;
			}else {
				answer = true;
			}
		}
		
		
		
		
		return answer;
	}
}
//구글링 Stack 활용
class solution_2{
	boolean solution_2(String s) {
		boolean answer = true;
		
		Stack<Character> stack = new Stack<Character>()	;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)== '(') {
				stack.push('(');
				
			}else {
				if(stack.isEmpty()) {
					return false;
				}else {
					stack.pop();
					
				}
			}
		}
		answer = (stack.isEmpty()) ? true : false;
		return answer;
	}
}


public class main {
	public static void main(String args[]) {
		Solution sol = new Solution();
		String s = "()))((()";
		System.out.println(sol.solution(s));
	}
}
