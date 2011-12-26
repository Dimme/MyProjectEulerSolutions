public class Problem2 {
	public static void main(String[] args) {
		
		int beforeBefore = 1;
		int before = 2;
		int fib = 0;
		int sum = 2;
		
		while ((fib = beforeBefore + before) <= 4000000) {
			beforeBefore = before;
			before = fib;
			
			if (fib % 2 == 0)
				sum += fib;
		}
		
		System.out.println(sum);
	}
}
