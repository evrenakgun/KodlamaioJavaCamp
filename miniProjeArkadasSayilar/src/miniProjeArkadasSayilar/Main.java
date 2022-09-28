package miniProjeArkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int number1 = 1184;
		int number2 = 1210;
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				count1 += i;
			}
		}
		
		for (int j = 1; j < number2; j++) {
			if (number2 % j == 0) {
				count2 += j;
			}
		}
		
		if ((count1 == number2) && (count2 == number1)) {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayılardır.");
		}
		
		else {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayı değildir.");
		}
	}
}
