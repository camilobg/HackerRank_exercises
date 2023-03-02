package HackerRank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Swing extends JFrame{

    public Swing() {
        super("Mi titulo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        //Pone coordenadas absolutas para ubicar componentes dentro del frame
        setLayout(null);
        setVisible(true);
    }
    public static void main(final String[] args) {
        Swing sw=new Swing();
        JLabel nameLabel = new JLabel();
        nameLabel.setText("Your Name");
        nameLabel.setBounds(40, 20, 100, 30);
        sw.add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(160,20, 100,30);
        sw.add(nameTextField);
        //String name = nameTextField.getText();
        //nameTextField.setText(someText);

        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(40,150,220,70);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setBackground(Color.GREEN);
        sw.add(greenPanel);


        JLabel helloLabel = new JLabel("Hello");
        helloLabel.setBounds(50,20, 100,30);
        helloLabel.setHorizontalAlignment(SwingConstants.CENTER);
        helloLabel.setVerticalAlignment(SwingConstants.CENTER);

        Font font = new Font("Courier", Font.BOLD,12);
        helloLabel.setFont(font);
        helloLabel.setFont(helloLabel.getFont().deriveFont(16f));
        //Modifica el tamaño a 16 pts
        greenPanel.add(helloLabel); // adding label to the panel

        JButton acceptButton = new JButton("Accept");
        acceptButton.setBounds(100, 70, 100, 30);
        sw.add(acceptButton);


        acceptButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String campo=nameTextField.getText();
                if(campo!=null && !campo.isEmpty()){
                    helloLabel.setText("Hello "+campo);
                }
                else helloLabel.setText("Vacio");
            }
            /*
            EXPRESIÓN LAMBDA
            acceptButton.addActionListener(e -> {
                String helloText = "Hello";
                String name = nameTextField.getText();
                if (name != null && name.trim().length() > 0) {
                    helloText += String.format(", %s", name);
                }
                helloLabel.setText(helloText);
            });
             */
        });
    }
}
