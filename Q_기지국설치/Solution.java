package Q_��������ġ;


/*
 *	����Ʈ ���� n
 *  ���� ������� ��ġ�� ����Ʈ�� ��ȣ�� ��� �迭 stations
 *  ������ ���� �Ÿ� w
 *   
 * 
 */
public class Solution {
public int solution(int n , int [] stations, int w) {
	
    int answer = 0;
    int location = 1;//�������� ��ġ�� ���� ��ġ
    int idx = 0;//��ġ�� ������ �ε���

    while(location <= n) {//��ġ�� ��ü �������� �۰ų� ���� ������

        //��ġ�� ������ ���� �ȿ� �����鼭, ���� ��ġ�� ��ġ�� �������� �������� Ŭ ��,
        if (idx < stations.length && location >= stations[idx]-w) {

            location = stations[idx]+w+1;//��ġ�� �������� �������� +1 ū ��ġ�� �̵�
            idx++;//���� �ε����� �̵�
        } else {//��ġ�� ������ ���� ���� ��,

            location += 2*w+1;//�������� ������ ���� �ִ� +1�� ���ش�.
            answer++;//�������� ��ġ�����Ƿ�, ������� �߰�
        }
    }

	
	return answer;
}
}

/*
 * 	int answer = 0;
	int range = 0;// ����ҰŴ� ���
	int minus_idx  =0;
	for(int i = 0 ; i < stations.length;i++) {
		if(stations[i]-w <0) {
			//���࿡ sta[i] �� 2 �̰� w�� 3�ϰ��� �����ϸ�
			//minus_idx�� -1 �� �ʰ��Ǵ°�
			
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
