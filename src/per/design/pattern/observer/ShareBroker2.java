package per.design.pattern.observer;

public class ShareBroker2 implements Subscriber {

	private ShareData shareData;
	private ShareUpdate shareUpdate;

	@Override
	public void update(ShareData shareData) {
		this.shareData = shareData;
		updateDisplayValue();
	}
	
	public void subscribe(ShareUpdate update) {
		this.shareUpdate = update;
		shareUpdate.subsrcibe(this);
	}
	
	public void unSubscribe(ShareUpdate update) {
		if(shareUpdate!=null)
			shareUpdate.unSubscribe(this);
	}
	
	public void updateDisplayValue() {
		System.out.println("ShareBroker 2 Display : "+shareData.getStockValue());
	}
	
}
