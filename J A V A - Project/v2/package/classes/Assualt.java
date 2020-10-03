package classes;
import java.lang.*;
import java.io.*;

public class Assualt {
	private String primary;
	private String secondary;
	private String gadget;
	
	public String getPrimary() {
		return primary;
	}
	public void setPrimary(String primary) {
		this.primary = primary;
	}
	public String getSecondary() {
		return secondary;
	}
	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}
	public String getGadget() {
		return gadget;
	}

	public void setGadget() {
		setGadget();
	}

	public void setGadget(String gadget) {
		this.gadget = gadget;
	}
	
	public Assualt()
	{
		
	}
	public Assualt(String primary, String secondary, String gadget) {
		
		this.primary = primary;
		this.secondary = secondary;
		this.gadget = gadget;
	}
	
	public void showAssualt()
	{	
		System.out.println("");
		System.out.println("              ################");
		System.out.println("              # Your Loadout #");
		System.out.println("##############################################");
		System.out.println("##  Primary weapon   : " + primary);
		System.out.println("##  Secondary weapon : " + secondary);
		System.out.println("##  Gadget           : " + gadget);
		System.out.println("##############################################");
	}
	
	
	
	
	

}
