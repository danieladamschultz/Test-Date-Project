import java.time.*;
public class People 
{
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	public People(String first, String last, LocalDate date)
	{
		firstName = first;
		lastName = last;
		birthDate = date;
	}
    
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public LocalDate getBirthDate()
	{
		return birthDate;
	}
}
