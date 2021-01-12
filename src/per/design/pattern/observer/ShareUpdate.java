package per.design.pattern.observer;

import java.util.ArrayList;

public class ShareUpdate implements Publisher{
	
	private ShareData shareData;
	private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();

	@Override
	public void subsrcibe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void unSubscribe(Subscriber subscriber) {
		int index = subscribers.indexOf(subscriber);
		subscribers.remove(index);
	}

	@Override
	public void notifySubscriber() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update(shareData);
		}
	}

	public void setShareData(ShareData shareData) {
		this.shareData = shareData;
		notifySubscriber();
	}
}
