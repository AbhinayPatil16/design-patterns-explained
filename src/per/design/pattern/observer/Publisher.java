package per.design.pattern.observer;

public interface Publisher {

	public void subsrcibe(Subscriber subscriber);
	public void unSubscribe(Subscriber subscriber);
	public void notifySubscriber();
	
}
