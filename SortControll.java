package lesson13;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SortControll extends JPanel {
	private SortingPanel sortingPanel = new SortingPanel();

	private JButton nextStepBtn = new JButton("NextStep");

	public SortControll() {

		setLayout(new BorderLayout());
		add(sortingPanel, BorderLayout.CENTER);
		add(nextStepBtn, BorderLayout.SOUTH);
		
		nextStepBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				sortingPanel.nextStepInSorting();
			}
		});

	}
}
