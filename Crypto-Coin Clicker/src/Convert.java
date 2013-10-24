public class Convert {

	private static Convert instance;

	public static Convert getInstance() {
		if (instance == null) {
			instance = new Convert();
		}
		return instance;
	}

	double manualAmount = .01;

	public void manualConvert() {

		Clicker clicker = Clicker.getInstance();

		if (clicker.getCoins() >= manualAmount) {
			clicker.setCoins(clicker.getCoins() - manualAmount);
			clicker.setMoney(clicker.getMoney() + Market.getInstance().getRate() * manualAmount);
		} else {
			Error.getInstance().displayError(1);
		}
	}
	
	public void autoConvert() {
		
		Clicker clicker = Clicker.getInstance();
		
		if (clicker.getCoins() >= acps & acps != 0) {
			clicker.setCoins(clicker.getCoins() - acps);
			clicker.setMoney(clicker.getMoney() + Market.getInstance().getRate() * manualAmount);
		}
		
	}

	double acps = 0;

	public double getAcps() {
		return acps;
	}

	public void setAcps(double acps) {
		this.acps = acps;
	}

}
