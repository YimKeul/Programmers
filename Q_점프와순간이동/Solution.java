package Q_�����ͼ����̵�;

public class Solution {
	public int solution(int n) {
		int answer = 0;
		
		int mod =0;
		
		while(true) {
			
		
			if( n%2 ==1) {
				mod++;
			}
			
			else if(n/2==0) {
				
				break;
			}
			n = n/2;
			
		}
		answer = mod;
		
			
		return answer;

	}
}
