package my.pack.factorylogger;

public class FileFactory implements FactoryLogger {

	public Loggers crateLogger() {
		// TODO Auto-generated method stub
		Loggers log = new FileLogger();
		return log;
	}

}
