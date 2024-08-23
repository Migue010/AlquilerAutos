import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BusquedaAutoPanel extends JPanel {
    private JTextField marcaField, modeloField;
    private JButton buscarButton;
    private JTextArea resultadoArea;
    private SuperAutos superAutos;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;

    public BusquedaAutoPanel(SuperAutos superAutos) {
        this.superAutos = superAutos;
        setLayout(null);

        JPanel inputPanel = new JPanel();
        inputPanel.setBounds(0, 0, 450, 87);
        inputPanel.setLayout(null);
        JLabel label = new JLabel("Marca del auto:");
        label.setBounds(0, 0, 225, 29);
        inputPanel.add(label);
        marcaField = new JTextField();
        marcaField.setBounds(225, 0, 225, 29);
        inputPanel.add(marcaField);

        JLabel label_1 = new JLabel("Modelo del auto:");
        label_1.setBounds(0, 29, 225, 29);
        inputPanel.add(label_1);
        modeloField = new JTextField();
        modeloField.setBounds(225, 29, 225, 29);
        inputPanel.add(modeloField);

        buscarButton = new JButton("Buscar");
        buscarButton.setBackground(SystemColor.activeCaptionText);
        buscarButton.setBounds(0, 58, 450, 29);
        inputPanel.add(buscarButton);
        add(inputPanel);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 6, 450, 297);
        inputPanel.add(lblNewLabel);

        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        resultadoArea.setForeground(SystemColor.menu);
        resultadoArea.setBackground(SystemColor.activeCaptionText);
        JScrollPane scrollPane = new JScrollPane(resultadoArea);
        scrollPane.setBounds(0, 87, 450, 68);
        add(scrollPane);
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("/Users/admin/Documents/autof.jpeg"));
        lblNewLabel_1.setBounds(0, 151, 444, 149);
        add(lblNewLabel_1);

        buscarButton.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                String marca = marcaField.getText();
                String modelo = modeloField.getText();
                List<Auto> autos = superAutos.buscarAutosPorMarcaYModelo(marca, modelo);

                StringBuilder resultado = new StringBuilder();
                for (Auto auto : autos) {
                    resultado.append("Placa: ").append(auto.getPlaca())
                             .append(", Marca: ").append(auto.getMarca())
                             .append(", Modelo: ").append(auto.getModelo())
                             .append(", Color: ").append(auto.getColor())
                             .append(", Kilometraje: ").append(auto.getKilometrajeActual())
                             .append("\n");
                }

                resultadoArea.setText(resultado.toString());
            }
        });
    }
}

