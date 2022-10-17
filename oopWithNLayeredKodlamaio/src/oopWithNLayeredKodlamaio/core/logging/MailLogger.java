package oopWithNLayeredKodlamaio.core.logging;

public class MailLogger implements BaseLogger {

	@Override
	public void add(String data) {
		System.out.println("Mail gönderildi: " + data);
	}

}
