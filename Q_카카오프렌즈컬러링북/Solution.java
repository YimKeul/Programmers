package Q_카카오프렌즈컬러링북;

public class Solution {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        int [][] isViewd = new int [picture.length][picture[0].length];
        
        for(int i =0; i< picture.length; i++	) {
        	for(int j = 0; j< picture[i].length;j++) {
        		
        		int area = area(picture, isViewd, i, j);
        	
        		if( area>0) {
        			numberOfArea++;
        			maxSizeOfOneArea = maxSizeOfOneArea < area ? area : maxSizeOfOneArea;
        			//					(조건)                    / true : false
        			
        		}
        		
        		System.out.print("i : "+ i+" j : "+j + " numberOfArea : "+ numberOfArea+" area : " +area);
        		System.out.println();
        		//System.out.print(isViewd[i][j]);
        		if(j == picture[i].length-1) {
        			System.out.println();
        		}
        	}
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        System.out.println(answer[0] + "  " + answer[1]);
        return answer;
    }
    
    public int area( int [][] picture, int [][] isViewed, int i, int j) {
		if(picture[i][j] == 0) {
			return 0;
		}
		
		if(isViewed[i][j]++>0) {
			return 0;
		}

    	int result = 1;

    	if( i +1 != picture.length) {
    		if(picture[i+1][j] == picture[i][j]) {
    			result += area(picture, isViewed , i+1, j);
    		}
    	}
    	
    	if( j+1 != picture[0].length) {
    		if(picture[i][j+1] == picture[i][j]) {
    			result += area(picture, isViewed, i, j+1);
    		}
    	}
    	
    	
    	if( i-1 >=0) {
    		if( picture[i-1][j] == picture[i][j]) {
    			result += area(picture, isViewed, i-1, j);
    		}
    	}
    	
    	if( j-1 >=0) {
    		if( picture[i][j-1] == picture[i][j]) {
    			result += area(picture, isViewed, i, j-1);
    		}
    	}
    	
    	
    	return result;
    	
    }
}
