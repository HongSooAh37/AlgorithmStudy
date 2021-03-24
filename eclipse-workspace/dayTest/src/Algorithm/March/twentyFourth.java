package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class twentyFourth {
	
	public static boolean prime[];

	public static void main(String[] args) throws IOException {
		
		//2581(소수)
		//answer_2581();
		
		//11653(소인수분해)
		//answer_11653();
		
		//1929(소수구하기)
		//answer_1929_1();
		answer_1929_2();
	}

	private static void answer_1929_2() throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder   sb = new StringBuilder();
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		prime = new boolean[N+1];
		algorithm_1929();
		
		for(int i=M; i<=N; i++) {
			if(!prime[i]) sb.append(i).append('\n');
		}
		System.out.println(sb);
		
	}

	private static void algorithm_1929() {
		
		prime[0] = prime[1] = true;
		
		for(int i=2; i<= Math.sqrt(prime.length);i++){
			if(prime[i]) continue; // 소수
			for(int j=i*i; j<prime.length;j +=i) {
				prime[j] = true;
			}
		}
	}

	private static void answer_1929_1() throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder   sb = new StringBuilder();
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		prime = new boolean[N+1];

		for(int i=2;i<N;i++) {
			if(prime[i]) continue;
			
			if(i>=M) sb.append(i).append('\n');
			
			for(int j=i; j<=N; j+=i) {
				prime[j] = true;
			}
		}
		System.out.println(sb);
	}


	private static void answer_11653() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=2; i*i<=N; i++) {
			while(N%i ==0) {
				sb.append(i).append('\n');
				N /= i;
			}
		}
		
		System.out.println(sb);
	}

	private static void answer_2581() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		prime = new boolean[N+1];
		
		algorithm_2581();
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=M;i<=N;i++) {
			
			if(prime[i] == false) { // false == 소수
				sum += i;
				if(min == Integer.MAX_VALUE){ // 첫 소스가 최곳값임
					min = i;
				}
			}
		}
		
		if(sum == 0) { //소스가 없다면
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}

	private static void algorithm_2581() {
		
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2;i<Math.sqrt(prime.length);i++) {
			
			if(prime[i]) continue;
			
			for(int j=i*i;j<prime.length;j+=i) {
				prime[j] = true;
			}
			
		}
	}

}
