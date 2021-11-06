import java.util.Random;
/**
  * The class DiceOfDestiny is the class that contains methods and variables of random level dice plays in the game.
  *
  * @author Abbas Alibhai
  **/
public class DiceOfDestiny
{
    // instance variables
    private boolean addsubtract;
    private int levelworth;
    private int max;
    
    // constructor
    public DiceOfDestiny()
    {
        // initialisation of instance variables
        Random rand1 = new Random();
        int current = rand1.nextInt(2);
        if (current == 0) {
            this.addsubtract = true;
        }
        else {
            this.addsubtract = false;
        }
    }
    
    // getters
    public boolean getAddSubtract(){
        return addsubtract;
    }
    
    public int getLevelworth(){
        return levelworth;
    }
    
    public int getMax(){
        return max;
    }
    
    // setters
    public void setAddSubtract(boolean addsubtract)
    {
        this.addsubtract = addsubtract;
    }
    
    public void setLevelworth(int levelworth){
        this.levelworth = levelworth;
    }
    
    public void setMax(int max){
        this.max = max;
    }
    
    // methods
    public int randomLevel(int lvl){
        Random rand2 = new Random();
        this.levelworth = rand2.nextInt(10) + 1;
        if (addsubtract == true){
            lvl += levelworth;
        }
        else {
            lvl -= levelworth;
        }
        if (lvl > 120){
            return 120;
        }
        else if (lvl < 20){
            return 10;
        }
        else{
            return lvl;
        }
    }
}