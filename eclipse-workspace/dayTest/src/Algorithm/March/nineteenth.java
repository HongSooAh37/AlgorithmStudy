package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class nineteenth {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String [] args) throws IOException {
		
		//1316(�׷�ܾ� üũ)
		//answer_1316();
		
		//1712(���ͺб���)
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
		int cnt = Integer.parseInt(br.readLine()); //�Է°� ���� üũ
		
		for(int i=0;i<cnt;i++) {
			if(check()) {
				count++;
			}
		}
		System.out.println(count);
	}

	//�ߺ� üũ
	public static boolean check() throws IOException {

		boolean [] check = new boolean[26];  //a~z : 26
		String str = br.readLine();
		
		int prev = 0;	//���� ���ڿ�
		for(int i=0;i<str.length();i++) {	//�Է¹��� ���ڼ� ��ŭ for
			
			int now = str.charAt(i);		//���� ���� ��
			if(prev != now) {				//���� ���ڰ� != ���� ���ڰ�
				if(!check[now-'a']) {			//check�迭�� �ȿ� , ���� ���ڰ��� ���� ���� �ʴ´ٸ�
					check[now-'a'] = true;		//true
					prev = now;					//���� ���ڰ��� ���簪���� ����
				}else {
					return false;				
				}
			}
		}
		return true;
	}
}
