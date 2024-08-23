
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;


public class Aplicacion extends JFrame {
	

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private panelPeluqueriaBogota panelBogota_ = new panelPeluqueriaBogota();
	private panelMedellin panelDeMedellin = new panelMedellin();
	private panelCali panelDeCali = new panelCali();
	private panelTotales panelDeTotales = new panelTotales(panelBogota_, panelDeMedellin ,panelDeCali);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion frame = new Aplicacion();
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
	public Aplicacion() {
		getContentPane().add(panelDeTotales);
		getContentPane().add(panelDeCali);
		getContentPane().add(panelBogota_);
		getContentPane().add(panelDeMedellin);
		
		
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setResizable(false);
		
		setType(Type.UTILITY);
		setTitle("Peluqueria MAB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JPanel panel1 = new JPanel();
		panel1.setBounds(168, 6, 519, 308);
		contentPane.add(panel1);
		panel1.setLayout(new BorderLayout(0, 0));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(6, 6, 150, 314);
		contentPane.add(panelBotones);
		panelBotones.setLayout(new GridLayout(4, 0, 0, 0));
		
	
		JButton btnBogota = new JButton("Bogota");
		btnBogota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.add(panelBogota_);
				panelBogota_.setVisible(true);
				panel1.revalidate();
				panel1.repaint();
				panelDeMedellin.setVisible(false);
				panelDeCali.setVisible(false);
				panelDeTotales.setVisible(false);
			}
		});
		btnBogota.setForeground(Color.BLACK);
		btnBogota.setBackground(Color.ORANGE);
		btnBogota.setFont(new Font("Zapfino", Font.BOLD | Font.ITALIC, 13));
		panelBotones.add(btnBogota);
		
		JButton btnMedellin = new JButton("Medellin");
		btnMedellin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.add(panelDeMedellin);
				panel1.revalidate();
				panel1.repaint();
				panelDeMedellin.setVisible(true);
				panelBogota_.setVisible(false);
				panelDeCali.setVisible(false);
				panelDeTotales.setVisible(false);
			}
		});
		btnMedellin.setFont(new Font("Zapfino", Font.BOLD | Font.ITALIC, 13));
		panelBotones.add(btnMedellin);
		
		JButton btnCali = new JButton("Cali");
		btnCali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.add(panelDeCali);
				panel1.revalidate();
				panel1.repaint();
				panelDeMedellin.setVisible(false);
				panelBogota_.setVisible(false);
				panelDeCali.setVisible(true);
				panelDeTotales.setVisible(false);
			}
		});
		btnCali.setFont(new Font("Zapfino", Font.BOLD | Font.ITALIC, 13));
		panelBotones.add(btnCali);
		
		JButton btnTotales = new JButton("Totales");
		btnTotales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.add(panelDeTotales);
				panel1.revalidate();
				panel1.repaint();
				panelDeMedellin.setVisible(false);
				panelBogota_.setVisible(false);
				panelDeCali.setVisible(false);
				panelDeTotales.setVisible(true);
			}
		});
		btnTotales.setFont(new Font("Zapfino", Font.BOLD | Font.ITALIC, 13));
		panelBotones.add(btnTotales);
		
		
	}
}
