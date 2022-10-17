package oopWithNLayeredKodlamaio.core.logging;

public class FileLogger implements BaseLogger {

	@Override
	public void add(String data) {
		System.out.println("Dosyaya loglandı: " + data);
	}

}
