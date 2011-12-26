public class Problem9 {
	public static void main(String[] args) {

		for (int a = 1; a < 1000; a++) {
			int b = (1000 * (a - 500)) / (a - 1000);
			int c = (-(int) Math.pow(a, 2) + 1000 * a - 500000) / (a - 1000);

			if (a + b + c == 1000) {
				System.out.println(a * b * c);
				break;
			}
		}
	}
}
