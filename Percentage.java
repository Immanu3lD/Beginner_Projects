public class Percentage {
	
	public static void main(String[] args) {
		
		percentage(/*The percentage*/, /*The number*/);
		
	}
	
	static void percentage(double n1, double n2) {
		
		double p = (n1 / 100) * n2;
		System.out.printf("%.1f%% of %.1f is %.1f", n1, n2, p);
		
	}
	
}
