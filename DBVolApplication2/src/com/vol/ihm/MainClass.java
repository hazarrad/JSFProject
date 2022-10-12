package com.vol.ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainClass extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClass frame = new MainClass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 575);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPilote = new JMenu("Pilote");
		menuBar.add(mnPilote);
		
		JMenuItem mntmConsultation = new JMenuItem("Consultation des pilotes");
		mntmConsultation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConsultationPL c = new ConsultationPL();
				desktopPane.add(c);
				c.setTitle("Consultation des pilotes");
				c.setResizable(true);
				c.setClosable(true);
				c.setVisible(true);
			}
		});
		mnPilote.add(mntmConsultation);
		
		JMenuItem mntmAjouterUnPilote = new JMenuItem("Ajouter un pilote");
		mntmAjouterUnPilote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddPiloteIHM a = new AddPiloteIHM();
				desktopPane.add(a);
				a.setVisible(true);
			}
		});
	
		mnPilote.add(mntmAjouterUnPilote);
		
		JMenu mnAvion = new JMenu("Avion");
		menuBar.add(mnAvion);
		
		JMenu mnTrajet = new JMenu("Trajet");
		menuBar.add(mnTrajet);
		
		JMenu mnVols = new JMenu("Vols");
		menuBar.add(mnVols);
		
		JMenu mnEdition = new JMenu("Edition");
		menuBar.add(mnEdition);
		
		JMenu mnAPropos = new JMenu("A propos");
		menuBar.add(mnAPropos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}
}
