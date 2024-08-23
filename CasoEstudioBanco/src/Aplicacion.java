import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Aplicacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Banco banco = new Banco();
	private panelDeinformacion panelDeinformacion_= new panelDeinformacion();
	private panelTransaccion panelTransaccion_= new panelTransaccion(banco);
	
	

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
		setTitle("BANCO");
		setResizable(false);
		
		JPanel panelDeinformacion = new JPanel();
		getContentPane().add(panelDeinformacion);
		
		
		JPanel panelTransaccion = new JPanel();
		getContentPane().add(panelTransaccion);
		
		
 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(205, 6, 420, 211);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		
		JButton btnInformacion = new JButton("INFORMACION");
		btnInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.add(panelDeinformacion_);
				panel.revalidate();
				panel.repaint();
				panelTransaccion_.setVisible(false);
				panelDeinformacion_.setVisible(true);
				mostrarDatos();
				
				
				
			}
		});
		btnInformacion.setBounds(5, 6, 194, 52);
		contentPane.add(btnInformacion);
		
		JButton btnTransaccion = new JButton("TRANSACCION");
		btnTransaccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.add(panelTransaccion_);	
				panel.revalidate();
				panel.repaint();
				panelDeinformacion_.setVisible(false);
				panelTransaccion_.setVisible(true);
				mostrarDatos();
			}
		});
		btnTransaccion.setBounds(5, 87, 194, 52);
		contentPane.add(btnTransaccion);
		
		JButton btnNewButton_2 = new JButton("CERRAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDeinformacion_.setVisible(false);
				panelTransaccion_.setVisible(false);
				
			}
		});
		btnNewButton_2.setBounds(5, 169, 194, 52);
		contentPane.add(btnNewButton_2);
		
		
		
		
	

	}

	public  void mostrarDatos() {
		double saldoi = banco.capturarSaldo();
		int numtransacciones=banco.capturarNumeroTransacciones();
		double retirar= banco.capturarTotalRetirado();
		double consignado= banco.capturarTotalConsignado();
		double ultimaTransaccion =panelTransaccion_.ultima;
		panelDeinformacion_.mostrarDatos(saldoi,numtransacciones,retirar,consignado,ultimaTransaccion);
		panelTransaccion_.mostrarDatos(saldoi);
	}
	
	

}