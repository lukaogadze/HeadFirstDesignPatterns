package ge.gov.smartlogic.observer.weatherorama.observers;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
