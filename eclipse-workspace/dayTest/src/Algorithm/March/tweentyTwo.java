package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class tweentyTwo {
	
	public static void main(String[] args) throws IOException {
		//2839(설탕 배달)
		//answer_2839();
		
		//10757(큰수 A+B)
		//answer_10757();
		
		//1011(Fly me to the Alpha Centauri)
		answer_1011();
	}

	private static void answer_1011() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringBuilder sb = new StringBuilder();
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testCase;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int distance = y-x;
			int max = (int)Math.sqrt(distance); //제곱근 구하기 => 정수형
			
			if(max == Math.sqrt(distance)) { //정수형 == 소수점형
				sb.append(max*2-1).append('\n');
			}else if(distance <= max*max+max) {
				sb.append(max*2).append('\n');
			}else {
				sb.append(max*2+1).append('\n');
			}
			
		}
		System.out.println(sb);
		
	}

	private static void answer_10757() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		//BigInteger A = new BigInteger(st.nextToken());
		//BigInteger B = new BigInteger(st.nextToken());
		//System.out.println(A.add(B));
		
		//이해가 필요한 풀이
		//BigInteger 값이 아닌 배열을 이용하여, 각 자릿수를  역순으로 배열에 저장하여서, 값을 도출
		String sA = st.nextToken();
		String sB = st.nextToken();
		
		int max_length = Math.max(sA.length(),sB.length());
		
		//마지막 자릿수 에서 하나씩 올림
		int[] A = new int[max_length + 1];
		int[] B = new int[max_length + 1];
		
		//A초기화
		for(int i=sA.length()-1, idx=0; i>=0; i--, idx++) {
			A[idx] = sA.charAt(i)-'0';	//맨 뒷 문자에서 부터 역순으로 하나씩 저장
		}
		
		//b초기화
		for(int i=sB.length()-1, idx=0; i>=0; i--, idx++) {
			B[idx] = sB.charAt(i)-'0'; //맨 뒷 문자에서 부터 역순으로 하나씩 저장
		}
		
		for(int i=0; i<max_length;i++) {
			int value = A[i] + B[i];
			A[i] = value % 10;		//더한 값의 10으로 나눈 나머지가 자릿값이 된다
			A[i+1] += (value/10);	//더한 값의 10으로 나눈 몫이 올림값이 된다.
		}
		
		StringBuilder sb = new StringBuilder();
		if(A[max_length] !=0) {	//가장 높은 값이 0이 발생 할 수 있기때문에 0이 아닌 값만 출력
			sb.append(A[max_length]);
		}
		
		for(int i=max_length-1;i >=0;i--) {
			sb.append(A[i]);
		}
		System.out.print(sb);
		
	}

	private static void answer_2839() throws IOException{
		int value = 0;
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sugar = Integer.parseInt(br.readLine());
		
		if(sugar%5==0) {
			value = sugar/5;
		}else if(sugar%5!=0) {
			if((sugar%5)%3==0) {
				value = (sugar/5) + ((sugar%5)/3);
			}else if(sugar%3==0){
				value = sugar/3;
			}else {
				value = -1;
			}
		}else {
			value = -1;
		}
		
		System.out.println(value);
	}

}
