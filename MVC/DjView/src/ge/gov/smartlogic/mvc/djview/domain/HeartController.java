package ge.gov.smartlogic.mvc.djview.domain;
  
public class HeartController implements ControllerInterface {
	private final HeartModelInterface heartModel;
	private final DJView djView;
  
	public HeartController(HeartModelInterface heartModel) {
		this.heartModel = heartModel;
		djView = new DJView(this, new HeartAdapter(heartModel));
        djView.createView();
        djView.createControls();
		djView.disableStopMenuItem();
		djView.disableStartMenuItem();
	}
  
	public void start() {}
 
	public void stop() {}
    
	public void increaseBeatPerMinute() {}
    
	public void decreaseBeatPerMinute() {}
  
 	public void setBeatPerMinute(int beatPerMinute) {}
}



