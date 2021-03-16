package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class sixteenth {

	public static void main(String[] args) throws IOException {
		//8598(OXÄûÁî)
		//answer_8958();
		
		//4344(Æò±ÕÀº ³Ñ¾î°ÚÁö)
		//answer_4344();
		
	}


	private static void answer_4344() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseCnt = Integer.parseInt(br.readLine());

		StringTokenizer st;
		int arr[];
		
		for(int i=0;i<caseCnt;i++) {
		
			st = new StringTokenizer(br.readLine(), " ");
			int student = Integer.parseInt(st.nextToken());
			arr = new int[student];
			
			double sum = 0;
			for(int j=0; j<student; j++) {
				int score = Integer.parseInt(st.nextToken());
				arr[j] = score;
				sum += score;
			}
			
			double avg = (sum/student);
			double avgHigh = 0;
			
			for(int j=0;j<student;j++) {
				if(avg > arr[j]) {
					avgHigh++;
				}
			}
			System.out.printf("%.3f%%\n",(avgHigh/student)*100);

			
		}
		
		
	}

	private static void answer_8958() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = new String[Integer.parseInt(br.readLine())];
		StringBuilder sb = new StringBuilder();

		
		for(int i=0;i<arr.length;i++) {
			arr[i] = br.readLine();

		}
		
		for(int i=0; i<arr.length; i++) {
			int sum  = 0;
			int next = 0;
			
			for(int j=0;j<arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					next++;
				}else {
					next = 0;
				}
				sum += next;	
			}
			sb.append(sum).append('\n');
		}
		System.out.print(sb);
		
	}

}

