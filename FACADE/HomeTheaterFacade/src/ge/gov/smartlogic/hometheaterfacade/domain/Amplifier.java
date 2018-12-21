package ge.gov.smartlogic.hometheaterfacade.domain;

public class Amplifier {
	private final String description;
	private Tuner tuner;
	private DvdPlayer dvd;
	private CdPlayer cd;
	
	public Amplifier(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}
 
	public void setStereoSound() {
		System.out.println(description + " stereo mode on");
	}
 
	public void setSurroundSound() {
		System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
	}
 
	public void setVolume(int level) {
		System.out.println(description + " setting volume to " + level);
	}

	public void setTuner(Tuner tuner) {
		System.out.println(description + " setting tuner to " + dvd);
		this.tuner = tuner;
	}
  
	public void setDvd(DvdPlayer dvd) {
		System.out.println(description + " setting DVD player to " + dvd);
		this.dvd = dvd;
	}
 
	public void setCd(CdPlayer cd) {
		System.out.println(description + " setting CD player to " + cd);
		this.cd = cd;
	}
 
	public String toString() {
		return description;
	}
}
