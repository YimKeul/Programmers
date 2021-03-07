package Q_프린터;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * 가장 앞에 있는 문서(j)를 대리목록에서 꺼낸다
 * 나머지 대기목록에서 j보다 중요도가 높은 문서가 한 개라도 존재하면 대기목록의 가장 마지막에 넣는다
 * 그렇지 않으면 j를 인쇄한다.
 * 
 * 중요도 표시 숫자는 클수록 중요도가 높다
 * 
 */
public class Solution {
	public int solution(int [] priorities, int location	) {
		int answer =0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int priority : priorities) {
			pq.offer(priority);
		}
		
	
		
		while(!pq.isEmpty()) {
		
			for (int i = 0; i < priorities.length;i++) {
				
				if(pq.peek() == priorities[i]) {
					pq.poll();
					answer++;
					if(location == i) {
						pq.clear();
						break;
						
					}
				}
				
			}
			
		}
		
		
		return answer;
		
	}
}
