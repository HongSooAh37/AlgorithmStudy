package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class twentySixth {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//3053(택시 기하학)
		answer_3053();
		
		//1002(터렛)
		answer_1002();
	}

	//-----------------------------------------------------------------------------------------
	
	private static void answer_1002() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			
			
			
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
