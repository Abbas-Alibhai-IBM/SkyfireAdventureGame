import java.util.Random;
/**
  * The class Necromancer is the subclass of Enemy that contains methods and variables only for the final boss enemy in the game.
  *
  * @author Abbas Alibhai
  **/
public class Necromancer extends Enemy
{
    // instance variables
    private int spell;
    
    // constructor
    public Necromancer()
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