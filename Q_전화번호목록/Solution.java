package Q_��ȭ��ȣ���;

public class Solution {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		// ��Ȯ���� ������ ��Ÿ�� ����
		for (int i = 0; i < phone_book.length - 1; i++) {

			for (int j = i + 1; j < phone_book.length; j++) {
				if (phone_book[i].startsWith(phone_book[j])) {
					answer = false;

				}
				if (phone_book[j].startsWith(phone_book[i])) {
					answer = false;
				}
			}
		}
		// array.startsWith ==> ���ڿ��� �־��� ����ǥ���� ������ �����ϴ��� Ȯ���ϴ� �Լ�
		// ���� �Ҹ������� ���� ��쿡�� ����ǥ���� ������ �����Ѵٸ� true ��ȯ, �ƴ϶�� false�� ��ȯ
		
		return answer;

	}
}
