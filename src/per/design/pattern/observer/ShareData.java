package per.design.pattern.observer;

public class ShareData {
	
	private double shareValue;
	
	public ShareData(double value) {
		this.shareValue = value;
	}

	public double getStockValue() {
		return shareValue;
	}

	public void setStockValue(double shareValue) {
		this.shareValue = shareValue;
	}
	
}
