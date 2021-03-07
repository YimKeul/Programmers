package Q_예상대진표;
/*
 * N명의 참가자 1~N번 차례대로 배정 
 * 1<->2 , 3<->4 .. N-1<->N 진행
 * 다음 순번은 N/2번으로 배정
 * 총인원이 1명이 될때까지 진행
 * 게임참가자 N, 참가자 번호 A, 경쟁자 번호 B 
 * 조건 : A참가자와 B참가자는 서로 붙기 전까지 항상 이긴다
 * 부전승 발생 x A != B
 */

/*
 * n, a, b = 8, 4, 7
 * 시나리오 
 * a b
 * _ a _ b 
 * _ _ _ a _ _ b _
 */

public class Solution {
	public int solution(int n, int a, int b) {
		int answer = 0;// 일단 냅두자

		while (n != 0) {
			System.out.println("n : "+n + " a : "+a+" b : " + b);
			if ( (a%2==0 && a == b + 1) || (b%2==0 && b == a + 1)) {
				answer++;
				//System.out.println("조건만족");
				break;
			}
			if (a % 2 == 0) {
				a = a / 2;
			} else {
				a = (a / 2) + 1;
			}
			if (b % 2 == 0) {
				b = b / 2;
			} else {
				b = (b / 2) + 1;
			}
			answer++;
			n = n / 2;
		
		}
		return answer;
	}

}