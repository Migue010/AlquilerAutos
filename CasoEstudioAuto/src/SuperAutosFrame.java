import javax.swing.*;
import java.awt.*;

public class SuperAutosFrame extends JFrame {
    private AlquilerAutoPanel alquilerAutoPanel;
   
    private CobroAlquilerPanel cobroAlquilerPanel;
    private BusquedaAutoPanel busquedaAutoPanel;
    private DisponibilidadAutoPanel disponibilidadAutoPanel;
    private SuperAutos superAutos;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_3;

    public SuperAutosFrame() {
    	setResizable(false);
        superAutos = new SuperAutos();
        setTitle("Súper Autos");
        setSize(783, 389);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        JTabbedPane tabbedPane = new JTabbedPane();
        
                busquedaAutoPanel = new BusquedaAutoPanel(superAutos);
                tabbedPane.addTab("Búsqueda Auto", busquedaAutoPanel);
                
                JPanel panel = new JPanel();
                panel.setBounds(450, 6, 306, 303);
                busquedaAutoPanel.add(panel);
                panel.setLayout(new GridLayout(10, 10, 0, 0));
                
                JLabel lblNewLabel_4_1 = new JLabel("CHEVROLET");
                lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_1);
                
                JLabel lblNewLabel_4_2 = new JLabel("2020");
                lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_2);
                
                JLabel lblNewLabel_4_3 = new JLabel("CHEVROLET");
                lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_3);
                
                JLabel lblNewLabel_4_10 = new JLabel("2020");
                lblNewLabel_4_10.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_10);
                
                JLabel lblNewLabel_4_9 = new JLabel("KIA");
                lblNewLabel_4_9.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_9);
                
                JLabel lblNewLabel_4_8 = new JLabel("2012");
                lblNewLabel_4_8.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_8);
                
                JLabel lblNewLabel_4_7 = new JLabel("KIA");
                lblNewLabel_4_7.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_7);
                
                JLabel lblNewLabel_4_19 = new JLabel("2014");
                lblNewLabel_4_19.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_19);
                
                JLabel lblNewLabel_4_18 = new JLabel("KIA");
                lblNewLabel_4_18.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_18);
                
                JLabel lblNewLabel_4_17 = new JLabel("2016");
                lblNewLabel_4_17.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_17);
                
                JLabel lblNewLabel_4_16 = new JLabel("RENAULT");
                lblNewLabel_4_16.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_16);
                
                JLabel lblNewLabel_4_15 = new JLabel("2010");
                lblNewLabel_4_15.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_15);
                
                JLabel lblNewLabel_4_14 = new JLabel("RENAULT");
                lblNewLabel_4_14.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_14);
                
                JLabel lblNewLabel_4_13 = new JLabel("2017");
                lblNewLabel_4_13.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_13);
                
                JLabel lblNewLabel_4_12 = new JLabel("SUZUKI");
                lblNewLabel_4_12.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_12);
                
                JLabel lblNewLabel_4_11 = new JLabel("2015");
                lblNewLabel_4_11.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_11);
                
                JLabel lblNewLabel_4_6 = new JLabel("SUZUKI");
                lblNewLabel_4_6.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_6);
                
                JLabel lblNewLabel_4_5 = new JLabel("2018");
                lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_5);
                
                JLabel lblNewLabel_4_4 = new JLabel("SUZUKI");
                lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4_4);
                
                JLabel lblNewLabel_4 = new JLabel("2019");
                lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblNewLabel_4);
        
                disponibilidadAutoPanel = new DisponibilidadAutoPanel(superAutos);
                tabbedPane.addTab("Disponibilidad Auto", disponibilidadAutoPanel);
                
                lblNewLabel_3 = new JLabel("");
                lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_3.setIcon(new ImageIcon("/Users/admin/Documents/bm.jpeg"));
                lblNewLabel_3.setBounds(460, 0, 302, 309);
                disponibilidadAutoPanel.add(lblNewLabel_3);

        alquilerAutoPanel = new AlquilerAutoPanel(superAutos);
        tabbedPane.addTab("Alquiler Auto", alquilerAutoPanel);
        alquilerAutoPanel.setLayout(null);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon("/Users/admin/Documents/bm.jpeg"));
        lblNewLabel.setBounds(460, 0, 302, 309);
        alquilerAutoPanel.add(lblNewLabel);
        
                cobroAlquilerPanel = new CobroAlquilerPanel(superAutos);
                tabbedPane.addTab("Cobro Alquiler", cobroAlquilerPanel);
                
                JLabel lblNewLabel_2 = new JLabel("");
                lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_2.setIcon(new ImageIcon("/Users/admin/Documents/bm.jpeg"));
                lblNewLabel_2.setBounds(458, 0, 304, 315);
                cobroAlquilerPanel.add(lblNewLabel_2);

        
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setIcon(new ImageIcon("/Users/admin/Documents/bm.jpeg"));
        lblNewLabel_1.setBounds(456, 0, 306, 315);
        

        getContentPane().add(tabbedPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run() {
                new SuperAutosFrame().setVisible(true);
            }
        });
    }
}

