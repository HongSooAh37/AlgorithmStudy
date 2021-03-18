package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class eighteenth {

	public static void main(String[] args) throws IOException {
		
		//2675(문자열 반복)
		//answer_2675();
		
		//1157(단어 공부)
		//answer_1157();
		
		//2908(상수)
		//anser_2908();
		
		//5622(다이얼)
		//answer_5622();
		
		//2941(크로아티아 알파벳)
		//answer_2941();
		
	}

	private static void answer_2941() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int value = 0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i) == 'c') {
				if(str.charAt(i+1) == '-') {
					i++;
				}else if(str.charAt(i+1) == '=') {
					i++;
				}
			}else if(str.charAt(i) == 'd') {	
				if(str.charAt(i+1) == 'z') {
					if(str.charAt(i+2) == '=') {
						i++;
					}
				}else if(str.charAt(i+1) == '-') {
					i++;
				}
			}else if(str.charAt(i) == 'l') {
				if(str.charAt(i+1) == 'j') {
					i++;
				}
			}else if(str.charAt(i) == 's') {
				if(str.charAt(i+1) == '=') {
					i++;
				}
			}else if(str.charAt(i) == 'z') {
				if(str.charAt(i+1) == '=') {
					i++;
				}
			}else if(str.charAt(i) == 'n') {
				if(str.charAt(i+1) == 'j') {
					i++;
				}
			}
			
			value++;
		}
		System.out.println(value);
		
	}

	private static void answer_5622() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int sec = 0;
		for(int i=0;i<str.length();i++) {
			
			//switch로 변경 하는 편이 더 직관적이다
			if(str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'C') {
				sec += 3;
			}else if(str.charAt(i) == 'D' || str.charAt(i) == 'E' || str.charAt(i) == 'F') {
				sec += 4;
			}else if(str.charAt(i) == 'G' || str.charAt(i) == 'H' || str.charAt(i) == 'I') {
				sec += 5;
			}else if(str.charAt(i) == 'J' || str.charAt(i) == 'K' || str.charAt(i) == 'L') {
				sec += 6;
			}else if(str.charAt(i) == 'M' || str.charAt(i) == 'N' || str.charAt(i) == 'O') {
				sec += 7;
			}else if(str.charAt(i) == 'P' || str.charAt(i) == 'Q' || str.charAt(i) == 'R' || str.charAt(i) == 'S') {
				sec += 8;
			}else if(str.charAt(i) == 'T' || str.charAt(i) == 'U' || str.charAt(i) == 'V') {
				sec += 9;
			}else if(str.charAt(i) == 'W' || str.charAt(i) == 'X' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z') {
				sec += 10;
			}
		}
		System.out.print(sec);
	}

	private static void anser_2908() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int num2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.print(num1 > num2 ? num1:num2);
		
	}

	private static void answer_1157() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine().toUpperCase();
		int [] arr = new int[26];
		
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)-65]++;
		}
		
		  int com = 0; 
		  char ch ='?';
		  
		  for(int i=0;i<26;i++) { 
			  if(arr[i] > com) { 
				  com = arr[i]; 
				  ch = (char) (i+65); 
			  }else if(arr[i] == com) { 
				  ch = '?'; 
			  } 
		  } 
		  System.out.println(ch);
		
	
	}

	private static void answer_2675() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i=0;i<cnt;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int rep = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			for(int k=0;k<str.length();k++) {
				for(int j=0;j<rep;j++) {
					System.out.print(str.charAt(k));
				}
			}
		
			System.out.println();
		}
		
	}

}
