import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.SystemColor;

public class panelDeinformacion extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField fieldSaldo;
	private JTextField fieldTransacciones;
	private JTextField fieldRetirado;
	private JTextField fieldConsignado;
	private JTextField fieldUltimatransaccion;
	
	
	

	
	/**
	 * Create the panel.
	 */
	public panelDeinformacion() {
		setBackground(SystemColor.menu);
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("SALDO");
		lblNewLabel.setForeground(SystemColor.activeCaptionText);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
		
		fieldSaldo = new JTextField();
		fieldSaldo.setHorizontalAlignment(SwingConstants.CENTER);
		fieldSaldo.setEditable(false);
		fieldSaldo.setForeground(SystemColor.activeCaptionText);
		add(fieldSaldo);
		fieldSaldo.setColumns(10);
		
		JLabel lblTransacciones = new JLabel("TRANSACCIONES");
		lblTransacciones.setForeground(SystemColor.activeCaptionText);
		lblTransacciones.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTransacciones);
		
		fieldTransacciones = new JTextField();
		fieldTransacciones.setForeground(SystemColor.activeCaptionText);
		fieldTransacciones.setEditable(false);
		fieldTransacciones.setHorizontalAlignment(SwingConstants.CENTER);
		add(fieldTransacciones);
		fieldTransacciones.setColumns(10);
		
		JLabel lblValorRetirado = new JLabel("VALOR RETIRADO");
		lblValorRetirado.setForeground(SystemColor.activeCaptionText);
		lblValorRetirado.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblValorRetirado);
		
		fieldRetirado = new JTextField();
		fieldRetirado.setHorizontalAlignment(SwingConstants.CENTER);
		fieldRetirado.setForeground(SystemColor.activeCaptionText);
		fieldRetirado.setEditable(false);
		fieldRetirado.setColumns(10);
		add(fieldRetirado);
		
		JLabel lblValor = new JLabel("VALOR CONSIGNADO");
		lblValor.setForeground(SystemColor.activeCaptionText);
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblValor);
		
		fieldConsignado = new JTextField();
		fieldConsignado.setHorizontalAlignment(SwingConstants.CENTER);
		fieldConsignado.setForeground(SystemColor.activeCaptionText);
		fieldConsignado.setEditable(false);
		fieldConsignado.setColumns(10);
		add(fieldConsignado);
		
		JLabel lblValorUltimaTransaccion = new JLabel("VALOR ULTIMA TRANSACCION");
		lblValorUltimaTransaccion.setForeground(SystemColor.activeCaptionText);
		lblValorUltimaTransaccion.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblValorUltimaTransaccion);
		
		fieldUltimatransaccion = new JTextField();
		fieldUltimatransaccion.setHorizontalAlignment(SwingConstants.CENTER);
		fieldUltimatransaccion.setForeground(SystemColor.activeCaptionText);
		fieldUltimatransaccion.setEditable(false);
		fieldUltimatransaccion.setColumns(10);
		add(fieldUltimatransaccion);

	}



	public void mostrarDatos(double saldoi, int numtransacciones , double retirar, double consignar,double utimaTransaccion) {
		fieldSaldo.setText(Double.toString(saldoi));
		fieldTransacciones.setText(Integer.toString(numtransacciones));
		fieldRetirado.setText(Double.toString(retirar));
		fieldConsignado.setText(Double.toString(consignar));
		fieldUltimatransaccion.setText(Double.toString(utimaTransaccion));
	}

	
	
		
}
