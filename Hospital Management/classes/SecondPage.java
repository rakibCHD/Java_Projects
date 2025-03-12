package  classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SecondPage extends JFrame implements MouseListener, ActionListener
{
	ImageIcon img;
	JLabel hLabel, imgLabel ;
	//JTextField userTF;
	//JPasswordField passPF;
	JButton docBtn, patientBtn,medBtn,labBtn,faciBtn,backBtn;
	//JComboBox combo;
	JPanel panel;
	Color myColor;
	Font myFont;
	Login login;
	

	public SecondPage(Login login)
	{
		super("RASM Hospital Home Page ");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.login=login;
		
		
		
		
		myColor = new Color(210, 210, 210);
		myFont = new Font("Cambria", Font.PLAIN, 22);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);

		hLabel = new JLabel("Welcome to RASM Hospital");
		hLabel.setBounds(200, 30, 300, 50);
		//hLabel.setBackground(Color.WHITE);
		//hLabel.setOpaque(true);
		hLabel.setForeground(Color.WHITE);
		hLabel.setFont(myFont);
		panel.add(hLabel);
		
		
		docBtn = new JButton("DOCTOR");
		docBtn.setBounds(100, 90, 150, 50);
		docBtn.setBackground(Color.GREEN);
		docBtn.addMouseListener(this);
		docBtn.addActionListener(this);
		panel.add(docBtn);
		
		patientBtn = new JButton("PATIENT");
		patientBtn.setBounds(100, 150, 150, 50);
		patientBtn.setBackground(Color.BLUE);
		patientBtn.setForeground(Color.WHITE);
		patientBtn.addMouseListener(this);
		patientBtn.addActionListener(this);
		panel.add(patientBtn);
		
		medBtn = new JButton("MEDICINE");
		medBtn.setBounds(100, 210, 150, 50);
		medBtn.setBackground(Color.GREEN);
		medBtn.addMouseListener(this);
		medBtn.addActionListener(this);
		panel.add(medBtn);
		
		labBtn = new JButton("LABORATORY");
		labBtn.setBounds(100, 270, 150, 50);
		labBtn.setBackground(Color.BLUE);
		labBtn.setForeground(Color.WHITE);
		labBtn.addMouseListener(this);
		labBtn.addActionListener(this);
		panel.add(labBtn);
		
		faciBtn = new JButton("FACILITY");
		faciBtn.setBounds(100, 330, 150, 50);
		faciBtn.setBackground(Color.GREEN);
		faciBtn.addMouseListener(this);
		faciBtn.addActionListener(this);
		panel.add(faciBtn);
		
		
		backBtn = new JButton("BACK");
		backBtn.setBounds(580, 350, 70, 30);
		backBtn.setBackground(Color.RED);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		img = new ImageIcon("2.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(1, 1, 800, 450);
		panel.add(imgLabel);
		
		this.add(panel);
		
		

		
		
		
		this.add(panel);
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == docBtn)
		{
			docBtn.setBackground(Color.BLACK);
			docBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == patientBtn)
		{
			patientBtn.setBackground(Color.BLACK);
			patientBtn.setForeground(Color.WHITE);
		}

		else if(me.getSource() == medBtn)
		{
			medBtn.setBackground(Color.BLACK);
			medBtn.setForeground(Color.WHITE);
		}

		else if(me.getSource() == labBtn)
		{
			labBtn.setBackground(Color.BLACK);
			labBtn.setForeground(Color.WHITE);
		}

		else if(me.getSource() == faciBtn)
		{
			faciBtn.setBackground(Color.BLACK);
			faciBtn.setForeground(Color.WHITE);
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
		if(me.getSource() == docBtn)
		{
			docBtn.setBackground(Color.GREEN);
			docBtn.setForeground(Color.BLACK);
		}
         if(me.getSource() == patientBtn)
		{
			patientBtn.setBackground(Color.BLUE);
			patientBtn.setForeground(Color.WHITE);
		}
		if(me.getSource() == medBtn)
		{
			medBtn.setBackground(Color.GREEN);
			medBtn.setForeground(Color.BLACK);
		}
		if(me.getSource() == labBtn)
		{
			labBtn.setBackground(Color.BLUE);
			labBtn.setForeground(Color.WHITE);
		}
		if(me.getSource() == faciBtn)
		{
			faciBtn.setBackground(Color.GREEN);
			faciBtn.setForeground(Color.BLACK);
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
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		/*String s1 = userTF.getText();
			String s2 = passPF.getText();
		
		if(loginBtn.getText().equals(command))
		{
			
			
			
			if(s1.equals("Shihab") && s2.equals("1234"))
			{
				JOptionPane.showMessageDialog( null," Successful Login ");
			}
			
			
			
			SecondFrame sf = new SecondFrame(s1,s2, this);
			sf.setVisible(true);
			this.setVisible(false);
			
		

        else 
		{
			
			JOptionPane.showMessageDialog( null," Wrong Password ");
			
			
			}}*/

           if(docBtn.getText().equals(command))
		    {   Doctor doc=new Doctor(this);
			doc.setVisible(true);
			this.setVisible(false);
	      }
          else if(patientBtn.getText().equals(command))
		    {   Patient pat=new Patient(this);
			pat.setVisible(true);
			this.setVisible(false);
	      }
          else if(medBtn.getText().equals(command))
		    {   Medicine med=new Medicine (this);
			med.setVisible(true);
			this.setVisible(false);
	      }

          else if(labBtn.getText().equals(command))
		    {   Lab la=new Lab (this);
			la.setVisible(true);
			this.setVisible(false);
	      }

         else if(faciBtn.getText().equals(command))
		    {   Facility faci=new Facility(this);
			faci.setVisible(true);
			this.setVisible(false);
	      }



		 else if(backBtn.getText().equals(command))
		{  login.setVisible(true);
			this.setVisible(false);
	      }
		 
		
		else
		{
			
		}
}}
	
	
	
	
	
	
	
	
