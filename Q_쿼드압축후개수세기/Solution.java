package Q_쿼드압축후개수세기;

public class Solution {
	public int[] solution(int[][] arr) {
		int[] answer = new int[2]; // 0 / 1

		int N = arr.length;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 0) {
					answer[0]++;
				} else {
					answer[1]++;
				}
			}

			if (i == N - 1) {
				System.out.println(answer[0] + " " + answer[1]);
			}
		}
		
		boolean [][] v = new boolean[N][N];
		for(int i = N; i>1; i/=2) {
			for(int j = 0; j<N; j+=i) {
				
			}
		}
		
		
		return answer;
	}
}

/*
 * import java.util.*;
class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        int N = arr.length;
        for(int i =0; i< N; i++){
            for(int j = 0; j< N; j++){
                if(arr[i][j]==0)answer[0]++;
                else if(arr[i][j]==1)answer[1]++;
            }
        }
        boolean[][] v = new boolean[N][N];
        for(int n = N; n>1 ; n/=2){// 쪼개는 크기를 알려줌, 4->2->1
            for(int i = 0; i< N; i+=n){ //      0
                for(int j = 0; j< N; j+=n){ //  0
                    if(v[i][j])continue;
                    int flag = arr[i][j];
                    int a =i, b = j;
                    loop: 
                    for(a=i; a<i+n; a++){
                        for(b=j; b<j+n; b++){
                           if(flag!=arr[a][b])break loop;
                        }
                    }
                    if(a==i+n && b == j+n){
                        for(a=i; a<i+n; a++){
                            for(b= j ; b<j+n; b++){
                                v[a][b] = true;
                            }
                        }
                        answer[flag]-=n*n;
                        answer[flag]++;
                    }
                }
            }
        }
        return answer;
    }
}
 * */

