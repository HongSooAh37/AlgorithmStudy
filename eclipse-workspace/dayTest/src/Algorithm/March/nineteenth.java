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
		
		//2292(����)
		//answer_2292();
		
		/**
		 * �ٽ� �����ϱ�
		 * */
		//1193(�м�ã��)  
		//answer_1193();
		
		//2869(�����̴� �ö󰡰� �ʹ�)
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
