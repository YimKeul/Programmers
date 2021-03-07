package Q_야근지수;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
	public long solution(int n, int[] works) {
		long answer = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int work : works) {
			pq.offer(work);
		}
		
		for(int i = 0 ; i < n; i ++) {
			int max =(int) pq.poll();
			if( max <= 0) {
				break;
			}
			pq.offer(max-1);
			
		}
		
		while(true) {
			answer += Math.pow(pq.poll(), 2);
			if(pq.size() == 0) {
				break;
			}
			
		}
		return answer;
	}
}
//long answer = 0;
//
//int sum = 0;
//for (int i = 0; i < works.length; i++) {
//	sum += works[i];
//}
//
//if (sum > n) {
//	for (int N = n; N > 0; N--) {
//		Arrays.sort(works);
//		works[works.length - 1]--;
//
//	}
//	for (int j = 0; j < works.length; j++) {
//		answer += Math.pow(works[j], 2);
//
//	}
//
//}
//
//else {
//	answer = 0;
//}
//
//return answer;
