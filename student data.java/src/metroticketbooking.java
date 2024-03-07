import java.awt.EventQueue;
//lighjgfj
//jkfhgjh
//jkfdhguhi
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class metroticketbooking {

	private JFrame frame;
	private JTextField N;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticketbooking window = new metroticketbooking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public metroticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(92, 52, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		N = new JTextField();
		N.setBounds(236, 49, 86, 20);
		frame.getContentPane().add(N);
		N.setColumns(10);
		
		JLabel lblSource = new JLabel("SOURCE");
		lblSource.setBounds(92, 88, 46, 14);
		frame.getContentPane().add(lblSource);
		
		JComboBox C1 = new JComboBox();
		C1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MGBS", "MIYAPUR", "AMEERPET"}));
		C1.setBounds(236, 84, 86, 22);
		frame.getContentPane().add(C1);
		
		JLabel lblNewLabel_1 = new JLabel("DESTINATION");
		lblNewLabel_1.setBounds(93, 134, 92, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox C2 = new JComboBox();
		C2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "JBS", "KOTI", "KPHB"}));
		C2.setBounds(236, 130, 86, 22);
		frame.getContentPane().add(C2);
		
		JLabel lblNewLabel_2 = new JLabel("NOOFTICKETS");
		lblNewLabel_2.setBounds(92, 173, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton S = new JButton("SUBMIT");
		S.setBounds(189, 213, 89, 23);
		frame.getContentPane().add(S);
		
		JLabel lblNewLabel_3 = new JLabel("METROTICKETBOOKING");
		lblNewLabel_3.setBounds(148, 11, 174, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox C3 = new JComboBox();
		C3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5"}));
		C3.setBounds(236, 169, 86, 22);
		frame.getContentPane().add(C3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\TRAIN.jpg"));
		lblNewLabel_4.setBounds(0, 11, 89, 239);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\TRAIN.jpg"));
		lblNewLabel_5.setBounds(332, 11, 92, 239);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
