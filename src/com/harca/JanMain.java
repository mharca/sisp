package com.harca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import com.harca.subarea.view.JanLerPlanilha;
import com.harca.subarea.view.JanSubArea;

public class JanMain extends JFrame{
	public JanMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(480,320);
		setTitle("Principal");
		
		JMenuBar menuBar = new JMenuBar();
		JMenu subArea = new JMenu("Subarea");
		
		JMenu subAreaAvancado = new JMenu("Avancado");
		
		JMenuItem lerPlanilha = new JMenuItem("Ler planilha");
		lerPlanilha.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new JanLerPlanilha();
				
			}
		});
		subAreaAvancado.add(lerPlanilha);
		JMenuItem procurar = new JMenuItem("Procurar");
		subArea.add(procurar);
		subArea.add(subAreaAvancado);
		menuBar.add(subArea);
		
		setJMenuBar(menuBar);
		procurar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new JanSubArea();
				
			}
		});
		
			
			
	
		
		
		setVisible(true);
	}
}
