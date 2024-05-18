import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm3 extends JFrame {

    private JTextField textField;
    private JButton toggleButton;

    public ContactForm3() {
        super("3 задание");
        super.setSize(370, 120); // Установка размера окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Установка менеджера компоновки для вертикального расположения компонентов
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));


        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel label = new JLabel("Введите число:");
        inputPanel.add(label);

        textField = new JTextField(20);
        textField.setBackground(Color.RED);
        inputPanel.add(textField);
        add(inputPanel);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        toggleButton = new JButton("Скрыть поле");
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleTextField();
            }
        });
        buttonPanel.add(toggleButton);
        add(buttonPanel);
    }

    private void toggleTextField() {
        if (textField.isVisible()) {
            textField.setVisible(false);
            toggleButton.setText("Показать поле");
        } else {
            textField.setVisible(true);
            toggleButton.setText("Скрыть поле");
        }
    }


}