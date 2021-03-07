package Q_���̽�ƽ;
/*
 *name�� �빮�ڷθ� ���� (uppercase)
 *�� : ���� ���ĺ�
 *�Ʒ� : ���� ���ĺ�( A���� �Ʒ��� �̵��ϸ� Z)
 *�� : Ŀ���� �������� �̵� ( ù ��° ��ġ������ ������  ���� Ŀ���� �̵�)
 *�� : Ŀ���� ���������� �̵� 
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
			//System.out.println("�ǽð� : " + i + " " + answer + " " + min_move + " " +next +" // "+ (i + len-next + i));
		}
		
		answer += min_move;
		return answer;
	}
}
