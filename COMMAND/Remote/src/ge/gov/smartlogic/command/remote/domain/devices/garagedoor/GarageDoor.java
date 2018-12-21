package ge.gov.smartlogic.command.remote.domain.devices.garagedoor;

public class GarageDoor {
	private final String location;

	public GarageDoor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println(location + " Garage door is Up");
	}

	public void down() {
		System.out.println(location + " Garage door is Down");
	}

	public void stop() {
		System.out.println(location + " Garage door is Stopped");
	}

	public void lightOn() {
		System.out.println(location + " Garage door light is on");
	}

	public void lightOff() {
		System.out.println(location + " Garage door light is off");
	}
}
