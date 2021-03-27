package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class twentySixth {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//3053(택시 기하학)
		//answer_3053();
		
		//1002(터렛)
		answer_1002();
	}

	//-----------------------------------------------------------------------------------------
	
	private static void answer_1002() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			int value = algorithm_1002(x1,y1,r1,x2,y2,r2);
			System.out.println(value);
			
		}
		
	}
	
	private static int algorithm_1002(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		int distance = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		if(x1==x2 && y1==y2 && r1==r2) {
			return -1;
		}else if(distance > Math.pow(r1+r2, 2)) {
			return 0;
		}else if(distance < Math.pow(r2-r1, 2)) {
			return 0;
		}else if(distance == Math.pow(r2-r1, 2)) {
			return 1;
		}else if(distance == Math.pow(r2+r1, 2)) {
			return 1;
		}else {
			return 2;
		}
		
	}
	
	//-----------------------------------------------------------------------------------------

	private static void answer_3053() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Double R = Double.parseDouble(br.readLine());
		
		System.out.println( R * R * Math.PI);
		System.out.println( R * R * 2);
	}

}
