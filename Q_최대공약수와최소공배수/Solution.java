package Q_최대공약수와최소공배수;

public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n,m);
        answer[1] = n*m / answer[0];
//        for(int i = 0; i< answer.length;i++) {
//        	System.out.print(answer[i] + "  ");
//        }
        return answer;
    }
    
    static int gcd( int a, int b) {
    	while(b !=0) {
    		int r= a%b;
    		a=b;
    		b=r;
    		
    	}
    	return a;
    	
    }
}
