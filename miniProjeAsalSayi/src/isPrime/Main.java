package isPrime;

public class Main {

	public static void main(String[] args) {

		int number = 5;
		boolean isPrime = false;
		
		if (number > 2) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}

				else {
					isPrime = true;
				}
			}

			if (isPrime) {
				System.out.println(number + " asal sayıdır.");
			}

			else {
				System.out.println(number + " asal sayı değildir.");
			}
		}
		
		else {
			System.out.println("Geçersiz sayı girdiniz.");
		}
		
	}
}
