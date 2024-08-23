import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisponibilidadAutoPanel extends JPanel {
    private JTextField placaField;
    private JButton verificarButton;
    private JLabel resultadoLabel;
    private SuperAutos superAutos;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;

    public DisponibilidadAutoPanel(SuperAutos superAutos) {
        this.superAutos = superAutos;
        setLayout(null);

        JLabel label = new JLabel("Placa del auto:");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(SystemColor.menu);
        label.setBounds(6, 94, 204, 55);
        add(label);
        placaField = new JTextField();
        placaField.setHorizontalAlignment(SwingConstants.CENTER);
        placaField.setBounds(6, 161, 199, 62);
        add(placaField);

        verificarButton = new JButton("Verificar");
        verificarButton.setBounds(6, 239, 199, 55);
        add(verificarButton);

        resultadoLabel = new JLabel("Disponibilidad: ");
        resultadoLabel.setForeground(SystemColor.menu);
        resultadoLabel.setBounds(225, 232, 225, 62);
        add(resultadoLabel);
        
        lblNewLabel_1 = new JLabel("CONSULTA DISPONIBILIDAD PARA TU AUTO ");
        lblNewLabel_1.setForeground(SystemColor.menu);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(172, 6, 278, 45);
        add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setBackground(SystemColor.menu);
        lblNewLabel_2.setIcon(new ImageIcon("/Users/admin/Documents/brand-tile-chevy-150x150.png"));
        lblNewLabel_2.setBounds(6, 20, 154, 62);
        add(lblNewLabel_2);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("/Users/admin/Documents/211084232-coche-negro-genérico-sin-marca-aislado-en-una-ilustración-3d-de-fondo-oscuro.jpg"));
        lblNewLabel.setBounds(0, 0, 450, 300);
        add(lblNewLabel);

        verificarButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String placa = placaField.getText();
                Auto auto = superAutos.buscarAutoPorPlaca(placa);

                if (auto != null) {
                    resultadoLabel.setText("Disponibilidad: " + (auto.isAlquilado() ? "No disponible" : "Disponible"));
                } else {
                    resultadoLabel.setText("Auto no encontrado");
                }
            }
        });
    }
}
