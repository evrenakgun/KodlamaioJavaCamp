package oopWithNLayeredKodlamaio.core.logging;

public class DatabaseLogger implements BaseLogger {

	@Override
	public void add(String data) {
		System.out.println("Veritabanına loglandı: " + data);
	}

}
