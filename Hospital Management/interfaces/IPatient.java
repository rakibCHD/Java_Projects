package interfaces;

import java.lang.*;
import classes.*;

public interface IPatient
{
	void addPatient(Patient p);
	void removePatient(Patient p);
	Patient getPatient(int patientId);
	void showPatients();
}