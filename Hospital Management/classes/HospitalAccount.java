package  classes;
import java. lang.*;
//import interfaces.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class HospitalAccount{
	private String room;
	private String id;
	private String name;
	private String department;
	private int age;
	private String disease;
	private String sex;
	private String phnNumber;
	public double cost;
	public double balance;



	
	
	public HospitalAccount(){}
	public HospitalAccount(String name){this.name=name;}
	public HospitalAccount(String name,double cost)
	 {
		this.name=name;
		this.cost=cost;

     }

	/*public HospitalAccount(String room,String id,String name,String department,
		int age,String disease,String sex,String phnNumber,double cost){
		
	   this.room=room;
	   this.id=id;
	   this.name=name;
	   this.department=department;
	   this.age=age;
	   this.disease=disease;
	   this.sex=sex;
	   this.phnNumber=phnNumber;
	   this.cost=cost;
}*/
    public void setRoom(String room){this.room=room;}
    public void setId(String id){this.id=id;}
    public void setName(String name){this.name=name;}
    public void setDepartment(String department){this.department=department;}
    public void setAge(int age){this.age=age;}
    public void setDisease(String disease){this.disease=disease;}
    public void setSex(String sex){this.sex=sex;}
    public void setPhnNumber(String phnNumber){this.phnNumber=phnNumber;}
    public void setCost(double cost){this.cost=cost;}
    public void setBalance(double balance){this.balance=balance;}

   public String getRoom(){return room;}
    public String getId(String id){return id;}
    public String getName(){return name;}
    public String getDepartment(String department){return department;}
    public int getAge(){return age;}
    public String getDisease(){return disease;}
    public String getSex(){return sex;}
    public String getPhnNumber(){return phnNumber;}
    public double getCost(){return cost;}
    public double getBalance(){return balance;}
		
	 }