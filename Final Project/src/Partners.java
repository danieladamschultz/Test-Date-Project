import java.time.*;
public class Partners 
{
	private People partner1;
	private People partner2;
	public Partners(People gf, People bf)
	{
		partner1 = gf;
		partner2 = bf;
	}
	
	public People getGirlfriend()
	{
		return partner1;
	}
	public People getBoyfriend()
	{
		return partner2;
	}
}
