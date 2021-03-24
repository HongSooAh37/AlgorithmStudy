package Explannation;

import java.util.ArrayList;

public class decimal {
	
	public static ArrayList<Integer> list;
	public static ArrayList<Integer> list2;
	public static ArrayList<Integer> list3;
	
	public static void main(String[] args) {
		 
		int N = 10000;
 
		for (int i = 0; i < 5; i++) {
			System.out.println("Prime Numbers less than or equal to " + N);
			
			list = new ArrayList<Integer>();	// list 초기화 
			make_prime(N);
			list.clear();						// 리스트 비우기
			
			list2 = new ArrayList<Integer>();	// list 초기화 
			make_prime2(N);
			list2.clear();						// 리스트 비우기
			
			list3 = new ArrayList<Integer>();	// list 초기화 
			make_prime3(N);
			list3.clear();						// 리스트 비우기
			
			System.out.println();
			if(i % 2 == 0) {
				N *= 5;
			}
			else {
				N *= 2;
			}
		}
 
	}
	
	private static long make_prime(int N) {
		
		final long start = System.nanoTime();
		boolean TrueFalse;
		for(int i=3; i<=N; i++) {
			
			TrueFalse = true;
			for(int j=2;j<N;j++) {
				
				if( i%j == 0 ) {
					TrueFalse = false;
					break;
				}
			}
			
			if(TrueFalse)
				list.add(i);	
		}
		final long end = System.nanoTime();
		System.out.println("run 1 : " + (end - start) * 1e-9 + " sec ");
		return end-start;
		
	}

	private static long make_prime2(int N) {
		final long start = System.nanoTime();
		boolean TrueFalse;
		
		for(int i=3;i<=N;i++) {
			
			TrueFalse = true;
			for(int j=2; j <= Math.sqrt(N); j++) {
				
				if(i%j == 0) {
					TrueFalse = false;
					break;
				}
			}
			if(TrueFalse) {
				list2.add(i); 
			}
		}
		
		final long end = System.nanoTime();
		System.out.println("run 2 : " + (end - start) * 1e-9 + " sec ");
		return end-start;
	}
	
	
	public static long make_prime3(int number) {
		final long start = System.nanoTime();
 
		boolean[] check = new boolean[number + 1]; // true : 비소수 , false : 소수
		check[0] = check[1] = true;
 
		for (int i = 2; i <= Math.sqrt(number); i++) {
			
			if (check[i])
				continue; // 소수가 아닐경우 skip
 
			for (int j = i * i; j < check.length; j += i) {
				check[j] = true;
			}
		}
		
		for (int i = 0; i < check.length; i++) {
			if (!check[i]) list3.add(i);
		}
		
		final long end = System.nanoTime();
		System.out.println("run 3 : " + (end - start) * 1e-9 + " sec");
		return end - start;
	}


}
