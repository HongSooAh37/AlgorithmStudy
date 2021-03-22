package Algorithm.March;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class tweentyTwo {
	
	public static void main(String[] args) throws IOException {
		//2839(���� ���)
		//answer_2839();
		
		//10757(ū�� A+B)
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
			int max = (int)Math.sqrt(distance); //������ ���ϱ� => ������
			
			if(max == Math.sqrt(distance)) { //������ == �Ҽ�����
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
		
		//���ذ� �ʿ��� Ǯ��
		//BigInteger ���� �ƴ� �迭�� �̿��Ͽ�, �� �ڸ�����  �������� �迭�� �����Ͽ���, ���� ����
		String sA = st.nextToken();
		String sB = st.nextToken();
		
		int max_length = Math.max(sA.length(),sB.length());
		
		//������ �ڸ��� ���� �ϳ��� �ø�
		int[] A = new int[max_length + 1];
		int[] B = new int[max_length + 1];
		
		//A�ʱ�ȭ
		for(int i=sA.length()-1, idx=0; i>=0; i--, idx++) {
			A[idx] = sA.charAt(i)-'0';	//�� �� ���ڿ��� ���� �������� �ϳ��� ����
		}
		
		//b�ʱ�ȭ
		for(int i=sB.length()-1, idx=0; i>=0; i--, idx++) {
			B[idx] = sB.charAt(i)-'0'; //�� �� ���ڿ��� ���� �������� �ϳ��� ����
		}
		
		for(int i=0; i<max_length;i++) {
			int value = A[i] + B[i];
			A[i] = value % 10;		//���� ���� 10���� ���� �������� �ڸ����� �ȴ�
			A[i+1] += (value/10);	//���� ���� 10���� ���� ���� �ø����� �ȴ�.
		}
		
		StringBuilder sb = new StringBuilder();
		if(A[max_length] !=0) {	//���� ���� ���� 0�� �߻� �� �� �ֱ⶧���� 0�� �ƴ� ���� ���
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
