package Q_������Ӹ����;


/*
 * �Ҹ����
 * �еڸ� ����� �Ȱ��� ���ڿ�
 * 
 * 
 * 
 */
public class Solution {
	public int solution(String s) {
		int answer = 0;
		char [] chr = s.toCharArray();
		for(int i = s.length(); i > 1; i--) {
			
			for(int start = 0 ; start + i <= s.length();start++) {
				boolean chk = true;
				for(int j = 0; j< i/2;j++) {
					if(chr[start + j] != chr[start + i - j -1]) {
						chk = false;
						break;
					}
				}
				if (chk) return i;
			}
		}
		
		return 1;
	}
}
