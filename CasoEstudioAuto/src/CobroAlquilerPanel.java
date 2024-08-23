import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CobroAlquilerPanel extends JPanel {
    private JTextField placaField, kilometrajeFinalField;
    private JCheckBox accidentadoCheckBox, multadoCheckBox;
    private JButton calcularButton;
    private JLabel resultadoLabel;
    private SuperAutos superAutos;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    

    public CobroAlquilerPanel(SuperAutos superAutos) {
        this.superAutos = superAutos;
        setLayout(null);

        JLabel label = new JLabel("Placa del auto:");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(SystemColor.menu);
        label.setBounds(0, 0, 213, 38);
        add(label);
        placaField = new JTextField();
        placaField.setBounds(10, 34, 196, 50);
        add(placaField);

        JLabel label_1 = new JLabel("Kilometraje final:");
        label_1.setHorizontalAlignment(SwingConstants.CENTER);
        label_1.setForeground(SystemColor.menu);
        label_1.setBackground(SystemColor.menu);
        label_1.setBounds(0, 83, 225, 50);
        add(label_1);
        kilometrajeFinalField = new JTextField();
        kilometrajeFinalField.setBounds(17, 133, 189, 50);
        add(kilometrajeFinalField);
        accidentadoCheckBox = new JCheckBox();
        accidentadoCheckBox.setText("Accidentado");
        accidentadoCheckBox.setBackground(SystemColor.menu);
        accidentadoCheckBox.setForeground(SystemColor.menu);
        accidentadoCheckBox.setBounds(0, 182, 118, 50);
        add(accidentadoCheckBox);
        multadoCheckBox = new JCheckBox();
        multadoCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        multadoCheckBox.setText("Multado");
        multadoCheckBox.setForeground(SystemColor.menu);
        multadoCheckBox.setBounds(113, 182, 103, 50);
        add(multadoCheckBox);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(0, 244, 225, 50);
        add(calcularButton);

        resultadoLabel = new JLabel("Total a pagar: $0");
        resultadoLabel.setForeground(SystemColor.menu);
        resultadoLabel.setBounds(225, 243, 225, 50);
        add(resultadoLabel);
        
        lblNewLabel_1 = new JLabel("PAGA TU ALQUILER");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(SystemColor.menu);
        lblNewLabel_1.setBounds(258, 11, 140, 43);
        add(lblNewLabel_1);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("/Users/admin/Documents/211084232-coche-negro-genérico-sin-marca-aislado-en-una-ilustración-3d-de-fondo-oscuro.jpg"));
        lblNewLabel.setBounds(0, 0, 450, 300);
        add(lblNewLabel);
        
        

        calcularButton.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                String placa = placaField.getText();
                int kilometrajeFinal = Integer.parseInt(kilometrajeFinalField.getText());
                boolean accidentado = accidentadoCheckBox.isSelected();
                boolean multado = multadoCheckBox.isSelected();
                Auto auto = superAutos.buscarAutoPorPlaca(placa);
                
                if (auto != null) {
                    for (Alquiler alquiler : superAutos.getAlquileres()) {
                        if (alquiler.getAuto().equals(auto) && auto.isAlquilado()) {
                            alquiler.setAccidentado(accidentado);
                            alquiler.setMultado(multado);
                            int costo = superAutos.calcularCosto(alquiler, kilometrajeFinal);
                            resultadoLabel.setText("Total a pagar: $" + costo);
                            if(costo<=0 && accidentadoCheckBox.isSelected()&&  multadoCheckBox.isSelected() ) {resultadoLabel.setText("Total a pagar: $");
                            JOptionPane.showMessageDialog(null, "Debes ingresar un kilometraje superior al inicial para poder entregar el auto");}
                            else {JOptionPane.showMessageDialog(null, "Devolución registrada exitosamente.");}
                            break;
                        }
                    }
                } else {
                	JOptionPane.showMessageDialog(null, "Auto no encontrado o no está alquilado.");
                	
                    
                }
               
                if (auto != null && auto.isAlquilado()) {
                    superAutos.registrarDevolucion(auto, kilometrajeFinal);
                    
                    
                } else {
                	 
                }

                
                
            }
        });
    }
}

