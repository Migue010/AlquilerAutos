import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelLineaTelefonica2 extends JPanel {
	private JTextField fieldTotal;
	private JTextField fieldLlamadas;
	private JTextField fieldMinutos;
	private JTextField fieldMinutosLlamada;
	private JCheckBox chckLocal;
	private JCheckBox chckLargaDistancia;
	private JCheckBox chckCelular;
	
	private PrincipalLineas linea;

	/**
	 * Create the panel.
	 */
	public PanelLineaTelefonica2(PrincipalLineas linea) {
		this();
		this.linea = linea;
	}
	public PanelLineaTelefonica2() {
		setForeground(Color.YELLOW);
		setBackground(Color.BLACK);
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Linea 2", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(64, 224, 208)));
		setLayout(new GridLayout(6, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel(" ");
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor Linea Total");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1);
		
		fieldTotal = new JTextField();
		fieldTotal.setEditable(false);
		add(fieldTotal);
		fieldTotal.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Numero Llamadas");
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_3);
		
		fieldLlamadas = new JTextField();
		fieldLlamadas.setEditable(false);
		add(fieldLlamadas);
		fieldLlamadas.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Numero Minutos");
		lblNewLabel_5.setForeground(Color.YELLOW);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_5);
		
		fieldMinutos = new JTextField();
		fieldMinutos.setEditable(false);
		add(fieldMinutos);
		fieldMinutos.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Minutos Llamadas");
		lblNewLabel_6.setForeground(Color.YELLOW);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_6);
		
		fieldMinutosLlamada = new JTextField();
		add(fieldMinutosLlamada);
		fieldMinutosLlamada.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("");
		add(lblNewLabel_7);
		
		chckLocal = new JCheckBox("Local");
		chckLocal.setForeground(Color.YELLOW);
		add(chckLocal);
		
		chckLargaDistancia = new JCheckBox("Larga Distancia");
		chckLargaDistancia.setForeground(Color.YELLOW);
		add(chckLargaDistancia);
		
		chckCelular = new JCheckBox("Celular");
		chckCelular.setForeground(Color.YELLOW);
		add(chckCelular);
		
		JLabel lblNewLabel_8 = new JLabel("");
		add(lblNewLabel_8);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(new Color(0, 100, 0));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar1();
				verificar2();
				comprobarUsuario();
				int tipo = tipoLlamadaTelefonica();
				int minutos = tomarMinutosLinea2();
				linea.tomarLlamadasLineasTelefonicas(tipo, minutos, 2);
				linea.tomarDatosLinea2();
			}
		});
		add(btnAgregar);
		
		JLabel lblNewLabel_9 = new JLabel("");
		add(lblNewLabel_9);

	}
	
	public void comprobarUsuario(){
		if(fieldMinutosLlamada.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"Debes llenar el campo solicitado");
		}
	}
	
	
	public void verificar1(){
		
		if (!chckLocal.isSelected() && !chckLargaDistancia.isSelected() && !chckCelular.isSelected()) {
			
			JOptionPane.showMessageDialog(null,"Seleccione un modo de llamada");

			
		}
		
	}

	public void verificar2(){
		if(chckLocal.isSelected() && chckLargaDistancia.isSelected() || chckLargaDistancia.isSelected() && chckCelular.isSelected()|| chckLocal.isSelected() && chckCelular.isSelected() ){
			JOptionPane.showMessageDialog(null,"Seleccione solo un modo de llamada");
		}
		
	}
	
public int tipoLlamadaTelefonica() {
		
		if (chckLocal.isSelected() && !chckLargaDistancia.isSelected() && !chckCelular.isSelected()) {
			return 1;
		}
		else if (!chckLocal.isSelected() && chckLargaDistancia.isSelected() && !chckCelular.isSelected()) {
            return 2;
		}
		else if (!chckLocal.isSelected() && !chckLargaDistancia.isSelected() && chckCelular.isSelected()) {
			return 3;
		}
		else return 0;
	}
	public int tomarMinutosLinea2() {
		String MinutosUsuario = fieldMinutosLlamada.getText();
		int Minutos = Integer.parseInt(MinutosUsuario);
		return Minutos;
	}

	
	public void mostrarLinea2(double valorTotal, int llamadas, int minutos) {
		fieldTotal.setText(Double.toString(valorTotal));
		fieldLlamadas.setText(Integer.toString(llamadas));
		fieldMinutos.setText(Integer.toString(minutos));
	}

	public JCheckBox getChckLocal() {
		return chckLocal;
	}
	public JCheckBox getChckLargaDistancia() {
		return chckLargaDistancia;
	}
	public JCheckBox getChckCelular() {
		return chckCelular;
	}
}