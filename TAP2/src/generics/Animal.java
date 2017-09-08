package generics;

/**
 * @author Pedro Garc�a 
 *
 */
public class Animal 
{
	protected int legs;
	private int eyes;
	
	
	public Animal(int legs, int ojos)
	{
		this.legs = legs;
		this.eyes = ojos;
		
	}
	
	public <T> T getThing(T bicho){
		return bicho;
	}
	
	public void setLegs(int legs)
	{
		this.legs = legs;
	}
	
	public int getLegs()
	{
		return legs;
		
	}
	
	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}
	
	public int getEyes()
	{
		return eyes;
		
	}
	
	public String talk()
	{ 
	 	return "Soy un animal"; 
	} 


	
}
