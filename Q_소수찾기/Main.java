package Q_소수찾기;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Solution s = new Solution();
		String numbers = "17";
		
		System.out.println(s.solution(numbers));
	}
}

class Solution {
	public int solution(String numbers) {
		int answer = 0;
		String[] strArr = numbers.split("");
		int [] numArr = new int[strArr.length];
		for(int i = 0; i< numArr.length;i++) {
			numArr[i] = Integer.parseInt(strArr[i]);
			
		}
		
		
		//17 : 입력된 문자열을 split함수로 쪼개서 문자열 배열로 저장
		//18 ~21 : 정수형 배열에 값 저장
		
		Set<Integer> set = new HashSet<>();
		
		for(int i =1; i <=numArr.length;i++) {
			perm(strArr,0,i,set);
		}
		answer = set.size();
		return answer;
		
	}

	public void perm(String[] arr, int depth, int k, Set set) {
		if(depth==k) {
			print(arr,k,set);
			return;
		}else {
			for(int i = depth;i<arr.length;i++) {
				swap(arr,i,depth);
				perm(arr,depth+1,k,set);
				swap(arr,i,depth);
			}
		}
		
	}

	private void print(String[] arr, int k, Set set) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<k;i++) {
			sb.append(arr[i]);
		}
		primeNumber(set, sb);
	}
	

	public void swap(String[] arr, int i, int j) {
		// TODO Auto-generated method stub
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] =temp;
	}

	public void primeNumber(Set set , StringBuilder s ) {
		int num = Integer.parseInt(String.valueOf(s));
		boolean prime = true;
		if(num<=1) {
			return;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				prime = false;
				break;
			}
		}
		if(prime) {
			set.add(num);
		}
	}
	
}