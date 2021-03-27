package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class twentySeventh {
	
	static char [][] arr; 
	public static StringBuilder sb_11729 = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		//10872(���丮��)
		//answer_10872();
		
		//10870(�Ǻ���ġ�� 5)
		//answer_10870();
		
		//2447 (����� -10)
		//answer_2447();
		
		//11729(�ϳ���ž ���)
		answer_11729();
		
	}

	
	
	private static void answer_11729() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		sb_11729.append((int)(Math.pow(2,N)-1)).append('\n');
		algorithm_11729(N,1,2,3);
		
		System.out.println(sb_11729);
	}



	private static void algorithm_11729(int N, int start, int mid, int to) {

		if(N == 1) {
			sb_11729.append(start + " " + to + "\n");
			return;
		}
		
		//step 1 : N-1����  A->B
		algorithm_11729(N-1,start,to,mid);
		
		//1���� A -> C
		sb_11729.append(start + " " + to + "\n");
		
		//step 2: N-1����  B->C
		algorithm_11729(N-1,mid,start,to);
	}



	//-----------------------------------------------------------------------------------------
	private static void answer_2447() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		arr = new char[N][N]; 
		
		algorithm_2447(0,0,N,false);
		
		StringBuilder sb = new StringBuilder();
	

		  for(int i=0;i<N;i++) {
			  for(int j=0; j<N; j++) { 
				  sb.append(arr[i][j]); 
			  }
			  sb.append('\n'); 
		  } 
		  System.out.println(sb);
		 
	}

	static void algorithm_2447(int x, int y, int N, boolean blank) {
		
		//������ ���
		if(blank) {
			for(int i=x;i<x+N;i++) {  //N�� ������ �������� ������ ���� size
				for(int j=y;j<y+N;j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		//���̻� �ɰ����� ���� ��
		if( N == 1 ) { 
			arr[x][y] = '*';
			return;
		}
		
		//�� ����� 3
		//count�� �� ����� ���� ��
		//n=27 -> 9���� ��
		//n=9  -> 3���� ��
		
		int size = N/3;
		int count = 0;
		
		for(int i=x; i<x+N; i += size) {
			for(int j=y; j<y+N; j += size) {
				count++; //1
				if(count == 5) {
					algorithm_2447(i,j,size,true);
				}else {
					algorithm_2447(i,j,size,false);
				}
			}
		}
	}



	//-----------------------------------------------------------------------------------------
	private static void answer_10870() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		System.out.println(algorithm_10870(N));
	}

	static int algorithm_10870(int N) {
		if(N==0) return 0;
		if(N==1) return 1;
		return algorithm_10870(N-1) + algorithm_10870(N-2);
	}

	
	//-----------------------------------------------------------------------------------------
	private static void answer_10872() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
		//�Լ� ȣ�� 1
		//int sum = algorithm_10872(N);
	
		//�ݺ��� 2
		int sum = 1;
		while(N>1) {
			sum = sum*(N);
			N--;
		}
		
		System.out.println(sum);
	}

	private static int algorithm_10872(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*algorithm_10872(n-1);
		}
		
	}

}
