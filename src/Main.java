import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;

public class Main extends JFrame{
    private JPanel panel;

    private JButton button1;
    private JTextField pleaseEnterGreatestNumberTextField;

    public Main() {
        panel = new JPanel();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                prime prime = new prime(hashCode());
            }
        });
        pleaseEnterGreatestNumberTextField.addContainerListener(new ContainerAdapter() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
    }
}
