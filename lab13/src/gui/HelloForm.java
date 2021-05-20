package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm extends JFrame{
    private JPanel rootPanel;
    private JLabel helloLabel;
    private JTextArea textArea;
    private JButton pressMeButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JCheckBox checkBox;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;

    public HelloForm() {

        add(rootPanel);
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        checkBox.setSelected(true);
        helloLabel.setText("Insert name");

        ButtonGroup group = new ButtonGroup();
        group.add(maleRadioButton);
        group.add(femaleRadioButton);

        pressMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textArea.getText();
                if(name.equals("")) {
                    JOptionPane.showMessageDialog(rootPanel, "No name yet!");
                } else  {
                    JOptionPane.showMessageDialog(rootPanel, "Hello " + name);
                }
            }
        });


        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = checkBox.isSelected() ? "Checked" : "Unchecked";
                JOptionPane.showMessageDialog(rootPanel, message);
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}