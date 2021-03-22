package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tweenty {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int[][] APT = new int[15][15];

	public static void main(String[] args) throws IOException {
		//10250
		//answer_10250();
		
		//2775
		answer_2775();
	}

	
	private static void answer_2775() throws IOException {
		StringBuilder sb = new StringBuilder();	
		makeApt();
		
		int cnt = Integer.parseInt(br.readLine());
		for(int i=0;i<cnt;i++) {
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());
			sb.append(APT[x][y]).append('\n');
		}
		System.out.print(sb);
		
	}


	private static void makeApt() {
		for(int i=0;i<15;i++) {
			APT[i][1] = 1; //iÃþ 1È£
			APT[0][i] = i; //0Ãþ iÈ£
		}
		
		for(int i=1;i<15;i++) {
			for(int j=2;j<15;j++) {
				APT[i][j] = APT[i][j-1] + APT[i-1][j];
			}
		}
	}


	private static void answer_10250() throws IOException {

		StringBuilder sb = new StringBuilder();	
		int people = Integer.parseInt(br.readLine());
		
		for(int i=0;i<people;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			if(N%H==0) {
				sb.append((H*100)+(N%H)+1).append('\n');
			}else {
				sb.append( (((N%H)*100)+((N/H)+1)) ).append('\n');
			}
		}
		System.out.print(sb);
	}

}
