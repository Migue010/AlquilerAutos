import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlquilerAutoPanel extends JPanel {
    private JTextField placaField, cedulaField, apellidoField, kilometrajeField;
    private JButton alquilarButton;
    private SuperAutos superAutos;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    public AlquilerAutoPanel(SuperAutos superAutos) {
        this.superAutos = superAutos;
       
        setLayout(null);

        JLabel label = new JLabel("Placa del auto:");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(SystemColor.menu);
        label.setBounds(0, 0, 225, 31);
        add(label);
        placaField = new JTextField();
        placaField.setHorizontalAlignment(SwingConstants.CENTER);
        placaField.setBounds(0, 28, 219, 49);
        add(placaField);

        JLabel label_1 = new JLabel("Cédula del cliente:");
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        label_1.setForeground(SystemColor.menu);
        label_1.setBounds(0, 78, 225, 25);
        add(label_1);
        cedulaField = new JTextField();
        cedulaField.setHorizontalAlignment(SwingConstants.CENTER);
        cedulaField.setBounds(6, 104, 213, 31);
        add(cedulaField);

        JLabel label_2 = new JLabel("Primer apellido del cliente:");
        label_2.setHorizontalAlignment(SwingConstants.CENTER);
        label_2.setForeground(SystemColor.menu);
        label_2.setBounds(0, 131, 225, 31);
        add(label_2);
        apellidoField = new JTextField();
        apellidoField.setHorizontalAlignment(SwingConstants.CENTER);
        apellidoField.setBounds(6, 163, 213, 49);
        add(apellidoField);

        JLabel label_3 = new JLabel("Kilometraje actual del vehículo:");
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        label_3.setForeground(SystemColor.menu);
        label_3.setBounds(0, 206, 225, 38);
        add(label_3);
        kilometrajeField = new JTextField();
        kilometrajeField.setBackground(SystemColor.menu);
        kilometrajeField.setHorizontalAlignment(SwingConstants.CENTER);
        kilometrajeField.setBounds(12, 239, 207, 49);
        add(kilometrajeField);

        alquilarButton = new JButton("Alquilar");
        alquilarButton.setBounds(225, 240, 225, 60);
        add(alquilarButton);
        
        lblNewLabel_1 = new JLabel("ALQUILA TU AUTO ");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(SystemColor.menu);
        lblNewLabel_1.setBounds(282, 15, 146, 38);
        add(lblNewLabel_1);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("/Users/admin/Documents/211084232-coche-negro-genérico-sin-marca-aislado-en-una-ilustración-3d-de-fondo-oscuro.jpg"));
        lblNewLabel.setBounds(0, 0, 450, 300);
        add(lblNewLabel);
        
        

        alquilarButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String placa = placaField.getText();
                String cedula = cedulaField.getText();
                String apellido = apellidoField.getText();
                int kilometraje = Integer.parseInt(kilometrajeField.getText());

                Auto auto = superAutos.buscarAutoPorPlaca(placa);
                
               
                
            if (auto != null && !auto.isAlquilado()) {
                    Cliente cliente = new Cliente(cedula, apellido);
                    superAutos.registrarAlquiler(auto, cliente, kilometraje);
                    JOptionPane.showMessageDialog(null, "Alquiler registrado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Auto no disponible para alquiler.");
                }
            }
        });
    }
}

