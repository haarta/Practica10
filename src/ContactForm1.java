import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ContactForm1 extends JFrame {


    public ContactForm1() {

        super("1 задание");
        super.setSize(200,200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        super.add(panel);

        panel.setLayout(new GridLayout(3,1));
        JLabel pr = new JLabel("Привет");
        JLabel wr = new JLabel("Мир!");
        JButton N_button = new JButton("Нажмите");
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);

        panel.add(pr);
        pr.setBorder(border);
        panel.add(wr);
        wr.setBorder(border);

        panel.add(N_button);

        N_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Привет, Мир!"); }

    });

}
}