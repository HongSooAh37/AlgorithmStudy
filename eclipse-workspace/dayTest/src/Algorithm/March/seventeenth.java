package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class seventeenth {

	public static void main(String[] args) throws IOException {
		//4673(셀프넘버) 다시 확인하기(이해가 잘 되지 않는다)
		//answer_4673();
		
		//1065(한수)
		//answer_1065(210);
		
		//11654(아스키코드)
		//answer_11654();
		
		//11720(숫자의 합)
		//answer_11720();
		
		//10809(알파벳 찾기)
		answer_10809();
	}

	
	private static void answer_10809() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int [] arr = new int[26];
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
		
		for(int i=0;i<str.length();i++) {
			char cr = str.charAt(i);
			
			if(arr[cr-'a']==-1) {
				arr[cr-'a'] = i;
			}
		}
		
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
	}


	private static void answer_11720() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		int sum = 0;
		String str = br.readLine();
		
		for(int i=0;i<str.length();i++) {
			sum += str.charAt(i)-'0'; 
		}
		System.out.println(sum);
	}


	private static void answer_11654() throws IOException {
		//1
		Scanner sc = new Scanner(System.in);
		int value1 = sc.next().charAt(0);
		System.out.println(value1);
		
		//2
		//int value2 = System.in.read();
		//System.out.print(value2);
	}


	private static void answer_1065(int n) {
		int num = n;
		int count = 0;
	
		if(num<100) {
			count = num;
		}else {
			count = 99;
			if(num == 1000) {
				num = 999;
			}
			
			for(int i=100;i<=num;i++) {
				int first  = i/100;
				int second = (i/10)%10;
				int third  = i%10;
				
				if((first-second) == (second - third)) {
					count ++;
				}
			}
			
		}
		System.out.print(count);
	}


	private static void answer_4673() {
		
		boolean[] check = new boolean[10001];
		for(int i=1;i<10001;i++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<10001;i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
		
	}
	
	public static int d(int n) {
		
		int sum = n;
		while(n != 0) {
			sum += sum + (n %10);  //첫째 자릿수
			n = n/10;				//10을 나누어 첫 째 자리를 얻음
		}
		return sum;
	}

}
