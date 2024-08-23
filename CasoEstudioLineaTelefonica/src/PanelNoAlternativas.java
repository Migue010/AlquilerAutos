

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class PanelNoAlternativas extends JPanel {
	private JTextField textValorTotal;
	private JTextField textTotalLlamadas;
	private JTextField textTotalMinutos;
	private JTextField textCostoPromedioMinutos;

	/**
	 * Create the panel.
	 */
	public PanelNoAlternativas() {
		setBackground(new Color(240, 240, 240));
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Lineas No Alternativas", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("VALOR TOTAL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
		
		textValorTotal = new JTextField();
		textValorTotal.setEditable(false);
		add(textValorTotal);
		textValorTotal.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL LLAMADAS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1);
		
		textTotalLlamadas = new JTextField();
		textTotalLlamadas.setEditable(false);
		add(textTotalLlamadas);
		textTotalLlamadas.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TOTAL MINUTOS ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_2);
		
		textTotalMinutos = new JTextField();
		textTotalMinutos.setEditable(false);
		add(textTotalMinutos);
		textTotalMinutos.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("COSTO PROMEDIO MINUTO");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_3);
		
		textCostoPromedioMinutos = new JTextField();
		textCostoPromedioMinutos.setEditable(false);
		add(textCostoPromedioMinutos);
		textCostoPromedioMinutos.setColumns(10);

	}
	public void mostrar(double valorTotal, int totalLlamadas, int totalMinutos, double promedioCostoMinutos) {
		textValorTotal.setText(Double.toString(valorTotal));
		textTotalLlamadas.setText(Integer.toString(totalLlamadas));
		textTotalMinutos.setText(Integer.toString(totalMinutos));
		textCostoPromedioMinutos.setText(Double.toString(promedioCostoMinutos));
	}

}

