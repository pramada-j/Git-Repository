import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registrationpage {

	private JFrame frame;
	private JTextField a;
	private JTextField b;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationpage window = new registrationpage();
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
	public registrationpage() {
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
		
		JCheckBox f = new JCheckBox("PYTHON");
		f.setBounds(156, 180, 73, 23);
		frame.getContentPane().add(f);
		
		JComboBox c = new JComboBox();
		c.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "IT", "CSE", "DS", "AIML"}));
		c.setBounds(156, 119, 86, 22);
		frame.getContentPane().add(c);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNewLabel_1.setBounds(107, 50, 39, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ROLLNO");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNewLabel_2.setBounds(100, 83, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNewLabel_3.setBounds(100, 123, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		a = new JTextField();
		a.setBounds(156, 49, 86, 20);
		frame.getContentPane().add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setBounds(156, 80, 86, 20);
		frame.getContentPane().add(b);
		b.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNewLabel_4.setBounds(100, 159, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton d = new JRadioButton("MALE");
		d.setBounds(156, 155, 65, 23);
		frame.getContentPane().add(d);
		
		JRadioButton i = new JRadioButton("FEMALE");
		i.setBounds(222, 155, 65, 23);
		frame.getContentPane().add(i);
		
		JLabel lblNewLabel_5 = new JLabel("PROGLANGS");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNewLabel_5.setBounds(81, 184, 73, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JCheckBox g = new JCheckBox("JAVA");
		g.setBounds(232, 180, 55, 23);
		frame.getContentPane().add(g);
		
		ButtonGroup brg=new ButtonGroup();
		
		JButton h = new JButton("SUBMIT");
		h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NAME=a.getText();
				String ROLLNO=b.getText();
				String BRANCH=(String) c.getSelectedItem();
				brg.add(d);
				brg.add(i);
				String GENDER=" ";
				String PROGLANGS=" ";
				if(d.isSelected())
				{
					GENDER="MALE";
				}
				if(i.isSelected())
				{
					GENDER="FEMALE";
				}
				if(f.isSelected())
				{
					PROGLANGS=PROGLANGS+"PYTHON";
				}
				if(g.isSelected())
				{
					PROGLANGS=PROGLANGS+"JAVA";
				}
				JOptionPane.showMessageDialog(h," NAME "+NAME+" \n ROLLNO "+ROLLNO+" \n BRANCH "+BRANCH+"\n gender "+GENDER+"\n proglangs "+PROGLANGS);
			}
		});
		h.setBounds(178, 227, 89, 23);
		frame.getContentPane().add(h);
		
		JLabel lblRegistrationPage = new JLabel("REGISTRATION PAGE");
		lblRegistrationPage.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblRegistrationPage.setBounds(156, 24, 131, 14);
		frame.getContentPane().add(lblRegistrationPage);
		
		JLabel lblNewLabel = 
				new JLabel("ROLL NO");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\doraemon.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
