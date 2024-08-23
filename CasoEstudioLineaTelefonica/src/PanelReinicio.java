

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelReinicio extends JPanel {
	
	private PrincipalLineas linea;

	/**
	 * Create the panel.
	 */
	public PanelReinicio(PrincipalLineas linea) {
		this();
		this.linea = linea;
	}
	public PanelReinicio() {
		setBackground(new Color(240, 240, 240));
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Reiniciar", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setLayout(new GridLayout(2, 0, 0, 0));
		
		JButton btnAlternativas = new JButton("Alternativas");
		btnAlternativas.setBackground(new Color(255, 255, 0));
		btnAlternativas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linea.reiniciarAlternativas();
			}
		});
		add(btnAlternativas);
		
		JButton btnNoAlternativas = new JButton("No Alternativas");
		btnNoAlternativas.setBackground(new Color(255, 255, 0));
		btnNoAlternativas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				linea.reiniciarNoAlternativas();
			}
		});
		add(btnNoAlternativas);

	}

}

