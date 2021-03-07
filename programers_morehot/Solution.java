package programers_morehot;
import java.util.*;
public class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
      
        
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i < scoville.length;i++) {
        	list.add(scoville[i]);
        }
        
        int time = 0 ;
        
        for(int i = 0;i < list.size(); i++ ) {
        	time++;
        	for(int j = 0; j < list.size();j++) {
        		if(time == list.size()) {
        			if(K>=list.get(j)) {
        				answer = -1;
        			}
        		}
        	}
        	if(K<list.get(i)) {
        		list.sort(null);
        		int mix = list.get(i) + list.get(i+1);
        		list.remove(i);
        		list.remove(i);
        		
        		list.add(i,mix);
        		list.sort(null);
        		answer++;
        		
        	}
        
        
        
        }
    
        return answer;
    }
}
