package Q_������;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * ���� �տ� �ִ� ����(j)�� �븮��Ͽ��� ������
 * ������ ����Ͽ��� j���� �߿䵵�� ���� ������ �� ���� �����ϸ� ������� ���� �������� �ִ´�
 * �׷��� ������ j�� �μ��Ѵ�.
 * 
 * �߿䵵 ǥ�� ���ڴ� Ŭ���� �߿䵵�� ����
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
