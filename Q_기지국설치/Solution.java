package Q_기지국설치;


/*
 *	아파트 개수 n
 *  현재 기기죽이 설치된 아파트의 번호가 담긴 배열 stations
 *  전파의 도달 거리 w
 *   
 * 
 */
public class Solution {
public int solution(int n , int [] stations, int w) {
	
    int answer = 0;
    int location = 1;//기지국을 설치할 현재 위치
    int idx = 0;//설치된 기지국 인덱스

    while(location <= n) {//위치가 전체 갯수보다 작거나 같을 때까지

        //설치된 기지국 범위 안에 있으면서, 현재 위치가 설치된 기지국의 범위보다 클 때,
        if (idx < stations.length && location >= stations[idx]-w) {

            location = stations[idx]+w+1;//설치된 기지국의 범위보다 +1 큰 위치로 이동
            idx++;//다음 인덱스로 이동
        } else {//설치된 기지국 범위 밖일 때,

            location += 2*w+1;//양쪽으로 범위를 가질 최댓값 +1을 해준다.
            answer++;//기지국을 설치했으므로, 결과값을 추가
        }
    }

	
	return answer;
}
}

/*
 * 	int answer = 0;
	int range = 0;// 계산할거니 기달
	int minus_idx  =0;
	for(int i = 0 ; i < stations.length;i++) {
		if(stations[i]-w <0) {
			//만약에 sta[i] 가 2 이고 w가 3일경우라 생각하면
			//minus_idx는 -1 이 초과되는것
			
			minus_idx = stations[i] - w;
			
			range+=minus_idx;
			
		}
		//sta == 9 n == 11 w ==3
		//
		if(stations[i] + w > n	 ) {
			minus_idx = n-(stations[i]+w);
			range+=minus_idx;
			
		}
	}
	int max_range = w*2+1;
	int real_range = max_range-range;
	
	int rr = n - real_range;
	int m = rr/max_range;
	int d = rr% max_range;
	
	answer = m+d;
	
	return answer;*/
