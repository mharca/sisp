package com.harca.subarea.view;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

import com.harca.subarea.model.TableModel;


public class JanSubArea extends JFrame{
	JTextField t_busca;
	JLabel l_busca;
	JPanel panel1;
	JPanel panel2;
	JScrollPane jsp;
	JTable tabela;
	public JanSubArea() {
		setSize(800,600);
		panel2 = new JPanel(new GridLayout(4,2));
		panel1 = new JPanel(new GridLayout(2,1));
		t_busca = new JTextField();
		
		l_busca = new JLabel("Filtrar");
		
		tabela = new JTable(new TableModel());
		
		jsp = new JScrollPane(tabela);
		
		panel2.add(l_busca);
		panel2.add(t_busca);
		
		panel1.add(panel2, BorderLayout.NORTH);
		panel1.add(jsp,BorderLayout.CENTER);
		
		add(panel1);
		setVisible(true);
	}

}
