
public class Rig {

	int processorLvl = 0, ramLvl = 0, gpuLvl = 0;
	
	//Each Level gives you the square more.
	//Lvl 1 = 1, Level 2 = 2, Level 3 = 4, Level 4 = 16.....
	
	String[] processorPrice = {"100", "300", "500", "750", "800", "1000", "1200", "1500", "1700", "1900"};
	String[] ramPrice = {"20", "25", "50", "75", "100", "120", "150", "200", "250", "500"};
	String[] gpuPrice = {};
	
	private static Rig rig;
	
	public static Rig getInstance() {
		if (rig == null) {
			rig = new Rig();
		}
		return rig;
	}
	
	public void upgradeProcessor(){
		
		Clicker clicker = Clicker.getInstance();
		
		if(clicker.getMoney() >= Integer.parseInt(processorPrice[processorLvl])){
			clicker.setMoney(clicker.getMoney() - Integer.parseInt(processorPrice[processorLvl]));
			processorLvl += 1;
			
			Mine.getInstance().setCps(Mine.getInstance().getCps() + processorLvl);
		
		} else {
			Error.getInstance().displayError(2);

		}
		
	}
	
	public void upgradeRam(){
		
	}
	
	public void upgradeGPU(){
		
	}

	public int getProcessorLvl() {
		return processorLvl;
	}

	public void setProcessorLvl(int processorLvl) {
		this.processorLvl = processorLvl;
	}

	public int getRamLvl() {
		return ramLvl;
	}

	public void setRamLvl(int ramLvl) {
		this.ramLvl = ramLvl;
	}

	public int getGpuLvl() {
		return gpuLvl;
	}

	public void setGpuLvl(int gpuLvl) {
		this.gpuLvl = gpuLvl;
	}

	public String[] getProcessorPrice() {
		return processorPrice;
	}

	public void setProcessorPrice(String[] processorPrice) {
		this.processorPrice = processorPrice;
	}
	
	
	
}
