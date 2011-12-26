public class Problem5 {
	public static void main(String[] args) {
		
		int i = 0;
		while (true) {
			i++;
			
			if (isEvenlyDivisibleBy1to20(i)) {
				System.out.println(i);
				break;
			}
		}
			
	}
	
	public static boolean isEvenlyDivisibleBy1to20(int n) {
		for (int i = 1; i <= 20; i++)
			if (n % i != 0)
				return false;
		
		return true;
	}
}

