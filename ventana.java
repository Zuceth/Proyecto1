import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class ventana{
   public static void main(String []arg){

	JFrame frame = new JFrame("Login");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	Container cont = frame.getContentPane();
	cont.setLayout(new GridBagLayout());

	GridBagConstraints gbc = new GridBagConstraints();
	JLabel e1 = new JLabel("User:");
	JLabel e2 = new JLabel("Password:");
	JTextField user = new JTextField();
	JTextField pass = new JTextField();
        JButton cancelar = new JButton("Cancelar");
        JButton ok = new JButton("OK");
	
	gbc.fill = GridBagConstraints.BOTH;
	gbc.insets = new Insets(10,10,10,10);

	gbc.gridx = 0;
	gbc.gridy = 0;
	cont.add(e1, gbc);

	gbc.gridx = 0;
	gbc.gridy = 1;
	cont.add(e2, gbc);

	gbc.gridx = 1;
	gbc.gridy = 0;
	cont.add(user, gbc);
	
	gbc.gridx = 1;
	gbc.gridy = 1;
	cont.add(pass, gbc);

	gbc.gridx = 0;
	gbc.gridy = 2;
	cont.add(cancelar, gbc);

	gbc.gridx = 1;
	gbc.gridy = 2;
	cont.add(ok, gbc);

	frame.pack();
	frame.setVisible(true);

   }

}

