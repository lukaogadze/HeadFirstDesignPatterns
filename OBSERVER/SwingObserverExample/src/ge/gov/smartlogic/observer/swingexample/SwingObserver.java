package ge.gov.smartlogic.observer.swingexample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by loghadze on 17/12/2018.
 */
public class SwingObserver {
    private final JFrame jFrame;

    public SwingObserver() {
        jFrame = new JFrame();
    }

    public void go() {
        JButton jButton = new JButton("Should I do it?");

        jButton.addActionListener((ActionEvent actionEvent) -> {
            System.out.println("Don't do it, you might regret it!");
        });
        jButton.addActionListener((ActionEvent actionEvent) -> {
            System.out.println("Come on, do it!");
        });

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }

}
