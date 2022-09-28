package miniProjeSayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 5, 7, 9, 0};
		int search = 4;
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
			System.out.println(search + " sayısı dizinin içinde bulunmaktadır.");
		}
		
		else {
			System.out.println(search + " sayısı dizinin içinde bulunmamaktadır.");
		}
	}

}
