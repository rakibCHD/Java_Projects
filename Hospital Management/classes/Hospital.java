package  classes;
import java.lang.*;
import interfaces.*;


public class Hospital implements IPatient,IDoctor,IFacility,ILab,IMedicine
{
	private Patient patients[] = new Patient [500];
	private Doctor doctors[] = new Doctor [100];
	private Facility facilities[]=new Facility[10];
	private Lab labs[]=new Lab[20];
	private Medicine medicines[]=new Medicine[50];
	

	public void addPatient(Patient p)
	{
		int flag=0;
		for(int i=0;i<patients.length;i++)
		{
			if(patients[i]==null)
			{
				patients[i]=p;
				flag=1;
				break;
			}
		}
		if (flag==1){System.out.println("------Inserted---");}
		else{System.out.println("-----Can Not Inserted---");}
	}
	public void removePatient(Patient p)
	{
		int flag=0;
		for(int i=0;i<patients.length;i++)
		{
			if(patients[i]==p)
			{
				patients[i]=null;
				flag=1;
				break;
			}
		}
		if (flag==1){System.out.println("------removed---");}
		else{System.out.println("-----Can Not Removed---");}
	}
	public void showPatients()
	{
		for(int i=0;i<patients.length;i++)
		{
			if (patients[i]!=null)
			{
				System.out.println("\n*****************");
				System.out.println("Patient Name: "+patients[i].getPatientName());
				System.out.println("Patien Age: "+patients[i].getPatientAge());
				System.out.println("Patien Id: "+patients[i].getPatientId());
				System.out.println("Patient Disease: "+patients[i].getDisease());
				System.out.println("Patient Gender: "+patients[i].getGender());
				System.out.println("Patient Phone Number: "+patients[i].getPatientPhnNumber());
			}
			}}

	public Patient getPatient(int patientId)
	{
		Patient p = null;
		
		for(int i=0; i<patients.length; i++)
		{
			if(patients[i] != null)
			{
				if(patients[i].getPatientId() == patientId)
				{
					p = patients[i];
					break;
				}
			}
		}
		if(p != null)
		{
			System.out.println("Patient Found");
		}
		else
		{
			System.out.println("Patient Not Found");
		}
		return p;
	}
	
	
	public void addDoctor(Doctor d)
	{
		int flag=0;
		for(int i=0;i<doctors.length;i++)
		{
			if(doctors[i]==null)
			{
				doctors[i]=d;
				flag=1;
				break;
			}
		}
		if (flag==1){System.out.println("------Inserted---");}
		else{System.out.println("-----Can Not Inserted---");}
	}
	public void removeDoctor(Doctor d)
	{
		int flag=0;
		for(int i=0;i<doctors.length;i++)
		{
			if(doctors[i]==d)
			{
				doctors[i]=null;
				flag=1;
				break;
			}
		}
		if (flag==1){System.out.println("------removed---");}
		else{System.out.println("-----Can Not Removed---");}
	}
	public void showDoctors()
	{
		for(int i=0;i<doctors.length;i++)
		{
			if (doctors[i]!=null)
			{
				System.out.println("\n*****************");
				System.out.println("Doctor Name: "+doctors[i].getDocName());
				System.out.println("Doctor Id: "+doctors[i].getDocId());
				System.out.println("Doctor Room Number : "+doctors[i].getDocRoom());
				System.out.println("Doctor Gender: "+doctors[i].getDocGender());
				System.out.println("Doctor Phone Number: "+doctors[i].getDocPhnNumber());
			}
			}}
	public Doctor getDoctor(int docId)
	{
		Doctor d = null;
		
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] != null)
			{
				if(doctors[i].getDocId()==docId)
				{
					d = doctors[i];
					break;
				}
			}
		}
		if(d != null)
		{
			System.out.println("Doctor Found");
		}
		else
		{
			System.out.println("Doctor Not Found");
		}
		return d;
	}
	public void addFacility(Facility f)
	{
		
		int flag=0;
		for(int i=0;i<facilities.length;i++)
		{
			if(facilities[i]==null)
			{
				facilities[i]=f;
				flag=1;
				break;
			}
		}

		if (flag==1){System.out.println("------Inserted---");}
		else{System.out.println("-----Can Not Inserted---");}
	}
	public void removeFacility(Facility f)
	{
		int flag=0;
		for(int i=0;i<facilities.length;i++)
		{
			if(facilities[i]==f)
			{
				facilities[i]=null;
				flag=1;
				break;
			}
		}
		if (flag==1){System.out.println("------removed---");}
		else{System.out.println("-----Can Not Removed---");}
	}
	public void showFacilities()
	{
		for(int i=0;i<facilities.length;i++)
		{
			if (facilities[i]!=null)
			{
				System.out.println("\n*****************");
				System.out.println("Facility Name: "+facilities[i].getFaciName());
				System.out.println("Cost : "+facilities[i].getCost());

			}
			}}

	public Facility getFacility(String faciName)
	{
		Facility f = null;
		
		for(int i=0; i<facilities.length; i++)
		{
			if(facilities[i] != null)
			{
				if(facilities[i].getFaciName() == faciName)
				{
					f= facilities[i];
					break;
				}
			}
		}
		if(f != null)
		{
			System.out.println("Facility Found");
		}
		else
		{
			System.out.println("Faciltiy Not Found");
		}
		return f;
	}
	

	public void addLab(Lab l)
	{
		
		int flag=0;
		for(int i=0;i<labs.length;i++)
		{
			if(labs[i]==null)
			{
				labs[i]=l;
				flag=1;
				break;
			}
		}
		if (flag==1){System.out.println("------Inserted---");}
		else{System.out.println("-----Can Not Inserted---");}
	}
	public void removeLab(Lab l)
	{
		int flag=0;
		for(int i=0;i<labs.length;i++)
		{
			if(labs[i]==l)
			{
				labs[i]=null;
				flag=1;
				break;
			}
		}
		if (flag==1){System.out.println("------removed---");}
		else{System.out.println("-----Can Not Removed---");}
	}
	public void showLabs()
	{
		for(int i=0;i<labs.length;i++)
		{
			if (labs[i]!=null)
			{
				System.out.println("\n*****************");
				System.out.println("Lab Name: "+labs[i].getLabName());
				System.out.println("Cost : "+labs[i].getCost());

			}
			}}

	public Lab getLab(String labName)
	{
		Lab l = null;
		
		for(int i=0; i<labs.length; i++)
		{
			if(labs[i] != null)
			{
				if(labs[i].getLabName() == labName)
				{
					l= labs[i];
					break;
				}
			}
		}
		if(l != null)
		{
			System.out.println("Lab Found");
		}
		else
		{
			System.out.println("Lab Not Found");
		}
		return l;
	}
	
	public void addMedicine(Medicine m)
	{
		
		int flag=0;
		for(int i=0;i<medicines.length;i++)
		{
			if(medicines[i]==null)
			{
				medicines[i]=m;
				flag=1;
				break;
			}
		}
		if (flag==1){System.out.println("------Inserted---");}
		else{System.out.println("-----Can Not Inserted---");}
	}
	public void removeMedicine(Medicine m)
	{
		int flag=0;
		for(int i=0;i<medicines.length;i++)
		{
			if(medicines[i]==m)
			{
				medicines[i]=null;
				flag=1;
				break;
			}
		}
		if (flag==1){System.out.println("------removed---");}
		else{System.out.println("-----Can Not Removed---");}
	}
	public void showMedicines()
	{
		for(int i=0;i<medicines.length;i++)
		{
			if (medicines[i]!=null)
			{
				System.out.println("\n*****************");
				System.out.println("Medicine Name: "+medicines[i].getMedName());
				System.out.println("Medicine Company: "+medicines[i].getCompName());
				System.out.println("Expire Date: "+medicines[i].getExpireDate());
				System.out.println("Medicine Quantity: "+medicines[i].getQuantities());
				System.out.println("Cost : "+medicines[i].getMedCost());

			}
			}}

	public Medicine getMedicine(String medName)
	{
		Medicine m = null;
		
		for(int i=0; i<medicines.length; i++)
		{
			if(medicines[i] != null)
			{
				if(medicines[i].getMedName() == medName)
				{
					m= medicines[i];
					break;
				}
			}
		}
		if(m != null)
		{
			System.out.println("Medicine Found");
		}
		else
		{
			System.out.println("Medicine Not Found");
		}
		return m;
	}
}
		






