import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		final long NUMBER = 600851475143L;
		long max = 0;
		
		for (long i = 3; i<Math.sqrt(NUMBER); i+=2) {
			if (NUMBER % i == 0 && isPrime(i))
				max = i;
		}
		
		System.out.println(max);
	}
	
	public static boolean isPrime(long num) {
		for (long i = 3; i < Math.sqrt(num); i+=2)
			if (num % i == 0)
				return false;
			
		return true;
	}
	
}
