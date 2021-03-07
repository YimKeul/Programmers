package Q_��ü�������;

import java.util.HashMap;

// A C F J M N R T : ����ġ �� ���ε� ������ ���� �׿� ���̾� Ʃ��
// 0 1 2 3 4 5 6 7


//data[] ���� �׻� �ι�° ���ڴ� ~ : data[i].charAt(2) = "~"
//data[] �׹�° ���ڴ� ������ �ϳ� : data[i].chatAt(4) = " = , < , >"
//data[] �ټ���° ���� : data[i].charAt(5) = 0<= x <= 6 // ������ ����
//���� �ǹ�


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
            //charAt() - '0' ����  - '0'�ϴ� ������ char������ ĳ������ �Ŀ� ��Ȯ�� ���� ǥ���ϱ� ���ؼ�
            // ĳ���ͺ� �ּҰ��� -1�����̱⶧��
            
            if(op == '='){ if(Math.abs(a-b)!=res) return false;}
            else if(op == '>'){ if(Math.abs(a-b) <= res) return false;}
            else {if(Math.abs(a-b) >= res) return false;}
        }
        return true;
    }
}
 