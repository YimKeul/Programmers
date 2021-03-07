package Q_조이스틱;
/*
 *name은 대문자로만 형성 (uppercase)
 *위 : 다음 알파벳
 *아래 : 이전 알파벳( A에서 아래로 이동하면 Z)
 *좌 : 커서를 왼쪽으로 이동 ( 첫 번째 위치에서는 마지막  문자 커서로 이동)
 *우 : 커서를 오른쪽으로 이동 
 * 
 */
public class Solution {
	public int solution(String name) {
	
		int answer = 0;
		int len = name.length();
		int min_move = len-1;
		
		for(int i = 0 ; i < len; i++) {
			answer += Math.min( name.charAt(i) - 'A' , 'Z' - name.charAt(i) +1 );
			
			int next = i+1;
			while(next < len && name.charAt(next) == 'A') {
				next++;
				
				min_move = Math.min(min_move, i + len-next + i);
								
			}
			//System.out.println("실시간 : " + i + " " + answer + " " + min_move + " " +next +" // "+ (i + len-next + i));
		}
		
		answer += min_move;
		return answer;
	}
}
