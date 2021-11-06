/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enemy extends Entity
{
    // instance variables
    private boolean evilBoss;
    private String enemyName;

    // constructor
    public Enemy()
    {
        // initialisation of instance variables
        this.evilBoss = false;
    }
    
    // getters
    public boolean getEvilBoss(){
        return evilBoss;
    }
    
    public String getEnemyName(){
        return enemyName;
    }        
    
    // setters
    public void setEvilBoss(boolean evilBoss){
        this.evilBoss = evilBoss;
    }
    
    public void setEnemyName(String enemyName){
        this.enemyName = enemyName;
    }
    
    // methods
    public int randomSpell(){
        return 3;
    }
}
