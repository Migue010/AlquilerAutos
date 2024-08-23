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

public class PanelLineaTelefonica3 extends JPanel {
	private JTextField textValorTotal;
	private JTextField textNumeroLlamadas;
	private JTextField textNumeroMinutos;
	private JTextField textMinutosLlamada;
	private JCheckBox chckLocal;
	private JCheckBox chckLargaDistancia;
	private JCheckBox chckCelular;
	
	private PrincipalLineas linea;

	/**
	 * Create the panel.
	 */
	public PanelLineaTelefonica3(PrincipalLineas linea) {
		this();
		this.linea = linea;
		
	}
	public PanelLineaTelefonica3() {
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Linea 3", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 191, 255)));
		setLayout(new GridLayout(6, 3, 0, 0));
		
		JLabel lblNewLabel = new JLabel(" ");
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor Linea Total");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1);
		
		textValorTotal = new JTextField();
		textValorTotal.setEditable(false);
		add(textValorTotal);
		textValorTotal.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Numero Llamadas");
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_3);
		
		textNumeroLlamadas = new JTextField();
		textNumeroLlamadas.setEditable(false);
		add(textNumeroLlamadas);
		textNumeroLlamadas.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Numero Minutos");
		lblNewLabel_5.setForeground(Color.YELLOW);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_5);
		
		textNumeroMinutos = new JTextField();
		textNumeroMinutos.setEditable(false);
		add(textNumeroMinutos);
		textNumeroMinutos.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Minutos Llamadas");
		lblNewLabel_6.setForeground(Color.YELLOW);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_6);
		
		textMinutosLlamada = new JTextField();
		add(textMinutosLlamada);
		textMinutosLlamada.setColumns(10);
		
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
		btnAgregar.setBackground(new Color(0, 191, 255));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar1();
				verificar2();
				comprobarUsuario();
				int tipo = tipoLlamadaTelefonica();
				int minutos = tomarMinutosLinea3();
				linea.tomarLlamadasLineasTelefonicas(tipo, minutos, 3);
				linea.tomarDatosLinea3();
			}
		});
		add(btnAgregar);
		
		JLabel lblNewLabel_9 = new JLabel("");
		add(lblNewLabel_9);

	}
	
public void comprobarUsuario(){
		if(textMinutosLlamada.getText().isEmpty()){
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
	public int tomarMinutosLinea3() {
		String MinutosUsuario = textMinutosLlamada.getText();
		int Minutos = Integer.parseInt(MinutosUsuario);
		return Minutos;
	}

	
	public void mostrarLinea3(double valorTotal, int llamadas, int minutos) {
		textValorTotal.setText(Double.toString(valorTotal));
		textNumeroLlamadas.setText(Integer.toString(llamadas));
		textNumeroMinutos.setText(Integer.toString(minutos));
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
