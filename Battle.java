/**
  * The class Battle is the subclass of Rounds that contains methods and variables of all the battles in the game.
  *
  * @author Abbas Alibhai
  **/
public class Battle extends Rounds
{
    // instance variables
    private String playerRoll;
    private String opponentRoll;
    private int lvlPlayer;
    private int lvlOpponent;

    // constructor
    public Battle(int playerRoll, int opponentRoll, int lvlPlayer, int lvlOpponent, int playerHealth, int opponentHealth)
    {
        // initialisation of instance variables
        /**
          * Defense = 1
          * Attack = 2
          * Confuse = 3

          * Defense beats Attack
          * Attack beats Confuse
          * Confuse beats Defense
          **/
        
        super(playerHealth, opponentHealth);
        if (playerRoll == 1){
            this.playerRoll = "Defense";
        }

        else if (playerRoll == 2){
            this.playerRoll = "Attack";
        }

        else{
            this.playerRoll = "Confuse";
        }
        if (opponentRoll == 1){
            this.opponentRoll = "Defense";
        }

        else if (opponentRoll == 2){
            this.opponentRoll = "Attack";
        }

        else{
            this.opponentRoll = "Confuse";
        }
        this.lvlPlayer = lvlPlayer;
        this.lvlOpponent = lvlOpponent;
    }
    
    // getters
    public String getPlayerRoll(){
        return playerRoll;
    }
    
    public String getOpponentRoll(){
        return opponentRoll;
    }
    
    public int getLvlPlayer(){
        return lvlPlayer;
    }
    
    public int getLvlOpponent(){
        return lvlOpponent;
    }
    
    // setters
    public void setPlayerRoll(String playerRoll)
    {
        this.playerRoll = playerRoll;
    }
    
    public void setOpponentRoll(String opponentRoll){
        this.opponentRoll = opponentRoll;
    }
    
    public void setLvlPlayer(int lvlPlayer){
        this.lvlPlayer = lvlPlayer;
    }
    
    public void setLvlOpponent(int lvlOpponent){
        this.lvlOpponent = lvlOpponent;
    }
    
    // methods
    public boolean battlePlay()
    {
        // Player Wins
        if (playerRoll == "Defense" && opponentRoll == "Attack"){
            if ((lvlPlayer * 1.5) < lvlOpponent){
                return false;
            }
            else {
                return true;
            }
        }

        else if (playerRoll == "Attack" && opponentRoll == "Confuse"){
            if ((lvlPlayer * 1.5) < lvlOpponent){
                return false;
            }
            else {
                return true;
            }
        }

        else if (playerRoll == "Confuse" && opponentRoll == "Defense"){
            if ((lvlPlayer * 1.5) < lvlOpponent){
                return false;
            }
            else {
                return true;
            }
        }

        // Enemy Wins
        else if (opponentRoll == "Defense" && playerRoll == "Attack"){
            if ((lvlOpponent * 1.5) <= lvlPlayer){
                return true;
            }
            else {
                return false;
            }
        }

        else if (opponentRoll == "Attack" && playerRoll == "Confuse"){
            if ((lvlOpponent * 1.5) <= lvlPlayer){
                return true;
            }
            else {
                return false;
            }
        }

        else if (opponentRoll == "Confuse" && playerRoll == "Defense"){
            if ((lvlOpponent * 1.5) <= lvlPlayer){
                return true;
            }
            else {
                return false;
            }
        }
        
        // Nobody Wins
        else if (opponentRoll == "Defense" && playerRoll == "Defense"){
            if (lvlPlayer >= lvlOpponent){
                return true;
            }
            else {
                return false;
            }
        }

        else if (opponentRoll == "Attack" && playerRoll == "Attack"){
            if (lvlPlayer >= lvlOpponent){
                return true;
            }
            else {
                return false;
            }
        }

        else{
            if (lvlPlayer >= lvlOpponent){
                return true;
            }
            else {
                return false;
            }
        }
    }
}