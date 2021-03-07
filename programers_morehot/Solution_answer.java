package programers_morehot;

import java.util.concurrent.PriorityBlockingQueue;

public class Solution_answer {

	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityBlockingQueue<Integer> heap = new PriorityBlockingQueue<>();
		int aScoville = 0;
		
		for(int i = 0; i < scoville.length; i++) {
			heap.add(scoville[i]);
		}
		while (heap.peek() < K) {
			if(heap.size() == 1) return -1;
			
			int val1 = heap.poll();
			int val2 = heap.poll();
			
			int result = val1+val2*2;
			
			heap.add(result);
			answer++;
		}
		return answer;
	}

}
