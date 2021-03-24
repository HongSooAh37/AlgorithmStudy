package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tweentyThree {

	public static void main(String[] args) throws IOException{
		
		//1978(소수 찾기)
		answer_1978();
		
	}

	private static void answer_1978() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<cnt;i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				continue;
			}
			
			for(int j=2;j<Math.sqrt(num);j++) {
				if(num%j==0) {
					break;
				}
			}
			count++;
		}
		
		System.out.print(count);
	}

}
