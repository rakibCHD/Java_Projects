package interfaces;

import java.lang.*;
import classes.*;

public interface IMedicine
{
	
    void addMedicine(Medicine m);
	void removeMedicine(Medicine m);
	Medicine getMedicine(String mediName );
	void showMedicines();

}