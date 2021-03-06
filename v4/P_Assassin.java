//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14

public class P_Assassin extends Protagonist
{	  

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Assassin()
    {
	super();
	_hitPts = 135; //base:125
	_strength = 140; //base:100
	_defense = 35;	//base:40
	_attack = .5; //base:.4
    }

    //prepare an Assassin for a special attack
    public void specialize()
    {
	_attack = .85;
	_defense = 15;
    }


    //revert to normal mode
    public void normalize()
    {
	_attack = .5;
	_defense = 35;
    }
    
    /*=============================================
      about(): returns a description of the Assassin class
      =============================================*/
    public String about()
    {
	String str = "Denizens of nightfall, the ASSASSIN class harbors increased strength and attack stats, excelling at stealth attacks and close-range combat.";
	return str;
    }
	
}//end class P_Assassin
