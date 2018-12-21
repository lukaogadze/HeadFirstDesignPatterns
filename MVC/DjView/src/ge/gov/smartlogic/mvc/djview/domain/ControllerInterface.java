package ge.gov.smartlogic.mvc.djview.domain;
  
public interface ControllerInterface {
	void start();
	void stop();
	void increaseBeatPerMinute();
	void decreaseBeatPerMinute();
 	void setBeatPerMinute(int beatPerMinute);
}
