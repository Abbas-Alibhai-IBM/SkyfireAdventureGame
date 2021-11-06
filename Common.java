import java.util.Random;
/**
  * The class Warlock is the subclass of Enemy that contains methods and variables only for the common enemies in the game.
  *
  * @author Abbas Alibhai
  **/
public class Common extends Enemy
{
    // instance variables
    private int spell;
    
    // constructor
    public Common()
    {
        // initialisation of instance variables
        this.spell = 0;
    }
    
    // getters
    public int getSpell(){
        return spell;
    }
    
    // setters
    public void setName(int spell){
        this.spell = spell;
    }
    
    // methods
    public int randomSpell(){
        Random rand = new Random();
        this.spell = rand.nextInt(3) + 1;
        return spell;
    }
}