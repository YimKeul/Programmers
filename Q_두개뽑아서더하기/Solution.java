package Q_두개뽑아서더하기;

import java.awt.List;
import java.util.*;

public class Solution {
	public int[] solution(int[] numbers) {
		
		ArrayList<Integer> test = new ArrayList<Integer>();
		int cnt = 0;
		for(int i = 1; i<numbers.length;i++) {
			int x = numbers[cnt];
			int plus = x + numbers[i];
			test.add(plus);
			
			if(i == numbers.length-1) {
				cnt++;
				 i = cnt;
				
				 if(cnt == numbers.length-1) {
					 break;
				 }
			}
		}
		
		//Collections.sort(test);
		
		HashSet<Integer> set = new HashSet<Integer>(test);
		test = new ArrayList<Integer>(set);
		
		int[] answer = new int [test.size()];
		for(int i = 0; i < test.size();i++) {
			answer[i] = test.get(i);
			System.out.print(answer[i] + " ");
		}
		return answer;
	}
}
