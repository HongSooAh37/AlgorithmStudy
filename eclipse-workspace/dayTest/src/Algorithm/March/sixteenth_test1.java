package Algorithm.March;


class sixteenth_test1 {

	//15596 (정수 N개의 합)
	long sum(int[] n) {
		
		long sum = 0;
		for(int i=0;i<n.length;i++) {
			sum += n[i];
		}
		return sum;
	}

}
