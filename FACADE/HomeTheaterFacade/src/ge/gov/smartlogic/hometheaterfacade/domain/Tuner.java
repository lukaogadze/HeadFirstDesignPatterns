package ge.gov.smartlogic.hometheaterfacade.domain;

public class Tuner {
	private final String description;
	private final Amplifier amplifier;
	private double frequency;

	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}

	public void on() {
		System.out.println(description + " on");
	}

	public void off() {
		System.out.println(description + " off");
	}

	public void setFrequency(double frequency) {
		System.out.println(description + " setting frequency to " + frequency);
		this.frequency = frequency;
	}

	public void setAm() {
		System.out.println(description + " setting AM mode");
	}

	public void setFm() {
		System.out.println(description + " setting FM mode");
	}

	public String toString() {
		return description;
	}
}
