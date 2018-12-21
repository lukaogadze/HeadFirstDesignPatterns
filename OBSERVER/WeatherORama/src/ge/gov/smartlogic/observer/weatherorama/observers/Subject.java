package ge.gov.smartlogic.observer.weatherorama.observers;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
