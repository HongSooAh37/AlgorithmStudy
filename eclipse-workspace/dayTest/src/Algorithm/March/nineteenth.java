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
