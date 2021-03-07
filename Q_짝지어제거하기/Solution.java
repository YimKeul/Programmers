package Q_짝지어제거하기;

/*
 * 알파벳 소문자로 이루어진 문자열을 가지고 시작
 * 같은 알파벳이 2개 붙어 있는 짝을 탐색
 * 문자열 S가 주어졌을 때, 짝지어 제거하기를 성종적으로 수행할 수 있는지 반환하는 함수 작성
 * 성공할 수 있으면 1, 아닐경우 0 리턴
 */

/*
 *시나리오
 * S = baabaa
 * b aa baa
 * aa제거
 * bb aa
 * bb제거
 * aa
 * aa 제거
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
 이 문제는 스택을 이용해서 푸는 문제이다. 괄호를 이용하는 대표적인 스택문제와 아주 유사한 문제이다! baabaa를 예로 들어 코드를 설명해보겠다!

스택이 비어있으면 비교하지 않고, 바로 스택에 넣어야 하므로 b를 스택에 넣는다.

두번째 문자 a는 스택에 가장 탑에 있는 b와 비교를 하여, 동일한 문자가 아니면 a를 스택에 넣는다. 그렇다면 스택의 탑은 a가 된다.

세번째 문자 a도 스택에 가장 탑에 있는 a와 비교를 하고, 동일한 문자면 스택의 탑에 있는 문자를 뺀다.

위와 같은 것을 계속 반복하고, 스택이 비어있다면 모두 제거했다고 판단하여 1을 반환, 만약 스택에 문자가 남아 있다면 완전히 제거되지 않기 때문에 0을

반환한다. 그럼 문제는 끝난다!
 */
