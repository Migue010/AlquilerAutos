import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class panelTotales extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField fieldServicios;
	public JTextField fieldTotal;
	private JTextField fieldCorte;
	private JTextField fieldPeinados;
	private JTextField fieldCepillado;
	private JTextField fieldTenido;
	private panelPeluqueriaBogota panelBogota_;
	private panelMedellin panelDeMedellin ;
	private  panelCali panelDeCali;
	int serviciosTotales;
	int corte;
	int teñido;
	int cepillado;
	int peinado;
	double valorTotal;

	

	/**
	 * Create the panel.
	 */
	public panelTotales( panelPeluqueriaBogota panelBogota_ , panelMedellin panelDeMedellin ,  panelCali panelDeCali) {
		this.setPanelBogota_(panelBogota_);
		this.setPanelDeMedellin(panelDeMedellin);
		this.setPanelDeCali(panelDeCali);
		setLayout(null);
		
		
		JButton btnNewButton_1 = new JButton("Total Bogota ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fieldTotal.setText(String.valueOf(panelBogota_.peluqueria.capturarValorTotal()));
				fieldServicios.setText(String.valueOf(panelBogota_.peluqueria.capturarCantidadServicios()));
				fieldCorte.setText(Integer.toString(panelBogota_.empresa.serviciocorte()));
				fieldPeinados.setText(Integer.toString(panelBogota_.empresa.setServicioPeinado()));
				fieldCepillado.setText(Integer.toString(panelBogota_.empresa.setServicioCepillado()));
				fieldTenido.setText(Integer.toString(panelBogota_.empresa.setServicioTintura()));
				
			}
		});
		btnNewButton_1.setBounds(22, 5, 117, 29);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Total Medellin");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fieldTotal.setText(String.valueOf(panelDeMedellin.peluqueria.capturarValorTotal()));
				fieldServicios.setText(String.valueOf(panelDeMedellin.peluqueria.capturarCantidadServicios()));
				fieldCorte.setText(Integer.toString(panelDeMedellin.empresa.serviciocorte()));
				fieldPeinados.setText(Integer.toString(panelDeMedellin.empresa.setServicioPeinado()));
				fieldCepillado.setText(Integer.toString(panelDeMedellin.empresa.setServicioCepillado()));
				fieldTenido.setText(Integer.toString(panelDeMedellin.empresa.setServicioTintura()));
				
				
			}
		});
		btnNewButton_2.setBounds(144, 5, 117, 29);
		add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Total Cali ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fieldTotal.setText(String.valueOf(panelDeCali.peluqueria.capturarValorTotal()));
				fieldServicios.setText(String.valueOf(panelDeCali.peluqueria.capturarCantidadServicios()));
				fieldCorte.setText(Integer.toString(panelDeCali.empresa.serviciocorte()));
				fieldPeinados.setText(Integer.toString(panelDeCali.empresa.setServicioPeinado()));
				fieldCepillado.setText(Integer.toString(panelDeCali.empresa.setServicioCepillado()));
				fieldTenido.setText(Integer.toString(panelDeCali.empresa.setServicioTintura()));
				
			}
		});
		btnNewButton.setBounds(266, 5, 117, 29);
		add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Total Empresa ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalServicio();
				totalEmpresa();
				totalcorte();
				totalTeñido();
				totalCepillado();
				totalPeinado();
				Mostrardatos();
			}
		});
		btnNewButton_3.setBounds(388, 5, 134, 29);
		add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("CANTIDAD SERVICIOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 46, 156, 54);
		add(lblNewLabel);
		
		JLabel lblCantidadCortes = new JLabel("CANTIDAD CORTES");
		lblCantidadCortes.setBounds(375, 46, 125, 54);
		add(lblCantidadCortes);
		
		JLabel lblValorTotal = new JLabel("VALOR TOTAL");
		lblValorTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorTotal.setBounds(192, 46, 125, 54);
		add(lblValorTotal);
		
		JLabel lblNewLabel_2_1 = new JLabel("CANTIDAD TEÑIDOS");
		lblNewLabel_2_1.setBounds(14, 200, 148, 54);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("CANTIDAD CEPILLADO");
		lblNewLabel_2_1_1.setBounds(182, 200, 156, 54);
		add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("CANTIDAD PEINADOS");
		lblNewLabel_2_1_2.setBounds(375, 200, 147, 54);
		add(lblNewLabel_2_1_2);
		
		fieldServicios = new JTextField();
		fieldServicios.setHorizontalAlignment(SwingConstants.CENTER);
		fieldServicios.setEditable(false);
		fieldServicios.setBounds(16, 93, 117, 65);
		add(fieldServicios);
		fieldServicios.setColumns(10);
		
		fieldTotal = new JTextField();
		fieldTotal.setHorizontalAlignment(SwingConstants.CENTER);
		fieldTotal.setEditable(false);
		fieldTotal.setColumns(10);
		fieldTotal.setBounds(192, 93, 134, 65);
		add(fieldTotal);
		
		fieldCorte = new JTextField();
		fieldCorte.setHorizontalAlignment(SwingConstants.CENTER);
		fieldCorte.setEditable(false);
		fieldCorte.setColumns(10);
		fieldCorte.setBounds(398, 93, 102, 65);
		add(fieldCorte);
		
		fieldPeinados = new JTextField();
		fieldPeinados.setHorizontalAlignment(SwingConstants.CENTER);
		fieldPeinados.setEditable(false);
		fieldPeinados.setColumns(10);
		fieldPeinados.setBounds(398, 250, 102, 65);
		add(fieldPeinados);
		
		fieldCepillado = new JTextField();
		fieldCepillado.setHorizontalAlignment(SwingConstants.CENTER);
		fieldCepillado.setEditable(false);
		fieldCepillado.setColumns(10);
		fieldCepillado.setBounds(212, 250, 102, 65);
		add(fieldCepillado);
		
		fieldTenido = new JTextField();
		fieldTenido.setHorizontalAlignment(SwingConstants.CENTER);
		fieldTenido.setEditable(false);
		fieldTenido.setColumns(10);
		fieldTenido.setBounds(24, 250, 102, 65);
		add(fieldTenido);

	}

	

	public panelPeluqueriaBogota getPanelBogota_() {
		return panelBogota_;
	}

	public void setPanelBogota_(panelPeluqueriaBogota panelBogota_) {
		this.panelBogota_ = panelBogota_;
	}

	public panelMedellin getPanelDeMedellin() {
		return panelDeMedellin;
	}

	public void setPanelDeMedellin(panelMedellin panelDeMedellin) {
		this.panelDeMedellin = panelDeMedellin;
	}



	public panelCali getPanelDeCali() {
		return panelDeCali;
	}



	public void setPanelDeCali(panelCali panelDeCali) {
		this.panelDeCali = panelDeCali;
	}


	public int totalServicio(){
		return serviciosTotales= panelBogota_.peluqueria.capturarCantidadServicios() + panelDeMedellin.peluqueria.capturarCantidadServicios() + panelDeCali.peluqueria.capturarCantidadServicios();
		
	}
	
	public double totalEmpresa(){
		return valorTotal= panelBogota_.peluqueria.capturarValorTotal() + panelDeMedellin.peluqueria.capturarValorTotal() + panelDeCali.peluqueria.capturarValorTotal();
		
	}
	
	public int totalcorte(){
		return corte  = panelBogota_.empresa.serviciocorte() + panelDeMedellin.empresa.serviciocorte() + panelDeCali.empresa.serviciocorte();
		
	}
	
	public int totalTeñido(){
		return teñido = panelBogota_.empresa.setServicioTintura() + panelDeMedellin.empresa.setServicioTintura() + panelDeCali.empresa.setServicioTintura();
	}
	
	public int totalCepillado(){
		return cepillado = panelBogota_.empresa.setServicioCepillado() + panelDeMedellin.empresa.setServicioCepillado() + panelDeCali.empresa.setServicioCepillado();
	}
	
	public int totalPeinado(){
		return peinado = panelBogota_.empresa.setServicioPeinado() + panelDeMedellin.empresa.setServicioPeinado() + panelDeCali.empresa.setServicioPeinado();
	}
	
	public void Mostrardatos(){
		fieldServicios.setText(Integer.toString(serviciosTotales));
		fieldTotal.setText(Double.toString(valorTotal));
		fieldCorte.setText(Integer.toString(corte));
		fieldTenido.setText(Integer.toString(teñido));
		fieldCepillado.setText(Integer.toString(cepillado));
		fieldPeinados.setText(Integer.toString(peinado));
	}



	
}
