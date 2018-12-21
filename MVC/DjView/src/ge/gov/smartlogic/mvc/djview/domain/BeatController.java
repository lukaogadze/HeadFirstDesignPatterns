package ge.gov.smartlogic.mvc.djview.domain;
  
public class BeatController implements ControllerInterface {
	private final BeatModelInterface beatModel;
	private final DJView djView;
   
	public BeatController(BeatModelInterface beatModel) {
		this.beatModel = beatModel;
		djView = new DJView(this, beatModel);
        djView.createView();
        djView.createControls();
		djView.disableStopMenuItem();
		djView.enableStartMenuItem();
		beatModel.initialize();
	}
  
	public void start() {
		beatModel.on();
		djView.disableStartMenuItem();
		djView.enableStopMenuItem();
	}
  
	public void stop() {
		beatModel.off();
		djView.disableStopMenuItem();
		djView.enableStartMenuItem();
	}
    
	public void increaseBeatPerMinute() {
        int beatPerMinute = beatModel.getBeatPerMinute();
        beatModel.setBeatPerMinute(beatPerMinute + 1);
	}
    
	public void decreaseBeatPerMinute() {
        int beatPerMinute = beatModel.getBeatPerMinute();
        beatModel.setBeatPerMinute(beatPerMinute - 1);
  	}
  
 	public void setBeatPerMinute(int beatPerMinute) {
		beatModel.setBeatPerMinute(beatPerMinute);
	}
}
