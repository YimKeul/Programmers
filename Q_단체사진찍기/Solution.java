package Q_단체사진찍기;

import java.util.HashMap;

// A C F J M N R T : 어피치 콘 프로도 제이지 무지 네오 라이언 튜브
// 0 1 2 3 4 5 6 7


//data[] 에서 항상 두번째 글자는 ~ : data[i].charAt(2) = "~"
//data[] 네번째 글자는 세개중 하나 : data[i].chatAt(4) = " = , < , >"
//data[] 다섯번째 글자 : data[i].charAt(5) = 0<= x <= 6 // 정수형 문자
//간격 의미


//36 63 // 

class Solution {
    static String[] d;
    static HashMap<Character,Integer> map ;
    static boolean[] visited;
    static int[] ch;
    static int answer;
    
    public int solution(int n, String[] data) {
        d = data;
        map = new HashMap<>();
        visited = new boolean[8];
        ch = new int[8];
        answer = 0;
        map.put('A',0);
        map.put('C',1);
        map.put('F',2);
        map.put('J',3);
        map.put('M',4);
        map.put('N',5);
        map.put('R',6);
        map.put('T',7);
        dfs(0);
        return answer;
    }
    
    public static void dfs(int idx){
        if(idx == 8){
            if(check()) answer++;
        }
        else{
            for(int i=0;i<8;i++){
                if(!visited[i]){
                    visited[i] = true;
                    ch[idx] = i;
                    dfs(idx + 1);
                    visited[i] = false;
                }
            }
        }
    }
    
    
    

    
    public static boolean check(){
        int a,b,res;
        char op;
        for(String s : d){
            a = ch[map.get(s.charAt(0))];
            b = ch[map.get(s.charAt(2))];
            op = s.charAt(3);
            res = s.charAt(4)-'0' + 1;
            //charAt() - '0' 에서  - '0'하는 이유는 char형으로 캐스팅한 후에 정확한 수로 표현하기 위해서
            // 캐릭터별 주소값이 -1상태이기때문
            
            if(op == '='){ if(Math.abs(a-b)!=res) return false;}
            else if(op == '>'){ if(Math.abs(a-b) <= res) return false;}
            else {if(Math.abs(a-b) >= res) return false;}
        }
        return true;
    }
}
 