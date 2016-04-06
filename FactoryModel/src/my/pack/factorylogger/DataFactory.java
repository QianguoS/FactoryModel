package my.pack.factorylogger;

public class DataFactory implements FactoryLogger {

	public Loggers crateLogger() {
		// TODO Auto-generated method stub
		Loggers log = new DataLogger();
		return log;
	}

}
