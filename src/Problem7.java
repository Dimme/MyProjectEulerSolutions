public class Problem7 {

	public static void main(String[] args) {
		int count = 0;
		int i = 1;

		while (true) {
			i++;

			if (isPrime(i)) {
				count++;

				if (count == 10001) {
					System.out.println(i);
					break;
				}
			}
		}
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
