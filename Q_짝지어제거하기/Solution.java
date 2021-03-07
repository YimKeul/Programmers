package Q_¦���������ϱ�;

/*
 * ���ĺ� �ҹ��ڷ� �̷���� ���ڿ��� ������ ����
 * ���� ���ĺ��� 2�� �پ� �ִ� ¦�� Ž��
 * ���ڿ� S�� �־����� ��, ¦���� �����ϱ⸦ ���������� ������ �� �ִ��� ��ȯ�ϴ� �Լ� �ۼ�
 * ������ �� ������ 1, �ƴҰ�� 0 ����
 */

/*
 *�ó�����
 * S = baabaa
 * b aa baa
 * aa����
 * bb aa
 * bb����
 * aa
 * aa ����
 * 
 * return = 1
 */
// test case : 9/10 ,, efficiency test : 0/10
//public class Solution {
//	public int solution(String s) {
//		StringBuilder sb = new StringBuilder(s);
//		int answer = 1;
//		int length = sb.length();
//		int i = 0;
//		while (length != 0) {
//
//			if (sb.charAt(i) != sb.charAt(i + 1)) {
//
//				i++;
//
//			} else if (sb.charAt(i) == sb.charAt(i + 1)) {
//
//				sb.replace(i, i + 2, "");
//				length -= 2;
//
//				i = 0;
//			}
//			
//
//			if (i == length - 1) {
//				break;
//			}
//		}
//
//		if (length == 0) {
//			return answer;
//		} else {
//			return 0;
//		}
//
//	}
//}
import java.util.Stack;

public class Solution {
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
         
        for(char c : s.toCharArray()) 
          if(!stack.isEmpty() && stack.peek() == c) stack.pop();
          else stack.push(c);
         
        return stack.isEmpty() ? 1 : 0;
    }
}
/*
 �� ������ ������ �̿��ؼ� Ǫ�� �����̴�. ��ȣ�� �̿��ϴ� ��ǥ���� ���ù����� ���� ������ �����̴�! baabaa�� ���� ��� �ڵ带 �����غ��ڴ�!

������ ��������� ������ �ʰ�, �ٷ� ���ÿ� �־�� �ϹǷ� b�� ���ÿ� �ִ´�.

�ι�° ���� a�� ���ÿ� ���� ž�� �ִ� b�� �񱳸� �Ͽ�, ������ ���ڰ� �ƴϸ� a�� ���ÿ� �ִ´�. �׷��ٸ� ������ ž�� a�� �ȴ�.

����° ���� a�� ���ÿ� ���� ž�� �ִ� a�� �񱳸� �ϰ�, ������ ���ڸ� ������ ž�� �ִ� ���ڸ� ����.

���� ���� ���� ��� �ݺ��ϰ�, ������ ����ִٸ� ��� �����ߴٰ� �Ǵ��Ͽ� 1�� ��ȯ, ���� ���ÿ� ���ڰ� ���� �ִٸ� ������ ���ŵ��� �ʱ� ������ 0��

��ȯ�Ѵ�. �׷� ������ ������!
 */
