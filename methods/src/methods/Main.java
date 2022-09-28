package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] numbers = { 1, 2, 5, 7, 9, 0 };
		int search = 5;
		boolean isThere = true;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == search) {
				isThere = true;
				break;
			}

			else {
				isThere = false;
			}
		}

		if (isThere) {
			mesajVer(search + " sayısı dizinin içinde bulunmaktadır.");
		}

		else {
			mesajVer(search + " sayısı dizinin içinde bulunmamaktadır.");
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
