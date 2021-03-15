package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class fifteenth {

	//1차원 배열
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		//10818(최소,최대)
		answer_10818();
	
		//2562(최댓갑)
		answer_2562();
		
		//2577(숫자의 개수)
		answer_2577();
		
		//3052(나머지)
		answer_3052();
		
		//1546(평균)
		answer_1562();
		
	}

	private static void answer_1562() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = -1;
		double sum = 0;
		
		for(int i=0;i<num;i++) {
			int score = Integer.parseInt(st.nextToken());
			if(score > max) {
				max = score;
			}
			sum += max;
		}
		
		System.out.print( ((sum/max)*100)/num);
	
		
	}

	private static void answer_3052() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<10;i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		//System.out.print(hs);
		System.out.print(hs.size());
 		
	}

	private static void answer_2577() throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[10]; //1~9
		
		int value = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		String str = String.valueOf(value);
		System.out.println(str);
		
		for(int i=0; i<str.length(); i++) {
			arr[(str.charAt(i)-48)]++; 	// 문자 값 - 48
		}

		for(int n : arr) {
			System.out.println(n);
		}
		
	}
	
	private static void answer_2562() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[9];
	
		int max = 0;
		int index = 0;
		int cnt = 0;
		
		for(int i=0;i<9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
	
		for(int value : arr) {
			index++;
			if(value>max) {
				max = value;
				cnt = index;
			}
		}
		
		System.out.println(max);
		System.out.println(cnt);
		
	}

	private static void answer_10818() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
 		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<num;i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0]+" "+arr[num-1]);
	}

	
	
	

}
