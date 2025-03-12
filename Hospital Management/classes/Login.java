package  classes;
import java.lang.*;
import interfaces.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JOptionPane;



public class Login extends JFrame implements MouseListener, ActionListener
{
	ImageIcon img;
	JLabel hLabel,userLabel, passLabel, imgLabel ;
	JTextField userTF;
	JPasswordField passPF;
	JButton loginBtn, exitBtn;
	JComboBox combo;
	JPanel panel;
	Color myColor;
	Font myFont;

	public Login()
	{
		super("RASM Hospital Login Page");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//myColor = new Color(210, 210, 210);
		myFont = new Font("Cambria", Font.PLAIN, 22);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);

		hLabel = new JLabel("   RASM Hospital  ");
		hLabel.setBounds(200, 40, 200, 50);
		//hLabel.setBackground(Color.WHITE);
		//hLabel.setOpaque(true);
		hLabel.setForeground(Color.BLACK);
		hLabel.setFont(myFont);
		panel.add(hLabel);
		
		userLabel = new JLabel("User Name : ");
		userLabel.setBounds(150, 107, 100, 50);
		//userLabel.setOpaque(true);
		userLabel.setForeground(Color.BLUE);
		//userLabel.setFont(myFont);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(280, 115, 100, 30);
		panel.add(userTF);
		
		passLabel = new JLabel("Password : ");
		passLabel.setBounds(150, 160, 100, 30);
		passLabel.setForeground(Color.BLUE);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(280, 165, 100, 30);
		passPF.setEchoChar('*');
		panel.add(passPF);
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(180, 250, 80, 30);
		loginBtn.setBackground(Color.GREEN);
		loginBtn.addMouseListener(this);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);
		
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(300, 250, 80, 30);
		exitBtn.setBackground(Color.RED);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		
		String items[] = {"Doctor", "Patient"};
		combo = new JComboBox(items);
		combo.setBounds(550, 100, 100, 30);
		panel.add(combo);

		
		
		img = new ImageIcon("1.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(1, 1, 800, 450);
		panel.add(imgLabel);
		
		this.add(panel);
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.BLUE);
			loginBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.BLUE);
			exitBtn.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.GREEN);
			loginBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		String s1 = userTF.getText();
			String s2 = passPF.getText();
		
		if(loginBtn.getText().equals(command))
		{
			
						
			if(s1.equals("rakib") && s2.equals("admin"))
			{
				JOptionPane.showMessageDialog( null," Successful Login ");
			
			
			
			
			SecondPage sp = new SecondPage( this);
			sp.setVisible(true);
			this.setVisible(false);}
			
		

        else 
		{
			
			JOptionPane.showMessageDialog( null," Wrong Password ");
			
			
			}}
         

		else if(exitBtn.getText().equals(command))
		{  int choice=JOptionPane.showConfirmDialog(null,"Do you Really want to Quit","EXIT",JOptionPane.YES_NO_OPTION);

	      if(choice==JOptionPane.YES_OPTION)

			{System.exit(0);}
		 else{}
		}
		else
		{
			
		}
	}
	
}