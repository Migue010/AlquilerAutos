import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class panelPeluqueriaBogota extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField fieldServicios;
	private JTextField fieldCobrar;
	public JTextField fieldTotal;
	private JCheckBox chckTintura;
	private JCheckBox chckCorte;
	private JCheckBox chckCepillado;
	private JCheckBox chckPeinado;
	private JRadioButton rdbtnEfectivo;
	private JRadioButton rdbtnTarjeta;
	public int valorT;
	public double valorTotal;
	int descu;
	public Peluqueria peluqueria;
	public Empresa empresa;
	

	/**
	 * Create the panel.
	 */
	public panelPeluqueriaBogota() {
		
		peluqueria= new Peluqueria();
		empresa = new Empresa();
		setBackground(Color.BLACK);
		setLayout(new GridLayout(5, 5, 0, 0));
		
		chckTintura = new JCheckBox("TINTURA");
		chckTintura.setForeground(Color.WHITE);
		chckTintura.setBackground(Color.DARK_GRAY);
		chckTintura.setHorizontalAlignment(SwingConstants.CENTER);
		add(chckTintura);
		
		JLabel lblNewLabel = new JLabel("FORMA DE PAGO ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VALOR A COBRAR ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1);
		
		chckCorte = new JCheckBox("CORTE");
		chckCorte.setForeground(Color.WHITE);
		chckCorte.setHorizontalAlignment(SwingConstants.CENTER);
		add(chckCorte);
		
		rdbtnEfectivo = new JRadioButton("EFECTIVO");
		rdbtnEfectivo.setSelected(true);
		rdbtnEfectivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(rdbtnEfectivo.isSelected()){
					rdbtnTarjeta.setSelected(false);
				}
					
				
			}
		});
		rdbtnEfectivo.setForeground(Color.WHITE);
		rdbtnEfectivo.setHorizontalAlignment(SwingConstants.CENTER);
		add(rdbtnEfectivo);
		
		fieldCobrar = new JTextField();
		fieldCobrar.setEditable(false);
		add(fieldCobrar);
		fieldCobrar.setColumns(10);
		
		chckCepillado = new JCheckBox("CEPILLADO");
		chckCepillado.setForeground(Color.WHITE);
		chckCepillado.setHorizontalAlignment(SwingConstants.CENTER);
		add(chckCepillado);
		
		rdbtnTarjeta = new JRadioButton("TARJETA");
		rdbtnTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnTarjeta.isSelected()){
					rdbtnEfectivo.setSelected(false);
				}
			}
			
		});
		rdbtnTarjeta.setForeground(Color.WHITE);
		rdbtnTarjeta.setHorizontalAlignment(SwingConstants.CENTER);
		add(rdbtnTarjeta);
		
		JButton btnCobrar = new JButton("COBRAR");
		btnCobrar.setForeground(Color.BLACK);
		btnCobrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				modoPago();
				sumarServicios();
				mostrarDatos();
				valorT=0;
				
				
			}
		});
		add(btnCobrar);
		
		chckPeinado = new JCheckBox("PEINADO");
		chckPeinado.setForeground(Color.WHITE);
		chckPeinado.setHorizontalAlignment(SwingConstants.CENTER);
		add(chckPeinado);
		
		JLabel lblNewLabel_3 = new JLabel("CANTIDAD DE SERVICIOS ");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("VALOR TOTAL ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_2);
		
		JButton btnReiniciar = new JButton("REINICIAR");
		btnReiniciar.setBackground(Color.BLACK);
		btnReiniciar.setForeground(Color.BLACK);
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaEmergente2();
				mostrarDatos();
				valorT=0;
				
				}
		});
		add(btnReiniciar);
		
		fieldServicios = new JTextField();
		fieldServicios.setEditable(false);
		add(fieldServicios);
		fieldServicios.setColumns(10);
		
		fieldTotal = new JTextField();
		fieldTotal.setEditable(false);
		add(fieldTotal);
		fieldTotal.setColumns(10);

	}
	
public void sumarServicios(){
		if(!chckTintura.isSelected() && !chckCorte.isSelected() && !chckCepillado.isSelected() && !chckPeinado.isSelected()){
		JOptionPane.showMessageDialog(null,"Seleccione al menos un servicio");
		
		
		}else{
			if(chckTintura.isSelected()){
				empresa.getServicioTintura();
				valorT=82000;
			}if(chckCorte.isSelected()){
				empresa.sumarServicioCorte();;
				valorT=valorT+20000;
			}if(chckCepillado.isSelected()){
				empresa.getServicioCepillado();
				valorT=valorT+34000;
			}if(chckPeinado.isSelected()){
				empresa.getServicioPeinado();
				valorT=valorT+12000;
			}if(rdbtnEfectivo.isSelected()){
				descu=valorT*10/100;
				valorT=valorT-descu;
			}peluqueria.agregarServicio(valorT);
			
			
		}
		
	
		
		
	}
	
	
public void modoPago(){
	if(!rdbtnEfectivo.isSelected() && !rdbtnTarjeta.isSelected()){
		JOptionPane.showMessageDialog(null,"Seleccione un metodo de Pago");
		peluqueria.reiniciar();
		valorT=0;
	}
}


public void mostrarDatos(){
	fieldCobrar.setText(Integer.toString(valorT));
	fieldTotal.setText(Double.toString(peluqueria.capturarValorTotal()));
	fieldServicios.setText(Integer.toString(peluqueria.capturarCantidadServicios()));
}


public void ventanaEmergente2(){
	int opcion=JOptionPane.showConfirmDialog(null, "¿Te gustaría continuar?", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
 
 if (opcion == JOptionPane.YES_OPTION) {
     peluqueria.reiniciar();
     empresa.reiniciar();
 } if(opcion == JOptionPane.YES_NO_OPTION) {
	 JOptionPane.showMessageDialog(null,"continue con su servicio");
	
	 peluqueria.capturarValorTotal();
 }

}
}





