package classes;
import java.lang. *;
import interfaces.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JOptionPane;


public class Payment extends JFrame implements ActionListener, MouseListener {

	 
	ImageIcon img;
	JLabel hLabel,l1,l2,l3,l4,l5,l6,patLabel, imgLabel ;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JPasswordField passPF;
	JButton b1,b2,b3, backBtn,b4;
	
	JPanel panel;
	Color myColor;
	Font myFont;
	

	HospitalAccount account[]=new HospitalAccount[20];
	HospitalAccount acc;
	PatientAccount pa;

	public Payment (PatientAccount pa)
	{
		super("Payment ");
		this.setSize(850, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pa=pa;
		
		
		
		
		myColor = new Color(210, 210, 210);
		myFont = new Font("Cambria", Font.PLAIN, 22);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);

		hLabel = new JLabel(" RASM Hospital");
		hLabel.setBounds(30, 10, 300, 50);
		//hLabel.setBackground(Color.WHITE);
		//hLabel.setOpaque(true);
		hLabel.setForeground(Color.BLUE);
		hLabel.setFont(myFont);
		panel.add(hLabel);
		
		
		

		l1 = new JLabel(" Make Payment");
		l1.setBounds(50, 100, 150, 50);
		l1.setBackground(Color.GREEN);
		l1.setForeground(Color.WHITE);
		panel.add(l1);

		l2 = new JLabel("Amount : ");
		l2.setBounds(70, 150, 100, 50);
		l2.setForeground(Color.WHITE);
		panel.add(l2);
		
		
		t1 = new JTextField();
		t1.setBounds(170, 170, 100, 30);
		panel.add(t1);

		l3 = new JLabel("PIN : ");
		l3.setBounds(70, 200, 100, 50);
		l3.setForeground(Color.BLACK);
		panel.add(l3);

		t2 = new JTextField("");
		t2.setBounds(170, 220, 100, 30);
		panel.add(t2);
		
		
		
		
		b4 = new JButton("Payment");
		b4.setBounds(150, 350, 150, 50);
		b4.setBackground(Color.GREEN);
		b4.setForeground(Color.WHITE);
		b4.addMouseListener(this);
		b4.addActionListener(this);
		panel.add(b4);
		
		
		
		backBtn = new JButton("BACK");
		backBtn.setBounds(350, 450, 70, 30);
		backBtn.setBackground(Color.RED);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		img = new ImageIcon("pa.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(1, 1, 850, 600);
		panel.add(imgLabel);
		
		this.add(panel);


		
		

		
		
		
		
		}
		public void payment(String cost)
     {
     	

       JOptionPane.showMessageDialog(null,cost+"TK, Payment Successful");
     }
	 

	
	
	 
	 public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == b4)
		{
			b4.setBackground(Color.BLACK);
			b4.setForeground(Color.WHITE);
		}
		
		

		else if(me.getSource() == backBtn)
		{
			backBtn.setBackground(Color.BLACK);
			backBtn.setForeground(Color.WHITE);
		}

		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == b4)
		{
			b4.setBackground(Color.GREEN);
			b4.setForeground(Color.BLACK);
		}
         
		
		else if(me.getSource() == backBtn)
		{
			backBtn.setBackground(Color.RED);
			backBtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
     @Override
     public void actionPerformed(ActionEvent ae)
	{
	String command = ae.getActionCommand();
		String s1 =t1.getText();
			String s2 = t2.getText();
		
		if(b4.getText().equals(command))
		{
			
			
			
			if(s1.equals("1000") ||s1.equals("1500")||s1.equals("2000")||
				s1.equals("3000") ||s1.equals("5000")||s1.equals("10000")||
				s1.equals("20000") ||s1.equals("25000")||s1.equals("50000")
				&& s2.equals("1234")||s2.equals("2456"))
			{
				
			
			payment(s1);
			
			
			}
			
		

        else 
		{
			
			JOptionPane.showMessageDialog( null," Payment must be 1000TK to 50000TK ");
			
			
			}}
         else if(ae.getSource() == backBtn)
		{  pa.setVisible(true);
			this.setVisible(false);
	      }

		else

		{

		}

		}}	

	


	

