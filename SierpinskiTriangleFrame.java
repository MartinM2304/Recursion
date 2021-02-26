package lesson3;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

	public class SierpinskiTriangleFrame extends JFrame {
		static int r = 0, gr = 0, b = 255;

		private JTextField jtfOrder = new JTextField("0", 5); // Order
		private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel();
		// To display the pattern
		
		JButton addBtn= new JButton ("+");
		JButton deleteBtn= new JButton ("-");
		public SierpinskiTriangleFrame() {
	// Panel to hold label, text field, and a button
			
			JPanel panel = new JPanel();
			
			panel.add(addBtn);
			panel.add(deleteBtn);
			
	// Add a Sierpinski triangle panel to the frame
			add(trianglePanel);
			add(panel, BorderLayout.SOUTH);
			
	// Register a listener
			addBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					trianglePanel.increaseOrder();
				}
				
				
			});
			
			deleteBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					trianglePanel.decreaseOrder();
				}
				
				
			});
			
		
		}

	}

//				jtfOrder.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					trianglePanel.setOrder(Integer.parseInt(jtfOrder.getText()));
//				}
//			});

