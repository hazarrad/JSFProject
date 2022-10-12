package com.vol.ihm;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import com.vol.dao.DaoPilote;
import com.vol.entities.Pilote;
import com.vol.entities.Vol;
import com.vol.ihm.modelTable.ModelPilote;
import com.vol.ihm.modelTable.ModelVol;

import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.FileChooserUI;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import org.jdesktop.swingx.JXDatePicker;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultationPL extends JInternalFrame {
	private JTable table;
	ModelPilote model;
	private JTable table_1;
	ModelVol modelvol;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultationPL frame = new ConsultationPL();
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
	public ConsultationPL() {
		setBounds(100, 100, 833, 584);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setBounds(12, 95, 793, 202);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

		try {
			ArrayList<Pilote> pilotes= DaoPilote.getAll();
			
			model = new ModelPilote(pilotes);
			
			table.setModel(model);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informations du Dernier vol", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
			panel.setBounds(12, 323, 793, 212);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Nombre de vols :");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel.setBounds(23, 28, 145, 25);
			panel.add(lblNewLabel);
			
			JLabel lbl_nbvol = new JLabel("0");
			lbl_nbvol.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lbl_nbvol.setBounds(213, 28, 155, 25);
			panel.add(lbl_nbvol);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(23, 66, 758, 133);
			panel.add(scrollPane_1);
			
			table_1 = new JTable();
			scrollPane_1.setViewportView(table_1);
			
			JButton btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					JFileChooser ch = new JFileChooser();
					
					ch.showOpenDialog(null);
					
					
				}
			});
			btnNewButton.setBounds(303, 44, 97, 25);
			getContentPane().add(btnNewButton);
			
			
			table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
				
				@Override
				public void valueChanged(ListSelectionEvent arg0) {
					try {
						
						int id = Integer.valueOf(table.getValueAt(table.getSelectedRow(), 0).toString());
						ArrayList<Vol> vols = DaoPilote.getAllVols(id);
						lbl_nbvol.setText(String.valueOf(vols.size()));

						modelvol = new ModelVol(vols);
						table_1.setModel(modelvol);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					
				}
			});
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erreur d'extrcation de la liste des pilotes");
		}
		
		
	}
}
