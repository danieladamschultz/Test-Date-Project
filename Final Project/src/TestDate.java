import java.time.LocalDate;
public class TestDate {

	public static void main(String[] args) 
	{
		LocalDate date1 = LocalDate.of(2020, 3, 9);
		LocalDate date2 = LocalDate.of(2019, 2, 24);
		LocalDate date3 = LocalDate.of(1962, 8, 28);
		LocalDate date4 = LocalDate.of(1985, 5, 13);
		LocalDate date5 = LocalDate.of(1970, 1, 11);
		LocalDate date6 = LocalDate.of(2000, 3, 16);
		People partner1 = new People("Corinne", "Chase", date1);
		People partner1a = new People("Daniel", "Schultz", date2);
		People partner2 = new People("Marie", "Smith", date3);
		People partner2a = new People ("Mike", "Steele", date4);
		Partners couple1 = new Partners(partner1, partner1a);
		Partners couple2 = new Partners(partner2, partner2a);
		Date Date1 = new Date(couple1, date5, "Dinner");
		Date Date2 = new Date(couple2, date6, "Coffee");
		displayDateDetails(Date1);
		displayDateDetails(Date2);
	}
	public static void displayDateDetails(Date w )
	{
		Partners couple = w.getCouple();
		LocalDate dateDate = w.getDateDate();
		String location = w.getLocation();
		People Girlfriend = couple.getGirlfriend();
		People BoyFriend = couple.getBoyfriend();
		String firstGirlfriend = Girlfriend.getFirstName();
		String lastgirlfriend = Girlfriend.getLastName();
		LocalDate girlfriendBDate = Girlfriend.getBirthDate();
		String firstBoyfriend = BoyFriend.getFirstName();
		String lastBoyfriend = BoyFriend.getLastName();
		LocalDate boyfriendBDate = BoyFriend.getBirthDate();
		System.out.println("Their first date was: " + "\n" + lastgirlfriend + "/" + lastBoyfriend + " Date" + "\n" + "They had a great time!");
		System.out.println("Date: " + dateDate + "  Location: " +
		      location);
		System.out.println("Girlfriend: " + firstGirlfriend +
		   " " + lastgirlfriend + " " +girlfriendBDate);
		System.out.println("Boyfriend: " + firstBoyfriend +
		   " " + lastBoyfriend + " " + boyfriendBDate);
	}
}	
		

	


