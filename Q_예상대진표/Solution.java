package Q_�������ǥ;
/*
 * N���� ������ 1~N�� ���ʴ�� ���� 
 * 1<->2 , 3<->4 .. N-1<->N ����
 * ���� ������ N/2������ ����
 * ���ο��� 1���� �ɶ����� ����
 * ���������� N, ������ ��ȣ A, ������ ��ȣ B 
 * ���� : A�����ڿ� B�����ڴ� ���� �ٱ� ������ �׻� �̱��
 * ������ �߻� x A != B
 */

/*
 * n, a, b = 8, 4, 7
 * �ó����� 
 * a b
 * _ a _ b 
 * _ _ _ a _ _ b _
 */

public class Solution {
	public int solution(int n, int a, int b) {
		int answer = 0;// �ϴ� ������

		while (n != 0) {
			System.out.println("n : "+n + " a : "+a+" b : " + b);
			if ( (a%2==0 && a == b + 1) || (b%2==0 && b == a + 1)) {
				answer++;
				//System.out.println("���Ǹ���");
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