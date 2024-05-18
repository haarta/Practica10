import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm2 extends JFrame {

    final JTextField textField;
    final JButton displayButton;
    public ContactForm2() {
        super("2 задание");
        super.setSize(400,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        textField = new JTextField(20);


        displayButton = new JButton("Отобразить");



        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (!text.isEmpty()) {
                    JOptionPane.showMessageDialog(ContactForm2.this, text);
                }
            }
        });

        panel.add(textField);
        panel.add(displayButton);
        add(panel);

    }
}
