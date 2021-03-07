package programers_JustnowtheSong;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		String[] musicinfos = {"12:00,12:14,HELLO,CDEFGAB","13:00,13:05,WORLD,ABCDEF"};
		String m = "ABCDEFG";
		
		System.out.println(sol.solution(m, musicinfos));
	}

}
