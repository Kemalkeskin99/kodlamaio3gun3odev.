package core.concretes;

import core.abstracts.Logger;

public class FileLogger implements Logger {

	@Override
	public void logg() {
		System.out.println("Dosyaya loglandı.");
		
		
	}

}
