/**
  * The class Rounds is the superclass that contains methods and variables of all the rounds of the battles in the game.
  *
  * @author Abbas Alibhai
  **/
public class Rounds
{
    // instance variables
    private int playerHealth;
    private int opponentHealth;

    // constructor
    public Rounds(int player, int opponent)
    {
        // initialisation of instance variables
        this.playerHealth = player;
        this.opponentHealth = opponent;
    }

    // getters
    public int getPlayerHealth()
    {
        return playerHealth;
    }
    
    public int getOpponentHealth()
    {
        return opponentHealth;
    }
    
    public String getPlayerRoll(){
        return "";
    }
    
    public String getOpponentRoll(){
        return "";
    }
    
    // setters
    public void setPlayerHealth(int playerHealth)
    {
        this.playerHealth = playerHealth;
    }
    
    public void setOpponentHealth(int opponentHealth)
    {
        this.opponentHealth = opponentHealth;
    }
    
    public void setPlayerRoll()
    {
        System.out.println("");
    }
    
    public void setOpponentRoll(){
        System.out.println("");
    }
    
    // methods
    public boolean battlePlay()
    {
        return true;
    }
}