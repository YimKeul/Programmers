package Q_��ȭ��ȣ���;
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

//��Ȯ���� ������ ��Ÿ�� ����
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
//// array.startsWith ==> ���ڿ��� �־��� ����ǥ���� ������ �����ϴ��� Ȯ���ϴ� �Լ�
//// ���� �Ҹ������� ���� ��쿡�� ����ǥ���� ������ �����Ѵٸ� true ��ȯ, �ƴ϶�� false�� ��ȯ
//