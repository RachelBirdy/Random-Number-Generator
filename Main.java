import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int upperBound = Integer.parseInt(args[0]);
		Random numgen = new Random();
		System.out.println(numgen.nextInt(upperBound) + 1);
	}
}
