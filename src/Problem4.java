public class Problem4 {

	public static void main(String[] args) {
		int max = 0;

		for (int i = 100; i <= 999; i++)
			for (int j = 100; j <= 999; j++) {
				int prod = i * j;
				if (prod > max && isPalindrome(prod))
					max = prod;
			}

		System.out.println(max);
	}

	public static boolean isPalindrome(int n) {
		int r = 0;
		int n2 = n;

		while (n2 > 0) {
			r = r * 10 + n2 % 10;
			n2 = n2 / 10;
		}

		return r == n;
	}

}
