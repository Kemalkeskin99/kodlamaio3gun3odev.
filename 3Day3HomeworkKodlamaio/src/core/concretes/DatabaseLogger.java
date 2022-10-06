package core.concretes;

import core.abstracts.Logger;

public class DatabaseLogger implements Logger {

	@Override
	public void logg() {
		System.out.println("Veri tabanına loglandı.");
		
	}

}
