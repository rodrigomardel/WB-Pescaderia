package jcolonia.daw2023.ut7.pescaderia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;

public class VentanaTicket extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jcontentPanel;
	private JPanel jpanelExterior;
	private JPanel jpanelBotones;
	private JButton jbotonAvanzarTurno;
	private JButton jbotonSacarTicket;
	private JPanel jpanelBorde;
	private JPanel jpanelBordeTurno;
	private JPanel jpanelBordeTicket;
	private JTextPane jtextTurno;
	private JTextPane jtextTicket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTicket frame = new VentanaTicket();
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
	public VentanaTicket() {
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 204);
		jcontentPanel = new JPanel();
		jcontentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(jcontentPanel);
		jcontentPanel.setLayout(new BorderLayout(0, 0));
		jcontentPanel.add(getJpanelExterior());
	}

	private JPanel getJpanelExterior() {
		if (jpanelExterior == null) {
			jpanelExterior = new JPanel();
			jpanelExterior.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelExterior.setLayout(new BorderLayout(0, 0));
			jpanelExterior.add(getJpanelBotones(), BorderLayout.SOUTH);
			jpanelExterior.add(getJpanelBorde(), BorderLayout.NORTH);
		}
		return jpanelExterior;
	}

	private JPanel getJpanelBotones() {
		if (jpanelBotones == null) {
			jpanelBotones = new JPanel();
			jpanelBotones.setLayout(new GridLayout(1, 0, 10, 0));
			jpanelBotones.add(getJbotonAvanzarTurno_1());
			jpanelBotones.add(getJbotonAvanzarTurno_1_1());
		}
		return jpanelBotones;
	}

	private JButton getJbotonAvanzarTurno_1() {
		if (jbotonAvanzarTurno == null) {
			jbotonAvanzarTurno = new JButton("Avanzar Turno");
		}
		return jbotonAvanzarTurno;
	}

	private JButton getJbotonAvanzarTurno_1_1() {
		if (jbotonSacarTicket == null) {
			jbotonSacarTicket = new JButton("Sacar Ticket");
		}
		return jbotonSacarTicket;
	}

	private JPanel getJpanelBorde() {
		if (jpanelBorde == null) {
			jpanelBorde = new JPanel();
			jpanelBorde.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Pescader\u00EDa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jpanelBorde.setLayout(new GridLayout(0, 2, 0, 0));
			jpanelBorde.add(getJpanelBordeTurno());
			jpanelBorde.add(getJpanelBordeTicket());
		}
		return jpanelBorde;
	}
	private JPanel getJpanelBordeTurno() {
		if (jpanelBordeTurno == null) {
			jpanelBordeTurno = new JPanel();
			jpanelBordeTurno.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Turno", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jpanelBordeTurno.setLayout(new BorderLayout(0, 0));
			jpanelBordeTurno.add(getJtextTurno(), BorderLayout.NORTH);
		}
		return jpanelBordeTurno;
	}
	private JPanel getJpanelBordeTicket() {
		if (jpanelBordeTicket == null) {
			jpanelBordeTicket = new JPanel();
			jpanelBordeTicket.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ticket", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jpanelBordeTicket.setLayout(new BorderLayout(0, 0));
			jpanelBordeTicket.add(getJtextTicket(), BorderLayout.NORTH);
		}
		return jpanelBordeTicket;
	}
	private JTextPane getJtextTurno() {
		if (jtextTurno == null) {
			jtextTurno = new JTextPane();
			jtextTurno.setEnabled(false);
			jtextTurno.setEditable(false);
		}
		return jtextTurno;
	}
	private JTextPane getJtextTicket() {
		if (jtextTicket == null) {
			jtextTicket = new JTextPane();
			jtextTicket.setEnabled(false);
			jtextTicket.setEditable(false);
		}
		return jtextTicket;
	}
}
