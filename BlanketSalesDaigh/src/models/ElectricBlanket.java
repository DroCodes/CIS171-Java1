package models;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 28, 2023
* MacOS 13.2
*/
public class ElectricBlanket extends Blanket {
	private int numberOfHeatSettings;
	private boolean hasAutoShutOff;
	
	public ElectricBlanket() {
		super();
		
		setNumberOfHeatSettings(1);
		setHasAutoShutOff(false);
	}
	
	public ElectricBlanket(String size, String color, String material, int numberOfHeatSettings, boolean hasAutoShutoff) {
		super(size, color, material);
		
		setNumberOfHeatSettings(numberOfHeatSettings);
		setHasAutoShutOff(hasAutoShutoff);
	}
	/**
	 * @return the numberOfHeatSettings
	 */
	public int getNumberOfHeatSettings() {
		return numberOfHeatSettings;
	}
	
	/**
	 * @param numberOfHeatSettings the numberOfHeatSettings to set
	 */
	public void setNumberOfHeatSettings(int numberOfHeatSettings) {
		int defaultHeatSettings = 1;
//		checks the heat settings are within the valid range
		if(numberOfHeatSettings > 5 || numberOfHeatSettings < 1) {
			this.numberOfHeatSettings = defaultHeatSettings;
		} else {
			this.numberOfHeatSettings = numberOfHeatSettings;
		}
	}
	/**
	 * @return the hasAutoShutOff
	 */
	public boolean isHasAutoShutOff() {
		return hasAutoShutOff;
	}
	/**
	 * @param hasAutoShutOff the hasAutoShutOff to set
	 */
	public void setHasAutoShutOff(boolean hasAutoShutOff) {
//		price for auto shut off feature
		double premiumPrice = 5.75;
		
//		sets the premiumPrice if the blanket has the auto shutoff feature
		if(hasAutoShutOff) {
			this.price += premiumPrice;
		}
		this.hasAutoShutOff = hasAutoShutOff;
	}
	
	@Override
	public String featureReport() {
	    String autoShutOffStatus;
//	    sets autoShutOffStatus depending on if hasAutoShutoff is true or false
	    if (hasAutoShutOff) {
	        autoShutOffStatus = "with auto shut-off";
	    } else {
	        autoShutOffStatus = "without auto shut-off";
	    }
	    return super.featureReport()+ ", including " + numberOfHeatSettings + " settings " + autoShutOffStatus;
	}

}
