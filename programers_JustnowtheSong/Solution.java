package programers_JustnowtheSong;
import java.util.*;

public class Solution {
	public String solution(String m, String[] musicinfos) {
		String answer = "'(None)'";
		int maxPT = 0;
		m = killSharp(m);
		for(int i =0; i< musicinfos.length;i++) {
			String s = killSharp(m);
			
			String[] sArr = s.split(",");
			String[] sttArr = sArr[0].split(":");
			String[] edtArr = sArr[1].split(":");
			
			int playHour = Integer.parseInt(edtArr[0]) - Integer.parseInt(sttArr[0]);
			int playMin = Integer.parseInt(edtArr[1]) - Integer.parseInt(sttArr[1])+(playHour*60);
			String music = makeMusic(sArr[3], playMin);
			
			if(music.contains(m)) {
				if(maxPT < playMin) {
					maxPT = playMin;
					answer = sArr[2];
				}
			}
		
		for(int j=0;j<sArr.length;j++) {
			System.out.println(sttArr[j]);
		}
		}
		
		
		
		
		
		return answer;
	}

	private String makeMusic(String s, int t) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<t;i++) {
			sb.append(s.charAt(i%s.length()));
			
		}
		return sb.toString();
	}

	private String killSharp(String s) {
		// TODO Auto-generated method stub
		s = s.replaceAll("A#", "a");
		s = s.replaceAll("C#", "c");
		s = s.replaceAll("D#", "d");
		s = s.replaceAll("F#", "f");
		s = s.replaceAll("G#", "g");
		
		return s;
	}
}
