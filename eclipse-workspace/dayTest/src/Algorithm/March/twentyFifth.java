package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class twentyFifth {
	
	public static boolean [] prime = new boolean[246913];
	public static int [] count_arr = new int[246913];
	
	public static boolean [] prime2 = new boolean[1001];

	public static void main(String[] args) throws IOException{
		
		//4948(베르트랑 공준)
		//answer_4948();
		//answer_4948M();
		
		//9020(골드바흐의 추측) : 더 공부하기 
		//answer_9020();
		
		//1085(직사각형에서 탈출)
		//answer_1085();

		//3009(네 번쨰 점)
		//answer_3009();
		
		//4153(직삼각형)
		answer_4153();
		
	}

	private static void answer_4153() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			
			if(x==0 && y==0 && z==0) break;
			
			if((x*x)+(y*y)==(z*z)) {
				sb.append("right").append('\n');
			}else if((x*x)+(z*z)==(y*y)){
				sb.append("right").append('\n');
			}else if((y*y)+(z*z)==(x*x)){
				sb.append("right").append('\n');
			}else {
				sb.append("wrong").append('\n');
			}
			
		}
		System.out.println(sb);
	}


	//-----------------------------------------------------------------------------------------


	private static void answer_3009() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int [] nemo1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		st = new StringTokenizer(br.readLine(), " ");
		int [] nemo2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		st = new StringTokenizer(br.readLine(), " ");
		int [] nemo3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		int x;
		int y;
		
		if(nemo1[0] == nemo2[0]) {
			x = nemo3[0];
		}else if(nemo1[0] == nemo3[0]) {
			x = nemo2[0];
		}else {
			x = nemo1[0];
		}
		
		if(nemo1[1] == nemo2[1]) {
			y = nemo3[1];
		}else if(nemo1[1] == nemo3[1]) {
			y = nemo2[1];
		}else {
			y = nemo1[1];
		}
		
		System.out.println(x+ " " + y);
	}


	//-----------------------------------------------------------------------------------------


	private static void answer_1085() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int x_min = Math.min(x, w-x);	//x축 최소거리
		int y_min = Math.min(y, h-y);	//y축 최소거리
		
		System.out.println(Math.min(x_min, y_min));	//x,y 최소거리
		
	}


	//-----------------------------------------------------------------------------------------
	
	private static void answer_9020() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		algorithm_9020();
		
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int first_part = n/2;
			int second_part = n/2;
			
			while(true) {
				if(!prime2[first_part] && prime2[second_part]) {
					System.out.print(first_part + " " + second_part);
					break;
				}
				first_part--;
				second_part++;
			}
		}
		
	}

	private static void algorithm_9020() {
		prime2[0] = prime2[1] = true;
		
		for(int i=2; i<= Math.sqrt(prime2.length); i++) {
			
			if(prime2[i]) {
				continue;
			}
			
			for(int j = i*i; j<prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

	//-----------------------------------------------------------------------------------------

	private static void answer_4948M() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb  = new StringBuilder();
		
		algorithm_4948();
		get_count();
		
		while(true) {
			int input = Integer.parseInt(br.readLine());
			if(input == 0) break;
			sb.append(count_arr[2*input]-count_arr[input]).append('\n');
		}
		System.out.print(sb);
	}

	private static void get_count() {
		int count = 0;
		for(int i=2;i<prime.length;i++) {
			if(!prime[i]) count++;
			count_arr[i] = count;
		}
	}

	private static void answer_4948() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb  = new StringBuilder();
		
		algorithm_4948();
		
		while(true) {
			
			int input = Integer.parseInt(br.readLine());
			if(input==0) break;
			
			int count = 0;
			
			for(int i= input+1; i<=2*input; i++) {
				if(!prime[i]) count++;
			}
			sb.append(count).append('\n');
		}
		System.out.println(sb);
	}

	private static void algorithm_4948() {
		
		prime[0] = prime[1] = true;
		for(int i=2; i<= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j=i*i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}


}
