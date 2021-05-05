package Q_괄호회전하기;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Solution {
	public int solution(String s) {
		int answer = 0;
		int length = s.length();
	
		List<Queue<Character>> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			list.add(new LinkedList<Character>());

		}
		char a = ' ';
		for (int i = 0; i < s.length(); i++) {
			StringBuilder sb = new StringBuilder();	
			
			for (int j = 0; j < s.length(); j++) {
				char testing = s.charAt(j);
				list.get(i).add(testing);
				
				if(j==0) {
					 a= testing;
					 
				}else {
					sb.append(testing);
				}
				if(j == s.length()-1) {
					sb.append(a);
				}
			}
			
			Iterator iter_l = list.iterator();
			System.out.println("list"+i);
			while(iter_l.hasNext()) {
				System.out.print(iter_l.next());
			}
			System.out.println();
			
		}
		

	


		while (length-- > 0) {
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < s.length(); i++) {
				for(int j = 0; j < s.length();j++) {
					char text  = list.get(i).poll();
					
					//System.out.println(text);
					stack.push(text);

					if (text == ']') {
						if (!stack.isEmpty() && stack.peek() == '[') {
							stack.pop();
						}
					} else if (text == '}') {
						if (!stack.isEmpty() && stack.peek() == '{') {
							stack.pop();
						}
					} else if (text == ')') {
						if (!stack.isEmpty() && stack.peek() == ')') {
							stack.pop();
						}
					}					
				}

			}
			
			if (stack.isEmpty()) {
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
		System.out.println(sol.solution(s));
	}
}
