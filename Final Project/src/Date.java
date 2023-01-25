import java.time.*;
public class Date 
{
	private Partners couple;
	private LocalDate dateDate;
	private String location;
	public Date(Partners c, LocalDate date, String loc)
	{
		couple = c;
		dateDate = date;
		location = loc;
	}
    public Partners getCouple()
    {
    	return couple;
    }
    public LocalDate getDateDate()
    {
    	return dateDate;
    }
    public String getLocation()
    {
    	return location;
    }
}
