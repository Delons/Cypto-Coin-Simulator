import java.text.DecimalFormat;

public class Market {

	private static Market instance;

	public static Market getInstance() {
		if (instance == null) {
			instance = new Market();
		}
		return instance;
	}

	double rate;

	public void changeRate() {
		rate = 100 + (double) (Math.random() * ((200 - 100) + 1));
		DecimalFormat dec = new DecimalFormat("0.00");
		rate = Double.parseDouble(dec.format(rate));
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}
