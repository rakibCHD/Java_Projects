package interfaces;

import java.lang.*;
import classes.*;

public interface ILab
{
	
    void addLab(Lab l);
	void removeLab(Lab l);
	Lab getLab(String labName );
	void showLabs();

}