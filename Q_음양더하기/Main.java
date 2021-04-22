package Q_음양더하기;

class Solution {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		int result [] = new int [absolutes.length];
		
		int length = absolutes.length;
		
		for(int i = 0; i < length; i++) {
			if(signs[i]) {
				result[i] = absolutes[i];
			}else {
				result[i]  = -absolutes[i];
			}
		}
		
		for(int i = 0 ; i< length; i++) {
			answer += result[i];
		}
		
		
		
		
		
		
		
		
		return answer;

	}
}

public class Main {
	public static void main(String args[]) {
		int[] absolutes = { 1, 2, 3 };
		boolean[] signs = { false, false, true };
		Solution sol = new Solution();
		System.out.println(sol.solution(absolutes, signs));

	}
}
