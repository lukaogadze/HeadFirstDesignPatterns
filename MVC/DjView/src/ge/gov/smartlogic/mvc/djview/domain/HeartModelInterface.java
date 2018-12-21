package ge.gov.smartlogic.mvc.djview.domain;

public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BeatPerMinuteObserver o);
	void removeObserver(BeatPerMinuteObserver o);
}
