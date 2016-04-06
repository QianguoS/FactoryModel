package my.pack.factorylogger;

public class ModelFactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryLogger factory;
		Loggers log;
		factory = new FileFactory();
		log = factory.crateLogger();
		log.write();
	}

}
