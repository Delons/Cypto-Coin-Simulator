/**
 * This class is used to mine the coins. It includes an automine and manualmine
 * method. Automine is called every minute, manual mine is called when the user
 * clicks on the mine button.
 */

public class Mine {

	private static Mine mine;

	public static Mine getInstance() {
		if (mine == null) {
			mine = new Mine();
		}
		return mine;
	}

	double manualAmount = .01;

	public void manualMine() {

		// Prevent Automatic Clickers

		Clicker clicker = Clicker.getInstance();

		// Manual Mine

		clicker.setCoins(clicker.getCoins() + manualAmount);

	}

	public void autoMine() {

		Clicker.getInstance().setCoins(Clicker.getInstance().getCoins() + cps);

	}

	public double cps;

	public void mineCoin() {

	}

	public double getCps() {
		return cps;
	}

	public void setCps(double cps) {
		this.cps = cps;
	}

	public double getManualAmount() {
		return manualAmount;
	}

	public void setManualAmount(double manualAmount) {
		this.manualAmount = manualAmount;
	}

}
