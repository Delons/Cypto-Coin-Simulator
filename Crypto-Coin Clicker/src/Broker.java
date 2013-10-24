
public class Broker {

	private static Broker broker;
	
	public static Broker getInstance(){
		if (broker == null) {
			broker = new Broker();
		}
		return broker;
	}
	
	/**
	 * You can have a unlimited amount of brokers
	 * The amount they can trade at a time depends on their level
	 * Brokers take compensation, newbie less, advanced more
	 * Newbie - .01
	 * Moderate - .5
	 * Advanced - 1
	 */
	
	int newbieBrokerAmt = 0, moderateBrokerAmt = 0, advancedBrokerAmt = 0;
	int newbieBrokerStartingPrice = 20;
	
	public void addNewbieBroker() {
		
		Clicker clicker = Clicker.getInstance();
		
		if (clicker.getMoney() >= (newbieBrokerAmt + 1) * 20) {
			clicker.setMoney(clicker.getMoney() - (newbieBrokerAmt + 1) * 20);
			newbieBrokerAmt += 1;
			Convert.getInstance().setAcps(Convert.getInstance().getAcps() + .01);
		} else {
			Error.getInstance().displayError(2);

		}
		
	}
	
	public void addModerateBrokerAmt(){
		
	}
	
	public void advancedBrokerAmt(){
		
	}

	public int getNewbieBrokerAmt() {
		return newbieBrokerAmt;
	}

	public void setNewbieBrokerAmt(int newbieBrokerAmt) {
		this.newbieBrokerAmt = newbieBrokerAmt;
	}
	
	
	
}
