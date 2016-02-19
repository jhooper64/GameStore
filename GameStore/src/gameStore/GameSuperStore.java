package gameStore;


public class GameSuperStore 
{
	private static final String StoreName = "GamesRUs";
	private String familyname;
	private String adventurename;
	private String actionname;
	private String rpgname;
	
	GameSuperStore()
	{
		familyname = "unknown";
		adventurename = "unknown";
		actionname = "unknown";
		rpgname = "unknown";
	}
	public String getStoreName()
	{
		return (StoreName);
	}
	public String getfamilyname()
	{
		return (familyname);
	}
	public String getadventurename()
	{
		return (adventurename);
	}
	public String getactionname()
	{
		return (actionname);
	}
	public String getrpgname()
	{
		return (rpgname);
	}
				
	
}
