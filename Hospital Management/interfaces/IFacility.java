package interfaces;

import java.lang.*;
import classes.*;

public interface IFacility
{
	
    void addFacility(Facility f);
	void removeFacility(Facility f);
	Facility getFacility(String faciName );
	void showFacilities();

}