package com.harca.subarea.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.harca.subarea.model.LerPlanilha;

public class JanLerPlanilha extends JFrame{
	JTextField path;
	JPanel panel;
	JButton ok;
	public JanLerPlanilha(){
		path = new JTextField(25);
		panel = new JPanel(new FlowLayout());
		ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LerPlanilha(path.getText());
			}
		});
		panel.add(path);
		panel.add(ok);
		setSize(320, 240);
		
		add(panel);
		setVisible(true);
	}
}
