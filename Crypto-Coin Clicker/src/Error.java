
public class Error {

	private static Error error;
	
	public static Error getInstance() {
		if (error == null) {
			error = new Error();
		}
		return error;
	}
	
	/**
	 * Error Code Database:
	 * 1 - Not Enough Coins
	 * 2 - Not Enough Money
	 */
	
	boolean showError;
	String errorMessage;
	
	public void displayError(int errorCode){
		
		showError = true;
		
		switch (errorCode){
		case 0:
			errorMessage = "Please don't use an autoclicker!";
			break;
		case 1:
			errorMessage = "Error: You do not have enough coins to convert!";
			break;
		case 2:
			errorMessage = "Error: You do not have enough coins to purchase!";
			break;
		}
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public boolean isShowError() {
		return showError;
	}

	public void setShowError(boolean showError) {
		this.showError = showError;
	}
	
	
	
}
