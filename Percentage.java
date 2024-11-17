public class Percentage {
	
	public static void main(String[] args) {
		
		percentage(43, 234);
		
	}
	
	static double percentage(double n1, double n2) {
		
		double p = (n1 / 100) * n2;
		
		System.out.printf("%.1f%% of %.1f is %.1f", n1, n2, p);
		
		return 0;
	}
	
}
