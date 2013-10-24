/**
 * This is the main class of the program. Everything is run from here.
 * @version A.1.0.1_2
 */
public class Clicker {

	// Game Stage V. Stage Letter - Main Version - Minor Version - Bug Fix -
	// Release Number
	final String versionNumber = "Alpha Version A.1.0.1_2";

	public static void main(String[] args) {
		new Clicker().init();
	}

	private static Clicker clicker;

	public static Clicker getInstance() {
		if (clicker == null) {
			clicker = new Clicker();
		}
		return clicker;
	}

	public void init() {

		GUI.getInstance().drawGUI();
		Market.getInstance().changeRate();

	}

	double coins, money;

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getCoins() {
		return coins;
	}

	public void setCoins(double coins) {
		this.coins = coins;
	}

	public String getVersionNumber() {
		return versionNumber;
	}

}
