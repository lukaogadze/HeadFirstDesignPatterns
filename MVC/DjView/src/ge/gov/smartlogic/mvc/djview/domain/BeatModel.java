package ge.gov.smartlogic.mvc.djview.domain;

import javax.sound.midi.*;

import java.util.*;

public class BeatModel implements BeatModelInterface, MetaEventListener {
	private Sequencer sequencer;
	private final ArrayList<BeatObserver> beatObservers;
	private final ArrayList<BeatPerMinuteObserver> beatPerMinuteObservers;
	private int beatPerMinute;
	private Sequence sequence;
	private Track track;

	public BeatModel() {
		beatObservers = new ArrayList<>();
		beatPerMinuteObservers = new ArrayList<>();
		beatPerMinute = 90;
	}

	public void initialize() {
		setUpMidi();
		buildTrackAndStart();
	}

	public void on() {
		System.out.println("Starting the sequencer");
		sequencer.start();
		setBeatPerMinute(90);
	}

	public void off() {
		setBeatPerMinute(0);
		sequencer.stop();
	}

	public void setBeatPerMinute(int beatPerMinute) {
		this.beatPerMinute = beatPerMinute;
		sequencer.setTempoInBPM(getBeatPerMinute());
		notifyBPMObservers();
	}

	@Override
	public int getBeatPerMinute() {
		return beatPerMinute;
	}

	void beatEvent() {
		notifyBeatObservers();
	}


	@Override
	public void registerObserver(BeatObserver beatObserver) {
		beatObservers.add(beatObserver);
	}


	public void notifyBeatObservers() {
		for (BeatObserver observer : beatObservers) {
			observer.updateBeat();
		}
	}

	@Override
	public void registerObserver(BeatPerMinuteObserver beatPerMinuteObserver) {
		beatPerMinuteObservers.add(beatPerMinuteObserver);
	}


	public void notifyBPMObservers() {
		for (BeatPerMinuteObserver observer : beatPerMinuteObservers) {
			observer.updateBeatPerMinute();
		}
	}


	@Override
	public void removeObserver(BeatObserver beatObserver) {
		beatObservers.remove(beatObserver);
	}



	public void removeObserver(BeatPerMinuteObserver beatPerMinuteObserver) {
		beatPerMinuteObservers.remove(beatPerMinuteObserver);
	}


	public void meta(MetaMessage message) {
		if (message.getType() == 47) {
			beatEvent();
			sequencer.start();
			setBeatPerMinute(getBeatPerMinute());
		}
	}

	public void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBeatPerMinute());
			sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 

	public void buildTrackAndStart() {
		int[] trackList = {35, 0, 46, 0};

		sequence.deleteTrack(null);
		track = sequence.createTrack();

		makeTracks(trackList);
		track.add(makeEvent(192,9,1,0,4));      
		try {
			sequencer.setSequence(sequence);                    
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 

	public void makeTracks(int[] list) {

		for (int i = 0; i < list.length; i++) {
			int key = list[i];

			if (key != 0) {
				track.add(makeEvent(144,9,key, 100, i));
				track.add(makeEvent(128,9,key, 100, i+1));
			}
		}
	}

	public  MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);

		} catch(Exception e) {
			e.printStackTrace(); 
		}
		return event;
	}
}
