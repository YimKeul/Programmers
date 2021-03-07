package Q_카카오프렌즈컬러링북;

public class main {
	public static void main(String args[]) {
		Solution sol = new Solution();
		int m =6;
		int n = 4;
		int picture[][] = {{1,1,1,0} ,{1,2,2,0}, {1,0,0,1}, {0,0,0,1}, {0,0,0,3}, {0,0,0,3} };
		
		sol.solution(m, n, picture);
		
	}
}
