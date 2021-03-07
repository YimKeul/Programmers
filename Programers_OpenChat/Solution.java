package Programers_OpenChat;
import java.util.*;

public class Solution {
	public String[] solution(String[] record) {

		List<String> List = new ArrayList<String>();
		Map<String, String> idmap = new HashMap<>();
		
		for(String str : record) {
			StringTokenizer token = new StringTokenizer(str);
			String cmd = token.nextToken();
			if(cmd.equals("Enter")||cmd.equals("Change")) {
				String id = token.nextToken();
				String name = token.nextToken();
				idmap.put(id, name);
			}
		}

		for(String str : record) {
			StringTokenizer token = new StringTokenizer(str);
			String cmd = token.nextToken();
			if(cmd.equals("Enter")) {
				String id = token.nextToken();
				List.add(idmap.get(id)+"���� ���Խ��ϴ�.");
				
			}else if(cmd.equals("Leave")) {
				String id = token.nextToken();
				List.add(idmap.get(id)+"���� �������ϴ�.");
				
			}
		}
		
		String[] answer = new String[List.size()];
		List.toArray(answer);
		int cnt = 0;
		while(cnt<List.size()) {
			if(cnt==List.size()) {
				break;
			}
			else {
			System.out.println(List.get(cnt));
			
			}
			cnt++;
		}
		
	
		return answer;
	}
}
