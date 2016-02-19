package gameStore;


public class PlatformXBox extends GameSuperStore
{
	private String familyname;
	private String adventurename;
	private String actionname;
	private String rpgname;
	private double xfamilycost;
	private double xadventurecost;
	private double xactioncost;
	private double xrpgcost;
	
	PlatformXBox()
	{
		PlatformXBox xbox = new PlatformXBox(); 
		
		familyname = "LEGO Jurassic World";
		xfamilycost = 29.99;
		adventurename = "The Witcher 3: Wild Hunt";
		xadventurecost = 40.99;
		actionname = "Far Cry 4";
		xactioncost = 26.99;
		rpgname = "Fallout 4";
		xrpgcost = 49.99;
	}
		@Override
		
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
		public String rpgname()
		{
			return (rpgname);
		}
		
	
}
