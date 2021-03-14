package Q_�ùٸ���ȣ;

import java.util.Stack;

/*
 * 
 * �ݵ�� (�� �����ؼ� )�� ������
 * �ùٸ��� true �ƴϸ� false��ȯ
 * 
 * 
 * */
// ��Ǯ�� Stack x
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
//���۸� Stack Ȱ��
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
