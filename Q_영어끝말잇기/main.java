package Q_영어끝말잇기;

public class main {
	public static void main(String args[]) {
		Solution sol = new Solution();

		int n = 3;
		String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
		System.out.println(sol.solution(n, words));
	}
}
