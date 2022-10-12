package com.vol.ihm;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class AddPiloteIHM extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPiloteIHM frame = new AddPiloteIHM();
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
	public AddPiloteIHM() {
		setBounds(100, 100, 450, 300);

	}

}
