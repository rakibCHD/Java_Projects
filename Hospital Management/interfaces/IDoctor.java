package interfaces;

import java.lang.*;
import classes.*;

public interface IDoctor
{
	
    void addDoctor(Doctor d);
	void removeDoctor(Doctor d);
	Doctor getDoctor(int docId);
	void showDoctors();

}