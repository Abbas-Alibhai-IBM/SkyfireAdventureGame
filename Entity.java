/**
  * The class Entity is the superclass that contains methods and variables of all players and enemies in this game.
  *
  * @author Abbas Alibhai
  **/
public class Entity
{
    // instance variables
    private int health;
    private int defense;
    private int attack;
    private int confuse;
    private int Level;
    
    // constructor
    public Entity() {
        // initialisation of instance variables
        health = 100;
        defense = 1;
        attack = 1;
        confuse = 1;
        Level = 15;
    }
    
    // getters
    public int getHealth(){
        return health;
    }
    
    public int getDefense(){
        return defense;
    }
    
    public int getAttack(){
        return attack;
    }
    
    public int getConfuse(){
        return confuse;
    }
    
    public int getLevel(){
        return Level;
    }
    
    public String getName(){
        return "";
    }
    
    public boolean getEvilBoss(){
        return false;
    }
    
    public String getEnemyName(){
        return "";
    }
    
    // setters
    public void setHealth(int health){
        this.health = health;
    }
    
    public void setLevel(int lvl){
        if (lvl < 0){
            this.Level = 0;
        }
        else {
            this.Level = lvl;
        }
    }
    
    public void setName(String name){
        System.out.println("No name");
    }
    
    public void setEvilBoss(boolean evilBoss){
        System.out.println("No evilBoss");
    }
    
    public void setEnemyName(String enemyName){
        System.out.println("No enemyName");
    }
      
    // methods
    public void changeHealth(int health){
        this.health -= health;
        if (this.health < 0){
            this.health = 0;
        }
    }
    
    public void changeLevel(int lvl){
        this.Level += lvl;
    }
    
    public int randomSpell(){
        return 0;
    }
}