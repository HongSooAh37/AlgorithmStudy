package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class nineteenth {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String [] args) throws IOException {
		
		//1316(그룹단어 체크)
		//answer_1316();
		
		//1712(손익분기점)
		//answer_1712();
		
		//2292(벌집)
		//answer_2292();
		
		/**
		 * 다시 복습하기
		 * */
		//1193(분수찾기)  
		//answer_1193();
		
		//2869(달팽이는 올라가고 싶다)
		answer_2869();
	}

	
	private static void answer_2869() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int value = (V-B)/(A-B);
		
		if((V-B)%(A-B) ==0 ) {
			System.out.print(value);
		}else {
			value++;
			System.out.print(value);
		}
	}


	private static void answer_1193() throws NumberFormatException, IOException {
		int num = Integer.parseInt(br.readLine());
		
		int cross = 1, preSum = 0;
		
		
		while(true) {
			if(num <= cross + preSum) {
				
				if(cross % 2 == 0) {
					System.out.println( (num-preSum)+"/"+(cross-(num-preSum-1)) );
					break;
				}else {
					System.out.println( (cross -(num-preSum-1)) +"/"+(num-preSum) );
					break;
				}
				
			}else {
				preSum += cross;
				cross++;
			}
		}
	}


	private static void answer_2292() throws NumberFormatException, IOException {
		int cnt = Integer.parseInt(br.readLine());
		
		int count = 0;
		int start = 2;
		
		if(cnt == 1) {
			count = 1;
		}else {
			while(start <= cnt) { 
				start = start + (count*6);
				count++;
			}
		}
		System.out.println(count);
	}


	private static void answer_1712() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(c <= b) {
			System.out.println(-1);
		}else {
			System.out.println( (a/(c-b))+1 );
		}
	}


	public static void answer_1316() throws IOException{

		int count = 0;
		int cnt = Integer.parseInt(br.readLine()); //입력값 개수 체크
		
		for(int i=0;i<cnt;i++) {
			if(check()) {
				count++;
			}
		}
		System.out.println(count);
	}

	//중복 체크
	public static boolean check() throws IOException {

		boolean [] check = new boolean[26];  //a~z : 26
		String str = br.readLine();
		
		int prev = 0;	//이전 문자열
		for(int i=0;i<str.length();i++) {	//입력받은 글자수 만큼 for
			
			int now = str.charAt(i);		//현재 글자 값
			if(prev != now) {				//이전 글자값 != 현재 글자값
				if(!check[now-'a']) {			//check배열에 안에 , 현재 글자값이 존재 하지 않는다면
					check[now-'a'] = true;		//true
					prev = now;					//이전 글자값을 현재값으로 설정
				}else {
					return false;				
				}
			}
		}
		return true;
	}
}
