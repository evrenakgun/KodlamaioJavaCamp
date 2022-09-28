package miniProjeMukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 8128;
		int count = 0;
		
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count += i;
			}
		}
		
		if (count == 2 * number) {
			System.out.println(number + " sayısı mükemmel sayıdır.");
		}
		
		else {
			System.out.println(number + " sayısı mükemmel sayı değildir.");
		}
	}
}
