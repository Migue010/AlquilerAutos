import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class PanelLineaCelular extends JPanel {
	private JTextField fieldTotal;
	private JTextField fieldLlamadas;
	private JTextField fieldLocal;
	private JTextField fieldSaldo;
	private JTextField fieldCelular;
	private JTextField fieldMinutosLlamadas;
	private JTextField fieldPromedio;
	private JCheckBox chckLocal;
	private JCheckBox chckCelular;
	
	private PrincipalLineas linea;

	/**
	 * Create the panel.
	 */
	public PanelLineaCelular(PrincipalLineas linea) {
		this();
		this.linea = linea;
		
	}
	public PanelLineaCelular() {
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Linea Celular", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(6, 3, 0, 0));
		
		chckLocal = new JCheckBox("Local");
		add(chckLocal);
		
		JLabel lblNewLabel = new JLabel("Valor Total Linea");
		lblNewLabel.setBackground(new Color(255, 255, 204));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
		
		fieldTotal = new JTextField();
		fieldTotal.setEditable(false);
		add(fieldTotal);
		fieldTotal.setColumns(10);
		
		chckCelular = new JCheckBox("Celular");
		add(chckCelular);
		
		JLabel lblNewLabel_1 = new JLabel("Numero Llamadas");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1);
		
		fieldLlamadas = new JTextField();
		fieldLlamadas.setEditable(false);
		add(fieldLlamadas);
		fieldLlamadas.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SALDO LOCAL");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Minutos Locales");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_3);
		
		fieldLocal = new JTextField();
		fieldLocal.setEditable(false);
		add(fieldLocal);
		fieldLocal.setColumns(10);
		
		fieldSaldo = new JTextField();
		fieldSaldo.setEditable(false);
		add(fieldSaldo);
		fieldSaldo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Minutos Celular");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_4);
		
		fieldCelular = new JTextField();
		fieldCelular.setEditable(false);
		add(fieldCelular);
		fieldCelular.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Costo Promedio");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Minutos Llamadas");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_6);
		
		fieldMinutosLlamadas = new JTextField();
		add(fieldMinutosLlamadas);
		fieldMinutosLlamadas.setColumns(10);
		
		fieldPromedio = new JTextField();
		fieldPromedio.setEditable(false);
		add(fieldPromedio);
		fieldPromedio.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("");
		add(lblNewLabel_7);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(new Color(138, 43, 226));
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tipo = tipoLlamadaCelular();
				int minutos = getMinutosLineaCelular();
				linea.tomarLlamadasLineaCelular(minutos, tipo);
				linea.tomarDatosCelular();
			}
		});
		add(btnAgregar);

	}
	
	
	
    public int tipoLlamadaCelular() {
		
		if (chckLocal.isSelected() && !chckCelular.isSelected()) {
			return 1;
		}
		else if (!chckLocal.isSelected() && chckCelular.isSelected()) {
            return 2;
		}
		else return 0;
        }
	
	public int getMinutosLineaCelular() {
		String MinutosUsuario = fieldMinutosLlamadas.getText();
		int Minutos = Integer.parseInt(MinutosUsuario);
		return Minutos;
	}
	
	public void mostrarLineaCelular(double valorTotal, int llamadas, int minutosLocales, int minutosCelular, double saldoLocal, double costoPromedio) {
		fieldTotal.setText(Double.toString(valorTotal));
		fieldLlamadas.setText(Integer.toString(llamadas));
		fieldLocal.setText(Integer.toString(minutosLocales));
		fieldCelular.setText(Integer.toString(minutosCelular));
		fieldSaldo.setText(Double.toString(saldoLocal));
		fieldPromedio.setText(Double.toString(costoPromedio));
		
	}

	public JCheckBox getChckLocal() {
		return chckLocal;
	}
	public JCheckBox getChckCelular() {
		return chckCelular;
	}
}
