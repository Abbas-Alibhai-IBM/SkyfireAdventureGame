/**
  * The class Wizard is the subclass of Entity wthat contains methods and variables only for the player.
  *
  * @author Abbas Alibhai
  **/
public class Wizard extends Entity
{
    // instance variables
    private String name;
    
    // constructor
    public Wizard(String name)
    {
        // initialisation of instance variables
        this.name = name;
        setLevel(20);
    }
    
    // getters
    public String getName(){
        return name;
    }
    
    // setters
    public void setName(String name){
        this.name = name;
    }
    
    // methods
}