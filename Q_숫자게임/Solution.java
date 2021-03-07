package Q_숫자게임;

import java.util.Arrays;

/*
 *2*N명 이 N명씩 두 팀으로 이룸
 *모든 인원이 무작위로 자연수 하나씩 부여
 *각 사원 딱 한 번씩 경기 진행
 *각 경기당 A팀에서 한 사원이,B팀에서 한 사원이 나와 서로의 수 공개
 *큰사람 승리
 *승리한 팀 1점
 *숫가 같을 경우 승점 x
 *A팀에서 엔트리 공개 
 *이후 B팀에서 엔트리를 작성하는데 최종 승점을 높이기 위해 순서 결정
 *이때 B팀이 얻는 승점을 구해라
 * 
 */

public class Solution {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		int a=0;
		int b= 0;
		
		for(int i = 0; i< A.length;i++) {
			if(A[a]>=B[b] ) {
				b++;
			}else {
				a++;
				b++;
				answer++;
			}
		}
		
		return answer;

	}
}
