public class Problem6 {

	public static void main(String[] args) {

		long sum1 = 0, sum2 = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum1 += (int)Math.pow(i, 2);
			sum2 += i;
		}
		
		long res = ((int)Math.pow(sum2, 2)) - sum1;
		
		System.out.println(res);
			
	}

}
