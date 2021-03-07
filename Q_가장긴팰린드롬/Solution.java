package Q_가장긴팰린드롬;


/*
 * 팬린드롬
 * 압뒤를 뒤집어도 똑같은 문자열
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
