import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;



public class PrincipalLineas extends JFrame {

	private JPanel contentPane;
	private PanelLineaTelefonica1 LineaTelefonica1;
	private PanelLineaTelefonica2 LineaTelefonica2;
	private PanelLineaTelefonica3 LineaTelefonica3;
	private PanelLineaCelular LineaCelular;
	private PanelNoAlternativas NoAlternativas;
	private PanelReinicio Reinicio;
	private Empresa empresa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalLineas frame = new PrincipalLineas();
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
	public PrincipalLineas() {
		setResizable(false);
		setFont(new Font("Zapfino", Font.PLAIN, 12));
		setTitle("EMPRESA TELEFONICA MAB");
		empresa = new Empresa();
		empresa.darLinea1();
		empresa.darLinea2();
		empresa.darLinea3();
		empresa.darLineaCelular1();
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LineaTelefonica1 = new PanelLineaTelefonica1(this);
		LineaTelefonica1.setBackground(new Color(0, 0, 0));
		LineaTelefonica1.setBounds(0, 0, 377, 208);
		contentPane.add(LineaTelefonica1);
		tomarDatosLinea1();
		
		LineaTelefonica2 = new PanelLineaTelefonica2(this);
		LineaTelefonica2.setBounds(0, 219, 377, 208);
		contentPane.add(LineaTelefonica2);
		tomarDatosLinea2();
		
		LineaTelefonica3 = new PanelLineaTelefonica3(this);
		LineaTelefonica3.setBackground(new Color(0, 0, 0));
		LineaTelefonica3.setBounds(0, 444, 377, 208);
		contentPane.add(LineaTelefonica3);
		tomarDatosLinea3();
		
		LineaCelular = new PanelLineaCelular(this);
		LineaCelular.setBackground(new Color(255, 204, 255));
		LineaCelular.setBounds(389, 239, 511, 227);
		contentPane.add(LineaCelular);
		tomarDatosCelular();
		
		NoAlternativas = new PanelNoAlternativas();
		NoAlternativas.setBackground(Color.CYAN);
		NoAlternativas.setBounds(391, 0, 503, 227);
		contentPane.add(NoAlternativas);
		tomarDatosNoAlternativas();
		
		Reinicio = new PanelReinicio(this);
		Reinicio.setBackground(new Color(173, 255, 47));
		Reinicio.setBounds(389, 478, 511, 167);
		contentPane.add(Reinicio);
	}
	public void tomarLlamadasLineasTelefonicas(int tipo, int minutos, int linea) {
		if (linea == 1) {
			if (tipo == 1) {
				empresa.darLinea1().agregarLlamadaLocal(minutos);
			}
			else if (tipo == 2) {
				empresa.darLinea1().agregarLlamadaLargaDistancia(minutos);
			}
			else if (tipo == 3) {
				empresa.darLinea1().agregarLlamadaCelular(minutos);
			}
		}
		else if (linea == 2) {
			if (tipo == 1) {
				empresa.darLinea2().agregarLlamadaLocal(minutos);
			}
			else if (tipo == 2) {
				empresa.darLinea2().agregarLlamadaLargaDistancia(minutos);
			}
			else if (tipo == 3) {
				empresa.darLinea2().agregarLlamadaCelular(minutos);
			}
		}
		else if (linea == 3) {
			if (tipo == 1) {
				empresa.darLinea3().agregarLlamadaLocal(minutos);
			}
			else if (tipo == 2) {
				empresa.darLinea3().agregarLlamadaLargaDistancia(minutos);
			}
			else if (tipo == 3) {
				empresa.darLinea3().agregarLlamadaCelular(minutos);
			}
			tomarDatosNoAlternativas();
		}
	}
		public void tomarLlamadasLineaCelular(int minutos, int tipoL) {
			if(minutos > 0) {
				 if (tipoL == 1) {
					 if (empresa.agregarLlamadaLocalLineaCelular1(minutos)== true) {
				         empresa.darLineaCelular1().agregarLlamadaLocal(minutos);;
				         
					 }
					 else System.out.println();
				 }
				 else if (tipoL == 2) {
					 empresa.agregarLlamadaCelularLineaCelular1(minutos);
					
				}
			else System.out.println(); 	
		}
		else System.out.println();
	}

	
	public void tomarDatosLinea1() {
		double valorLinea = empresa.darLinea1().darCostoLlamadas();
		int llamadas = empresa.darLinea1().darNumeroLlamadas();
		int minutos = empresa.darLinea1().darNumeroMinutos();
		
		LineaTelefonica1.mostrarLinea1(valorLinea, llamadas,minutos);
	}
	public void tomarDatosLinea2() {
		double valorLinea = empresa.darLinea2().darCostoLlamadas();
		int llamadas = empresa.darLinea2().darNumeroLlamadas();
		int minutos = empresa.darLinea2().darNumeroMinutos();
		
		LineaTelefonica2.mostrarLinea2(valorLinea, llamadas, minutos);
	}
	public void tomarDatosLinea3() {
		double valorLinea = empresa.darLinea3().darCostoLlamadas();
		int llamadas = empresa.darLinea3().darNumeroLlamadas();
		int minutos = empresa.darLinea3().darNumeroMinutos();
		
		LineaTelefonica3.mostrarLinea3(valorLinea, llamadas, minutos);
	}
	public void tomarDatosCelular() {
		double valorLinea = empresa.darLineaCelular1().darCostoLlamadas();
		int llamadas = empresa.darLineaCelular1().darNumeroLlamadas();
		int minutosLocales = empresa.darLineaCelular1().darNumeroMinutosLocal();
		int minutosCelular = empresa.darLineaCelular1().darNumeroMinutosCelular();
		double saldoLocal = empresa.darLineaCelular1().darSaldoDisponibleLocal();
		double costoPromedio = empresa.darCostoPromedioMinutoDesdeLineasAlternativas();
		
		LineaCelular.mostrarLineaCelular(valorLinea, llamadas, minutosLocales, minutosCelular, saldoLocal, costoPromedio);
	}
	public void tomarDatosNoAlternativas() {
		double valorTotal = empresa.darTotalCostoLlamadaDesdeLineasNoAlternativas();
		int totalLlamadas = empresa.darTotalNumeroLlamadasDesdeLineasNoAlternativas();
		int totalMinutos = empresa.darTotalMinutosDesdeLineasNoAlternativas();
		double costoPromedioMinutos = empresa.darCostoPromedioMinutoDesdeLineasNoAlternativas();
		
		NoAlternativas.mostrar(valorTotal, totalLlamadas, totalMinutos, costoPromedioMinutos);
	}
	public void reiniciarAlternativas() {
		empresa.reiniciarLineasAlternativas();
		tomarDatosCelular();
	}
	public void reiniciarNoAlternativas() {
		empresa.reiniciarLineasNoAlternativas();
		tomarDatosLinea1();
		tomarDatosLinea2();
		tomarDatosLinea3();
		tomarDatosNoAlternativas();
	}
	public PanelLineaTelefonica1 getPanelLinea1_1() {
		return LineaTelefonica1;
	}
	public PanelLineaTelefonica2 getPanelLinea2() {
		return LineaTelefonica2;
	}
	public PanelLineaTelefonica3 getPanelLinea3() {
		return LineaTelefonica3;
	}
	public PanelLineaCelular getPanelLineaCelular() {
		return LineaCelular;
	}
	public PanelNoAlternativas getPanelNoAlternativas() {
		return NoAlternativas;
	}
	public PanelReinicio getPanelReinicio() {
		return Reinicio;
	}
}
