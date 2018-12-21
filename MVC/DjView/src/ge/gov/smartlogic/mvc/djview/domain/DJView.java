package ge.gov.smartlogic.mvc.djview.domain;
    
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DJView implements ActionListener,  BeatObserver, BeatPerMinuteObserver {
	private final BeatModelInterface beatModelInterface;
    private final ControllerInterface controller;
    private JFrame viewFrame;
    private JPanel viewPanel;
    private BeatBar beatBar;
    private JLabel beatPerMinuteOutputLabel;
    private JFrame controlFrame;
    private JPanel controlPanel;
    private JLabel beatPerMinuteLabel;
    private JTextField beatPerMinuteTestField;
    private JButton setBeatPerMinuteButton;
    private JButton increaseBeatPerMinuteButton;
    private JButton decreaseBeatPerMinuteButton;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem startMenuItem;
    private JMenuItem stopMenuItem;

    public DJView(ControllerInterface controller, BeatModelInterface beatModelInterface) {
		this.controller = controller;
		this.beatModelInterface = beatModelInterface;
		beatModelInterface.registerObserver((BeatObserver)this);
		beatModelInterface.registerObserver((BeatPerMinuteObserver)this);
    }
    
    public void createView() {
		// Create all Swing components here
        viewPanel = new JPanel(new GridLayout(1, 2));
        viewFrame = new JFrame("View");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(100, 80));
        beatPerMinuteOutputLabel = new JLabel("offline", SwingConstants.CENTER);
		beatBar = new BeatBar();
		beatBar.setValue(0);
        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
		bpmPanel.add(beatBar);
        bpmPanel.add(beatPerMinuteOutputLabel);
        viewPanel.add(bpmPanel);
        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setVisible(true);
	}
  
  
    public void createControls() {
		// Create all Swing components here
        JFrame.setDefaultLookAndFeelDecorated(true);
        controlFrame = new JFrame("Control");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(100, 80));

        controlPanel = new JPanel(new GridLayout(1, 2));

        menuBar = new JMenuBar();
        menu = new JMenu("DJ Control");
        startMenuItem = new JMenuItem("Start");
        menu.add(startMenuItem);
        startMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                controller.start();
            }
        });
        stopMenuItem = new JMenuItem("Stop");
        menu.add(stopMenuItem); 
        stopMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                controller.stop();
            }
        });
        JMenuItem exit = new JMenuItem("Quit");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        menu.add(exit);
        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);

        beatPerMinuteTestField = new JTextField(2);
        beatPerMinuteLabel = new JLabel("Enter BPM:", SwingConstants.RIGHT);
        setBeatPerMinuteButton = new JButton("Set");
        setBeatPerMinuteButton.setSize(new Dimension(10,40));
        increaseBeatPerMinuteButton = new JButton(">>");
        decreaseBeatPerMinuteButton = new JButton("<<");
        setBeatPerMinuteButton.addActionListener(this);
        increaseBeatPerMinuteButton.addActionListener(this);
        decreaseBeatPerMinuteButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));

		buttonPanel.add(decreaseBeatPerMinuteButton);
		buttonPanel.add(increaseBeatPerMinuteButton);

        JPanel enterPanel = new JPanel(new GridLayout(1, 2));
        enterPanel.add(beatPerMinuteLabel);
        enterPanel.add(beatPerMinuteTestField);
        JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(setBeatPerMinuteButton);
        insideControlPanel.add(buttonPanel);
        controlPanel.add(insideControlPanel);
        
        beatPerMinuteLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        beatPerMinuteOutputLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        controlFrame.getRootPane().setDefaultButton(setBeatPerMinuteButton);
        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

        controlFrame.pack();
        controlFrame.setVisible(true);
    }

	public void enableStopMenuItem() {
    	stopMenuItem.setEnabled(true);
	}

	public void disableStopMenuItem() {
    	stopMenuItem.setEnabled(false);
	}

	public void enableStartMenuItem() {
    	startMenuItem.setEnabled(true);
	}

	public void disableStartMenuItem() {
    	startMenuItem.setEnabled(false);
	}

    public void actionPerformed(ActionEvent actionEvent) {
		if (actionEvent.getSource() == setBeatPerMinuteButton) {
			int beatPerMinute = Integer.parseInt(beatPerMinuteTestField.getText());
        	controller.setBeatPerMinute(beatPerMinute);
		} else if (actionEvent.getSource() == increaseBeatPerMinuteButton) {
			controller.increaseBeatPerMinute();
		} else if (actionEvent.getSource() == decreaseBeatPerMinuteButton) {
			controller.decreaseBeatPerMinute();
		}
    }

	public void updateBeatPerMinute() {
		if (beatModelInterface != null) {
			int beatPerMinute = beatModelInterface.getBeatPerMinute();
			if (beatPerMinute == 0) {
				if (beatPerMinuteOutputLabel != null) {
        			beatPerMinuteOutputLabel.setText("offline");
				}
			} else {
				if (beatPerMinuteOutputLabel != null) {
        			beatPerMinuteOutputLabel.setText("Current BPM: " + beatModelInterface.getBeatPerMinute());
				}
			}
		}
	}
  
	public void updateBeat() {
		if (beatBar != null) {
			 beatBar.setValue(100);
		}
	}
}
