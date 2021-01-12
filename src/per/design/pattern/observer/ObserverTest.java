package per.design.pattern.observer;

public class ObserverTest {

	
	public static void main(String[] args) {
		
		ShareBroker1 broker1 = new ShareBroker1();
		ShareBroker2 broker2 = new ShareBroker2();
		ShareUpdate shareUpdate = new ShareUpdate();
		shareUpdate.setShareData(new ShareData(2321.23));
		broker1.subscribe(shareUpdate);
		broker2.subscribe(shareUpdate);
		shareUpdate.setShareData(new ShareData(2321.123));
		broker1.unSubscribe(shareUpdate);
		shareUpdate.setShareData(new ShareData(364.23));
		
	}
	
}
