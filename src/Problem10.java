public class Problem10 {
	public static void main(String[] args) {
		long sum = 0;
		for (long i = 2; i < 2000000; i++)
			if (isPrime(i))
				sum += i;

		System.out.println(sum);
	}

	public static boolean isPrime(long num) {
		if (num <= 1)
			return false;

		if (num != 2 && num % 2 == 0)
			return false;

		for (long i = 3; i <= Math.sqrt(num); i += 2)
			if (num % i == 0)
				return false;

		return true;
	}
}
