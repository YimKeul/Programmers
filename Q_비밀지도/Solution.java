package Q_�������;

public class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {

		int arr_length= arr1.length;
		String answer [] = new String [arr_length];
		
        for(int i = 0 ; i < n ; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); // | <- ��Ʈ ������ , integer.toBinaryString => 10->2���� ����
        }
        
        for(int i = 0 ; i < n ;i++) {
            answer[i] = String.format("%" + n + "s", answer[i]); //String.format -> ä���
            answer[i] = answer[i].replace('1', '#');
            answer[i] = answer[i].replace('0', ' ');
        }
        
        
        for(int i = 0 ; i < n ;i++) {
        	System.out.println(answer[i]);
        }
		return answer;
	}
}
