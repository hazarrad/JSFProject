package com.atelier1.ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.JXDatePicker;

import com.atelier1.dao.DAOclient;
import com.atelier1.models.Client;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.jdesktop.swingx.JXTable;
import javax.swing.JScrollPane;

public class ExHibernate extends JFrame {

	private JPanel contentPane;
	private JXDatePicker dateNas; 
	private JTextField txt_nom;
	private JTextField txt_prenom;
	private JLabel lblDateNaissance;
	private JScrollPane scrollPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExHibernate frame = new ExHibernate();
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
	public ExHibernate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 26, 503, 121);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txt_nom = new JTextField();
		txt_nom.setColumns(10);
		txt_nom.setBounds(33, 48, 86, 20);
		panel.add(txt_nom);
		
		txt_prenom = new JTextField();
		txt_prenom.setColumns(10);
		txt_prenom.setBounds(188, 48, 86, 20);
		panel.add(txt_prenom);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(33, 23, 46, 14);
		panel.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setBounds(188, 23, 46, 14);
		panel.add(lblPrenom);
		
		dateNas = new JXDatePicker(); 
		dateNas.setBounds(327, 47, 119, 23);
		dateNas.setFormats("dd-MM-yyyy");
		panel.add(dateNas);
		
		lblDateNaissance = new JLabel("Date Naissance :");
		lblDateNaissance.setBounds(327, 23, 103, 14);
		panel.add(lblDateNaissance);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Client c = new Client();
				c.setNom(txt_nom.getText());
				c.setPrenom(txt_prenom.getText());
				c.setDateNaissance(dateNas.getDate());
				
				DAOclient.AddClient(c);
			}
		});
		btnNewButton.setBounds(357, 81, 89, 23);
		panel.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 180, 503, 248);
		contentPane.add(scrollPane);
		
		JXTable table = new JXTable();
		scrollPane.setViewportView(table);
		table.setModel(new ModelTableClient());
	}
}
