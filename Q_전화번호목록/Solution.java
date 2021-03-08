package Q_전화번호목록;
import java.util.HashMap;

public class Solution {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		for(int i = 0; i < phone_book.length;i++) {
			hashMap.put(phone_book[i], "prefix");
			
		}
		for(String phone : phone_book) {
			for(int idx = 0; idx< phone.length();idx++) {
				if(hashMap.containsKey(phone.substring(0, idx))) {
					answer = false;
				}
			}
		}

		return answer;

	}
}

//정확성은 맞지만 런타임 에러
//for (int i = 0; i < phone_book.length - 1; i++) {
//
//	for (int j = i + 1; j < phone_book.length; j++) {
//		if (phone_book[i].startsWith(phone_book[j])) {
//			answer = false;
//
//		}
//		if (phone_book[j].startsWith(phone_book[i])) {
//			answer = false;
//		}
//	}
//}
//// array.startsWith ==> 문자열이 주어진 접두표현을 가지고 시작하는지 확인하는 함수
//// 이후 불린연산이 없을 경우에는 접두표현을 가지고 시작한다면 true 반환, 아니라면 false를 반환
//