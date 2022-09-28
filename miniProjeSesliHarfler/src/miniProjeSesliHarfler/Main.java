package miniProjeSesliHarfler;

public class Main {

	public static void main(String[] args) {
		char word = 'I';
		
		/*
		if ((word == 'A') || (word == 'I') || (word == 'O') || (word == 'U')) {
			System.out.println(word + " kalın sesli bir harftir.");
		}
		
		else if ((word == 'E') || (word == 'İ') || (word == 'Ö') || (word == 'Ü')) {
			System.out.println(word + " ince sesli bir harftir.");
		}
		
		else {
			System.out.println("Geçersiz bir karakter girdiniz.");
		}
		*/
		
		//Ben yukarıdaki şekilde yapmıştım ama Engin hocamızın yaptığı daha pratik gözüküyor.
		
		switch (word) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(word + " kalın sesli bir harftir.");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println(word + " ince sesli bir harftir.");
		default:
			System.out.println("Geçersiz bir karakter girdiniz.");
			break;
		}
	}
}
