package classes;
import java.lang. *;
import interfaces.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JOptionPane;


public class Medicine extends JFrame implements ActionListener, MouseListener {

	 
	ImageIcon img;
	JLabel hLabel,l1,l2,l3,l4,l5,l6,mediLabel, imgLabel ;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JPasswordField passPF;
	JButton b1,b2,b3,b4, backBtn;
	JComboBox combo;
	JPanel panel;
	Color myColor;
	Font myFont;

	HospitalAccount account[]=new HospitalAccount[20];
	HospitalAccount acc;
	SecondPage sp;

	public Medicine (SecondPage sp)
	{
		super("Medicine Section ");
		this.setSize(850, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.sp=sp;
		
		
		
		
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
		
		
		mediLabel = new JLabel(" Medicine Section");
		mediLabel.setBounds(200, 30, 200, 50);
		mediLabel.setBackground(Color.BLUE);
		mediLabel.setForeground(Color.WHITE);
		
		panel.add(mediLabel);

		l1 = new JLabel(" Add New Medicine");
		l1.setBounds(50, 100, 150, 50);
		l1.setBackground(Color.GREEN);
		l1.setForeground(Color.BLACK);
		panel.add(l1);

		l2 = new JLabel(" Medicine Name : ");
		l2.setBounds(50, 150, 100, 50);
		l2.setForeground(Color.BLACK);
		panel.add(l2);
		
		
		t1 = new JTextField();
		t1.setBounds(150, 165, 100, 30);
		panel.add(t1);

		l3 = new JLabel(" Quantity : ");
		l3.setBounds(50, 200, 100, 50);
		l3.setForeground(Color.BLACK);
		panel.add(l3);

		t2 = new JTextField("");
		t2.setBounds(150, 215, 100, 30);
		panel.add(t2);
		
		
		b1 = new JButton("ADD");
		b1.setBounds(200, 320, 150, 50);
		b1.setBackground(Color.GREEN);
		b1.setForeground(Color.WHITE);
		b1.addMouseListener(this);
		b1.addActionListener(this);
		panel.add(b1);
		
		l4 = new JLabel(" Remove Medicine ");
		l4.setBounds(300, 100, 150, 50);
		l4.setBackground(Color.BLUE);
		l4.setForeground(Color.BLACK);
		panel.add(l4);

		l5 = new JLabel(" Medicine Name : ");
		l5.setBounds(300, 150, 100, 50);
		l5.setForeground(Color.BLACK);
		panel.add(l5);
		
		t3 = new JTextField();
		t3.setBounds(400, 165, 100, 30);
		panel.add(t3);

        b2 = new JButton("REMOVE");
		b2.setBounds(400, 320, 150, 50);
		b2.setBackground(Color.BLUE);
		b2.setForeground(Color.WHITE);
		b2.addMouseListener(this);
		b2.addActionListener(this);
		panel.add(b2);
		
		b3 = new JButton("Medicine List");
		b3.setBounds(520, 100, 150, 50);
		b3.setBackground(Color.BLUE);
		b3.setForeground(Color.WHITE);
		b3.addMouseListener(this);
		b3.addActionListener(this);
		panel.add(b3);

		t4 = new JTextField("");
		t4.setBounds(680, 150, 100, 30);
		panel.add(t4);

		b4 = new JButton("Search");
		b4.setBounds(700, 200, 80, 30);
		b4.setBackground(Color.BLUE);
		b4.setForeground(Color.WHITE);
		b4.addMouseListener(this);
		b4.addActionListener(this);
		panel.add(b4);
		
		
        

		backBtn = new JButton("BACK");
		backBtn.setBounds(580, 450, 70, 30);
		backBtn.setBackground(Color.RED);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		img = new ImageIcon("4.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(1, 1, 850, 600);
		panel.add(imgLabel);
		
		this.add(panel);
		
		

		
		
		
		
		}

	public void addMedicine(String a)
	{
		
		int flag=0;
		acc=new HospitalAccount(a);
		for(int i=0;i<account.length;i++)
		{
			if(account[i]==null)
			{
				account[i]=acc;
				flag=1;
				break;
			}
		}

		if(flag == 1){showMessageDialog(null, "Insert Successful!");}
		else {showMessageDialog(null, "Unsuccesful operation!");}
	}


    

	 public void removeMedicine(String a)
	{
		int flag=0;
		
		try{for(int i=0;i<account.length;i++)
		{
			if(account[i].getName().equals(a))
			{
				account[i]=null;
				flag=1;
				break;
			}
		}}
		catch(NullPointerException npe)
		{
			JOptionPane.showMessageDialog(null, "NullPointerException occured");
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		if(flag == 1)
			{JOptionPane.showMessageDialog(null, "Remove Successful!");}
		else {JOptionPane.showMessageDialog(null, "Unsuccesful operation!");}
	}
	public void showMedicine()
	{    //acc=new HospitalAccount(a);
		for(int i=0;i<account.length;i++)
		{
		  if (account[i]!=null)
		   { 
			JOptionPane.showMessageDialog(null,i+" .Medicine Name: "+account[i].getName());
				
			}
			}}

			public void searchMedicine(String a)
	{
		int flag=0;
		
		try{for(int i=0;i<account.length;i++)
		{
			if(account[i].getName().equals(a))
			{
				
				flag=1;
				break;
			}
		}}
		catch(NullPointerException npe)
		{
			
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		if(flag == 1)
			{JOptionPane.showMessageDialog(null, "Facility Found");}
		else {JOptionPane.showMessageDialog(null, "Facility not Found");}
	}
	/*public void showFacilities()
	{    acc=new HospitalAccount(a);
		for(int i=0;i<account.length;i++)
		{
		  if (account[i]!=null)
		   { 
			JOptionPane.showMessageDialog(null,"Facility Name: "+account[i].getName()+
				"Cost : "+account[i].getCost());
				
			}
			}}

	public Facility getFacility(String name)
	{
		account acc = null;
		
		for(int i=0; i<account.length; i++)
		{
			if(account[i] != null)
			{
				if(account[i].getName() == Name)
				{
					acc= account[i];
					break;
				}
			}
		}
		if(acc!= null)
		{
			JOptionPane.showMessageDialog(null, "Facility Found");;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Faciltiy Not Found");
		}
		return acc;
	}*/
	 
	 public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == b1)
		{
			b1.setBackground(Color.BLACK);
			b1.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b2)
		{
			b2.setBackground(Color.RED);
			b2.setForeground(Color.BLACK);
		}

		if(me.getSource() == b3)
		{
			b3.setBackground(Color.BLUE);
			b3.setForeground(Color.WHITE);
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
		if(me.getSource() == b1)
		{
			b1.setBackground(Color.GREEN);
			b1.setForeground(Color.BLACK);
		}
         if(me.getSource() == b2)
		{
			b2.setBackground(Color.BLUE);
			b2.setForeground(Color.WHITE);
		}
		
		if(me.getSource() == b3)
		{
			b3.setBackground(Color.BLUE);
			b3.setForeground(Color.WHITE);
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
		//String command = ()ae.getActionCommand();
		String s1 = t1.getText();
		String s2 = t3.getText();
		String s3=t4.getText();
		if(ae.getSource() == b1)
		{//showMessageDialog(null, "account inserted!");
			//JOptionPane.showMessageDialog(null, "Hello");
			addMedicine(s1);   // insert method call
		    //insertTF.setText("");}
			//showMessageDialog(null, "account inserted!");}
		}
		else if(ae.getSource() == b2)
			{
			 int choice=JOptionPane.showConfirmDialog(null,"Do you Really want to Remove"," ",JOptionPane.YES_NO_OPTION);

	         if(choice==JOptionPane.YES_OPTION){

				removeMedicine(s2);}
				//showMessageDialog(null, "account removed!");
				else{}
			}

           else if(ae.getSource() == b3){showMedicine();}

            else if(ae.getSource() == b4){ searchMedicine(s3);}

           else if(ae.getSource() == backBtn)
		{  sp.setVisible(true);
			this.setVisible(false);
	      }

		else
		{

		}

		}	

	}


	

