package ge.gov.smartlogic.mvc.djview.domain;

public class HeartAdapter implements BeatModelInterface {
	private final HeartModelInterface heartModel;
 
	public HeartAdapter(HeartModelInterface heartModel) {
		this.heartModel = heartModel;
	}

    public void initialize() {}
  
    public void on() {}
  
    public void off() {}
   
	public int getBeatPerMinute() {
		return heartModel.getHeartRate();
	}
  
    public void setBeatPerMinute(int beatPerMinute) {}
   
	public void registerObserver(BeatObserver beatObserver) {
		heartModel.registerObserver(beatObserver);
	}
    
	public void removeObserver(BeatObserver beatObserver) {
		heartModel.removeObserver(beatObserver);
	}
     
	public void registerObserver(BeatPerMinuteObserver beatPerMinuteObserver) {
		heartModel.registerObserver(beatPerMinuteObserver);
	}
  
	public void removeObserver(BeatPerMinuteObserver beatPerMinuteObserver) {
		heartModel.removeObserver(beatPerMinuteObserver);
	}
}
