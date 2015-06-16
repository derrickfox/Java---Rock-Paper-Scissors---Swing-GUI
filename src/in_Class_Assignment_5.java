public class in_Class_Assignment_5 {
	public static void main(String[] args) {
		
		System.out.println("  x       y");
		System.out.println("---------------");
		for (double i = -10; i <= 10; i = (i + 0.5)) {
			double j = (i * i);
			System.out.printf(i + "\t" + j + "\n");
		}
	}
}
