import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ticketconf {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField N;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketconf window = new ticketconf();
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
	public ticketconf() {
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
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setBounds(48, 61, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("movie");
		lblNewLabel_1.setBounds(48, 98, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("nooftickets");
		lblNewLabel_2.setBounds(48, 136, 53, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		N = new JTextField();
		N.setBounds(104, 58, 86, 20);
		frame.getContentPane().add(N);
		N.setColumns(10);
		
		JComboBox C1 = new JComboBox();
		C1.setModel(new DefaultComboBoxModel(new String[] {"select", "rrr", "eagle", "bahubali"}));
		C1.setBounds(104, 94, 89, 22);
		frame.getContentPane().add(C1);
		
		JComboBox C2 = new JComboBox();
		C2.setModel(new DefaultComboBoxModel(new String[] {"select", "0", "1", "2", "3", "4", "5"}));
		C2.setBounds(104, 132, 89, 22);
		frame.getContentPane().add(C2);
		
		ButtonGroup brg=new ButtonGroup();
		
		JButton S = new JButton("submit");
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=N.getText();
				String movie=(String) C1.getSelectedItem();
				String nooftickets=(String) C2.getSelectedItem();
				int nooftickets1=Integer.parseInt(nooftickets);
				int bill=0;
			    if(movie.equals("rrr"))
			    {
			    	bill=bill+150*nooftickets1;
			    }
			    if(movie.equals("eagle"))
			    {
			    	bill=bill+200*nooftickets1;
			    }
			    if(movie.equals("bahubali"))
			    {
			    	bill=bill+300*nooftickets1;
			    }
			    int res=0;
			    res=JOptionPane.showConfirmDialog(S," NAME "+name+" \n MOVIE "+movie+" \n NOOFTICKETS "+nooftickets+"\namount "+bill);
			    if(res==YES_OPTION)
			    {
			    	JOptionPane.showMessageDialog(S," booking confirmed");
			    }
			    else
			    {
			    	JOptionPane.showMessageDialog(S," booking not confirmed");
			    }
			}
		});
		S.setBounds(138, 197, 89, 23);
		frame.getContentPane().add(S);
		
		JLabel lblNewLabel_4 = new JLabel("MOVIE BOOKING APP");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(166, 33, 139, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\Screenshot.jpg"));
		lblNewLabel_3.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
