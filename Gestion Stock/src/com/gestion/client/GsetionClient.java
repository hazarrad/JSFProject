package com.gestion.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.client.Client;
import com.client.modelClient;
import com.dao.client.DaoClient;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GsetionClient extends JFrame {

	private JPanel contentPane;
	private JTextField txtid;
	private JTextField txtprenom;
	private JTextField txtnom;
	private JTextField txtpostal;
	private JTextField txtadresse;
	private JTextField txtdate;
	private JTextField txttele;
	private JTextField txtpays;
	private JTextField txtville;
	private JTextField txtemail;
	private JTextField txtsearch;
	private JTable table;
	private JScrollPane scrollPane;

	modelClient mymodel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GsetionClient frame = new GsetionClient();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GsetionClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1253, 437);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(25, 107, 83, 14);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("prenom");
		lblPrenom.setBounds(25, 129, 83, 14);
		contentPane.add(lblPrenom);
		
		JLabel lblDateNaissance = new JLabel("Date Naissance");
		lblDateNaissance.setBounds(25, 154, 83, 14);
		contentPane.add(lblDateNaissance);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(25, 179, 83, 14);
		contentPane.add(lblAdresse);
		
		JLabel lblCodePostal = new JLabel("Code Postal");
		lblCodePostal.setBounds(25, 204, 83, 14);
		contentPane.add(lblCodePostal);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(25, 229, 83, 14);
		contentPane.add(lblVille);
		
		JLabel lblPays = new JLabel("pays");
		lblPays.setBounds(25, 254, 83, 14);
		contentPane.add(lblPays);
		
		JLabel lblTelephone = new JLabel("telephone");
		lblTelephone.setBounds(25, 279, 83, 14);
		contentPane.add(lblTelephone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(25, 304, 83, 14);
		contentPane.add(lblEmail);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(25, 82, 83, 14);
		contentPane.add(lblId);
		
		txtid = new JTextField();
		txtid.setEnabled(false);
		txtid.setBounds(126, 79, 123, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		txtprenom = new JTextField();
		txtprenom.setColumns(10);
		txtprenom.setBounds(126, 126, 123, 20);
		contentPane.add(txtprenom);
		
		txtnom = new JTextField();
		txtnom.setColumns(10);
		txtnom.setBounds(126, 104, 123, 20);
		contentPane.add(txtnom);
		
		txtpostal = new JTextField();
		txtpostal.setColumns(10);
		txtpostal.setBounds(126, 201, 123, 20);
		contentPane.add(txtpostal);
		
		txtadresse = new JTextField();
		txtadresse.setColumns(10);
		txtadresse.setBounds(126, 179, 123, 20);
		contentPane.add(txtadresse);
		
		txtdate = new JTextField();
		txtdate.setColumns(10);
		txtdate.setBounds(126, 154, 123, 20);
		contentPane.add(txtdate);
		
		txttele = new JTextField();
		txttele.setColumns(10);
		txttele.setBounds(126, 276, 123, 20);
		contentPane.add(txttele);
		
		txtpays = new JTextField();
		txtpays.setColumns(10);
		txtpays.setBounds(126, 254, 123, 20);
		contentPane.add(txtpays);
		
		txtville = new JTextField();
		txtville.setColumns(10);
		txtville.setBounds(126, 229, 123, 20);
		contentPane.add(txtville);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBounds(126, 302, 123, 20);
		contentPane.add(txtemail);
		
		txtsearch = new JTextField();
		txtsearch.setColumns(10);
		txtsearch.setBounds(276, 50, 188, 20);
		contentPane.add(txtsearch);
		
		JButton btnRechercher = new JButton("Rechercher");
		btnRechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtsearch.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "enter id waht do you want to find");
					return;
				}
				
				
				
				Client c;
				try {
					int s=Integer.valueOf(txtsearch.getText());
					c=DaoClient.getoneProduit(s);
					
					txtid.setText(String.valueOf(c.getIdClient()));
					txtnom.setText(c.getNom());
					txtprenom.setText(c.getPrenom());
					txtdate.setText(c.getDatenaissance());
					txtadresse.setText(c.getAdresse());
					txtpostal.setText(String.valueOf(c.getCodepostal()));
					txtville.setText(c.getVille());
					txtpays.setText(c.getPays());
					txttele.setText(String.valueOf(c.getTelephone()));
					txtemail.setText(c.getEmail());
					
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnRechercher.setBounds(474, 49, 89, 23);
		contentPane.add(btnRechercher);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(276, 73, 951, 269);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblListeDesClient = new JLabel("Liste des Client");
		lblListeDesClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblListeDesClient.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblListeDesClient.setBounds(580, 11, 211, 31);
		contentPane.add(lblListeDesClient);
		
		JButton btnJouter = new JButton("Ajouter");
		btnJouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtnom.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "nom client non renseigne");
					return;
				}
				if(txtprenom.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Prenom client non renseigne");
					return;
				}
				if(txtdate.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Date client non renseigne");
					return;
				}
				if(txtadresse.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "date naissance client non renseigne");
					return;
				}
				if(txtpostal.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "code postal client non renseigne");
					return;
				}
				if(txtville.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "ville client non renseigne");
					return;
				}
				if(txtpays.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "pays client non renseigne");
					return;
				}
				if(txttele.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "telephone client non renseigne");
					return;
				}
				if(txtemail.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Email client non renseigne");
					return;
				}
				
				
				
				Client c=new Client();
				c.setNom(txtnom.getText());
				c.setPrenom(txtprenom.getText());
				c.setDatenaissance(txtdate.getText());
				c.setAdresse(txtadresse.getText());
				c.setCodepostal(Integer.parseInt(txtpostal.getText()));
				c.setVille(txtville.getText());
				c.setPays(txtpays.getText());
				c.setTelephone(Integer.parseInt(txttele.getText()));
				c.setEmail(txtemail.getText());
				
				
				try {
					int n=DaoClient.AddClient(c);
					
					if(n>0)
						JOptionPane.showMessageDialog(null, "Produit insere avec succes");
					else 
						JOptionPane.showMessageDialog(null, "Probleme lors d'insertion du produit");

					txtnom.setText("");
					txtprenom.setText("");
					txtdate.setText("");
					txtadresse.setText("");
					txtpostal.setText("");
					txtville.setText("");
					txtpays.setText("");
					txttele.setText("");
					txtemail.setText("");
					txtnom.grabFocus();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnJouter.setBounds(434, 359, 89, 23);
		contentPane.add(btnJouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(536, 359, 89, 23);
		contentPane.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtid.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "find to client do you want remove");
					return;
				}
				
				try {
					int id=Integer.valueOf(txtid.getText());
					DaoClient.RemoveClient(id);

					if(id>0)
						JOptionPane.showMessageDialog(null, "Client remove  succes");
					else 
						JOptionPane.showMessageDialog(null, "Probleme remove the client");

					txtid.setText("");
					txtnom.setText("");
					txtprenom.setText("");
					txtdate.setText("");
					txtadresse.setText("");
					txtpostal.setText("");
					txtville.setText("");
					txtpays.setText("");
					txttele.setText("");
					txtemail.setText("");
					txtnom.grabFocus();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnSupprimer.setBounds(643, 359, 89, 23);
		contentPane.add(btnSupprimer);
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnFermer.setBounds(751, 359, 89, 23);
		contentPane.add(btnFermer);

		
		
		
		try {
			
			ArrayList<Client> cls=DaoClient.getAllClient();
			ArrayList<String> c=new ArrayList<>();
			
			c.add("Id Client");
			c.add("Nom Client");
			c.add("Prenom Client");
			c.add("Date Naissance");
			c.add("Adresse");
			c.add("Code Postal");
			c.add("Ville");
			c.add("Pays");
			c.add("telephone");
			c.add("Email");
		
			mymodel=new modelClient(c,cls);
			table.setModel(mymodel);
		} catch (Exception e) {
			e.getMessage();
		}
		
	}

	
}
