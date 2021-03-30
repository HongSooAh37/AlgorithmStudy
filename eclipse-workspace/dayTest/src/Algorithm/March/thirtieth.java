package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class thirtieth {

	public static void main(String[] args) throws IOException {
		
		//7568(µ¢Ä¡)
		answer_7568();

	}

	
	//-------------------------------------------------------------------------------
	private static void answer_7568() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int [][] arr = new int [N][2];
		StringTokenizer st;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			int rank = 1;
			
			for(int j=0; j<N; j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1]<arr[j][1]) {
					rank++;
				}
			}
			sb.append(rank).append(' ');
		}
		
		System.out.println(sb);
		
	}

}
