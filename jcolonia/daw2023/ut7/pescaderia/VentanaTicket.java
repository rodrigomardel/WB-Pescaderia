package jcolonia.daw2023.ut7.pescaderia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.JTextField;

public class VentanaTicket extends JFrame {
	private static final long serialVersionUID = 1L;

	private Ticket ticket;

	private JPanel jcontentPanel;
	private JPanel jpanelExterior;
	private JPanel jpanelBotones;
	private JButton jbotonAvanzarTurno;
	private JButton jbotonSacarTicket;
	private JPanel jpanelBorde;
	private JPanel jpanelBordeTurno;
	private JTextField jtextTurno;
	private JPanel jpanelInformación;
	private JTextPane jtextInformación;
	private JLabel júltimoTicket;
	private JMenuBar menuBar;
	private JButton jbotonRestablecer;

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

	private JFrame getVentana() {
		return this;
	}

	/**
	 * Create the frame.
	 */
	public VentanaTicket() {
		initialize();
		ticket = new Ticket("Pescados Delgado");
	}

	private void initialize() {
		setTitle("Ventana-Ticket");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 293);
		setJMenuBar(getMenuBar_1());
		jcontentPanel = new JPanel();
		jcontentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(jcontentPanel);
		jcontentPanel.setLayout(new BorderLayout(0, 0));
		jcontentPanel.add(getJpanelExterior());
		jcontentPanel.add(getJpanelInformación(), BorderLayout.SOUTH);
	}

	private JPanel getJpanelExterior() {
		if (jpanelExterior == null) {
			jpanelExterior = new JPanel();
			jpanelExterior.setBorder(new EmptyBorder(10, 10, 10, 10));
			jpanelExterior.setLayout(new BorderLayout(0, 0));
			jpanelExterior.add(getJpanelBotones(), BorderLayout.SOUTH);
			jpanelExterior.add(getJpanelBorde(), BorderLayout.CENTER);
		}
		return jpanelExterior;
	}

	private JPanel getJpanelBotones() {
		if (jpanelBotones == null) {
			jpanelBotones = new JPanel();
			jpanelBotones.setLayout(new GridLayout(1, 0, 10, 0));
			jpanelBotones.add(getJbotonAvanzarTurno_1());
			jpanelBotones.add(getJbotonSacarTicket());
		}
		return jpanelBotones;
	}

	private JButton getJbotonAvanzarTurno_1() {
		if (jbotonAvanzarTurno == null) {
			jbotonAvanzarTurno = new JButton("Avanzar Turno");
			jbotonAvanzarTurno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ticket.avanzarTurno();
						int turnoActual = ticket.getTurno();
						jtextTurno.setText(String.valueOf(turnoActual));
					} catch (TicketException e1) {
						JOptionPane.showMessageDialog(getVentana(), e1.getLocalizedMessage());
					}
				}
			});
		}
		return jbotonAvanzarTurno;
	}

	private JButton getJbotonSacarTicket() {
		if (jbotonSacarTicket == null) {
			jbotonSacarTicket = new JButton("Sacar Ticket");
			jbotonSacarTicket.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ticket.tirarTicket();
						int ticketActual = ticket.getTicket();
						String texto = String.format("Siguiente: %d", ticketActual);
						júltimoTicket.setText(texto);
					} catch (TicketException e1) {
						JOptionPane.showMessageDialog(getVentana(), e1.getLocalizedMessage());
						e1.printStackTrace();
					}

				}
			});
		}
		return jbotonSacarTicket;
	}

	private JPanel getJpanelBorde() {
		if (jpanelBorde == null) {
			jpanelBorde = new JPanel();
			jpanelBorde.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Pescados Delgado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jpanelBorde.setLayout(new BorderLayout(0, 0));
			jpanelBorde.add(getJpanelBordeTurno());
		}
		return jpanelBorde;
	}

	private JPanel getJpanelBordeTurno() {
		if (jpanelBordeTurno == null) {
			jpanelBordeTurno = new JPanel();
			jpanelBordeTurno.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Turno Actual", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jpanelBordeTurno.setLayout(new BorderLayout(10, 0));
			jpanelBordeTurno.add(getJtextTurno(), BorderLayout.CENTER);
			jpanelBordeTurno.add(getJúltimoTicket_1(), BorderLayout.SOUTH);
		}
		return jpanelBordeTurno;
	}

	private JTextField getJtextTurno() {
		if (jtextTurno == null) {
			jtextTurno = new JTextField();
			jtextTurno.setHorizontalAlignment(SwingConstants.CENTER);
			jtextTurno.setBorder(new EmptyBorder(10, 10, 10, 10));
			jtextTurno.setFont(new Font("Tahoma", Font.PLAIN, 60));
			jtextTurno.setEditable(false);
		}
		return jtextTurno;
	}

	private JPanel getJpanelInformación() {
		if (jpanelInformación == null) {
			jpanelInformación = new JPanel();
			jpanelInformación.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Autor",
					TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jpanelInformación.setLayout(new BorderLayout(0, 0));
			jpanelInformación.add(getJtextInformación(), BorderLayout.CENTER);
		}
		return jpanelInformación;
	}

	private JTextPane getJtextInformación() {
		if (jtextInformación == null) {
			jtextInformación = new JTextPane();
			jtextInformación.setText("Rodrigo Martínez Delgado - IC09");
			jtextInformación.setForeground(new Color(51, 102, 255));
			jtextInformación.setFont(new Font("Tahoma", Font.BOLD, 12));
			jtextInformación.setEditable(false);
			jtextInformación.setBorder(new EmptyBorder(0, 0, 0, 0));
		}
		return jtextInformación;
	}

	private JLabel getJúltimoTicket_1() {
		if (júltimoTicket == null) {
			júltimoTicket = new JLabel("Número de Ticket");
			júltimoTicket.setBounds(new Rectangle(0, 0, 10, 10));
			júltimoTicket.setVerticalAlignment(SwingConstants.BOTTOM);
			júltimoTicket.setToolTipText("");
			júltimoTicket.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return júltimoTicket;
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setMargin(new Insets(10, 10, 10, 10));
			menuBar.add(getJbotonRestablecer());
		}
		return menuBar;
	}

	private JButton getJbotonRestablecer() {
		if (jbotonRestablecer == null) {
			jbotonRestablecer = new JButton("Restablecer");
			jbotonRestablecer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ticket.restablecer();
					jtextTurno.setText("Pulse «Avanzar Turno»");
					júltimoTicket.setText("Número de Ticket");
				}
			});
			jbotonRestablecer.setVerticalAlignment(SwingConstants.TOP);
		}
		return jbotonRestablecer;
	}
}
