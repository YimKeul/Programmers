package Q_���ڰ���;

import java.util.Arrays;

/*
 *2*N�� �� N�� �� ������ �̷�
 *��� �ο��� �������� �ڿ��� �ϳ��� �ο�
 *�� ��� �� �� ���� ��� ����
 *�� ���� A������ �� �����,B������ �� ����� ���� ������ �� ����
 *ū��� �¸�
 *�¸��� �� 1��
 *���� ���� ��� ���� x
 *A������ ��Ʈ�� ���� 
 *���� B������ ��Ʈ���� �ۼ��ϴµ� ���� ������ ���̱� ���� ���� ����
 *�̶� B���� ��� ������ ���ض�
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
