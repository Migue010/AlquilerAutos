import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panelTransaccion extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField fieldSaldo;
	private JTextField fieldtransaccion;
	private JComboBox comboBox;
	private Aplicacion principal;
	public double ultima;
	
	
	public void  PanelDeTransaccion(Aplicacion principal){
		
		this.principal=principal;
	}
	

	/**
	 * Create the panel.
	 */
	public panelTransaccion(Banco banco) {
		setBackground(Color.BLACK);
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("SALDO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1);
		
		fieldSaldo = new JTextField();
		fieldSaldo.setEditable(false);
		add(fieldSaldo);
		fieldSaldo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("VALOR TRANSACCION");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_2);
		
		fieldtransaccion = new JTextField();
		add(fieldtransaccion);
		fieldtransaccion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("TIPO TRANSACCION");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
		
		comboBox = new JComboBox();
	
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Consignar ", "Retirar "}));
		add(comboBox);
		
		JButton btnNewButton = new JButton("ACEPTAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fieldSaldo.setText(String.valueOf(banco.capturarSaldo()));
				 verificar();
				if(comboBox.getSelectedIndex()==0){
					banco.realizarTransaccion(Double.parseDouble(fieldtransaccion.getText()), 0);
					ultima = Double.parseDouble(fieldtransaccion.getText());
					}if(comboBox.getSelectedIndex()==1){
						banco.realizarTransaccion(Double.parseDouble(fieldtransaccion.getText()), 1);							
						ultima = Double.parseDouble(fieldtransaccion.getText());
					}
					
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("ACEPTAR TRANSACCION");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_3);
		add(btnNewButton);

	}
	  
	public void mostrarDatos(double saldoi) {
		fieldSaldo.setText(Double.toString(saldoi));
		
	}
	
	public void verificar(){
		if(fieldtransaccion.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"Debes llenar el campo para hacer la Transaccion!!");
			
		}
	}


}
