package patterns;

import javax.swing.*;

public class GuiForm {
    private JTextField textField1;
    private JButton button1;
    private JLabel display;

    public GuiForm() {
        button1.addActionListener(e -> {
            System.out.println("Hello");
            var name = textField1.getText();
            display.setText(name.toUpperCase());

        });
    }
}
