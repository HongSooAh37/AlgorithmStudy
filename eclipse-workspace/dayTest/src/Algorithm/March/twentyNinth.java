package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class twentyNinth {

	public static void main(String[] args) throws IOException{
		
		//2798(블랙잭)
		//answer_2798();
		
		//2231(분해합)
		answer_2231();

	}

	private static void answer_2231() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String Num = br.readLine();
		int N = Integer.parseInt(Num);
		
		int value = 0;
		
		for(int i=(N-(Num.length()*9)); i<N; i++) {
			int number = i;
			int sum = 0;
			
			while(number !=0) {
				sum += number%10;
				number /= 10;
			}
			
			if(sum + i == N) {
				value = i;
				break;
			}
		}
		System.out.println(value);
	}

	//----------------------------------------------------------------------------------------
	private static void answer_2798() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int [] arr = new int [A];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<A;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = algorithm_2798(arr,A,B);
		System.out.println(sum);
	}

	private static int algorithm_2798(int[] arr, int a, int b) {
		
		int result = 0;
		
		for(int i=0; i<a-2; i++) {
			
			for(int j=i+1; j<a-1; j++) {
				
				for(int k=j+1; k<a; k++) {
					
					int temp = arr[i] + arr[j] + arr[k];	
					
					if(b == temp) {
						return temp;
					}
					
					if(result < temp && temp < b) {
						result = temp;
					}
				}
			}
		}
		return result;
	}

}
