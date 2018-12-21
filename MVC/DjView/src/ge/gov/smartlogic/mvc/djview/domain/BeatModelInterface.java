package ge.gov.smartlogic.mvc.djview.domain;
  
public interface BeatModelInterface {
	void initialize();
  
	void on();
  
	void off();
  
    void setBeatPerMinute(int beatPerMinute);
  
	int getBeatPerMinute();
  
	void registerObserver(BeatObserver beatObserver);
  
	void removeObserver(BeatObserver beatObserver);
  
	void registerObserver(BeatPerMinuteObserver beatPerMinuteObserver);
  
	void removeObserver(BeatPerMinuteObserver beatPerMinuteObserver);
}
