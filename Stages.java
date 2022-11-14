import java.util.Scanner;
/**
  * The class Stages is the superclass that contains methods and variables of all the stages in the game.
  *
  * @author Abbas Alibhai
  **/
public class Stages
{
    // instance variables
    private boolean complete;
    
    // constructor
    public Stages()
    {
        // initialisation of instance variables
        complete = false;
    }
    
    // getters
    public boolean getComplete(){
        return complete;
    }
    
    // setters
    public void setComplete(boolean finished){
        this.complete = finished;
    }  
    
    // methods
    public int enterDungeon(int playerCurrentHealth,int enemyCurrentHealth,int playerCurrentLevel,int enemyCurrentLevel,String vName,String enemyName)
    {
        Rounds [] Round = new Rounds[100];
        final int lose = 20;
        
        Entity tempWizard = new Wizard("");
        tempWizard.setHealth(playerCurrentHealth);
        tempWizard.setLevel(playerCurrentLevel);
        
        Entity Enemy = new Common();
        Enemy.setHealth(enemyCurrentHealth);
        Enemy.setLevel(enemyCurrentLevel);
        Enemy.setEvilBoss(false);
        Enemy.setEnemyName(enemyName);
          
        for (int i = 0; i < 100; i++) {
            System.out.println("---------------- BATTLE OF " + vName + ": ROUND " + (i+1) + " ----------------");
            
            System.out.println("Your HEALTH is " + tempWizard.getHealth() + ".");
            
            System.out.println("The " + Enemy.getEnemyName() + "'s HEALTH is " + Enemy.getHealth() + ".");
            
            if (Enemy.getEvilBoss() == false){
                System.out.println("This is a COMMON enemy");
            }
            else {
                System.out.println("This is a BOSS enemy");
            }
            
            int enemySpell = Enemy.randomSpell();
            int playerSpell = inputInt("What spell would you like to choose?\n [1]: Defense Spell\n [2]: Attack Spell\n [3]: Confuse Spell");
                           
            Round[i] = new Battle(playerSpell,enemySpell,tempWizard.getLevel(),Enemy.getLevel(),tempWizard.getHealth(),Enemy.getHealth());
            System.out.println("\nYou cast the " + Round[i].getPlayerRoll() + " spell and your LEVEL is worth " + tempWizard.getLevel() + ".");
            System.out.println("The " + Enemy.getEnemyName() + " cast the " + Round[i].getOpponentRoll() + " spell and his LEVEL is worth " + Enemy.getLevel() + ".\n");
            if (Round[i].battlePlay() == true){
                Enemy.changeHealth(lose);
                System.out.println("You beat the " + Enemy.getEnemyName() + " in this round.");
            }
            else {
                tempWizard.changeHealth(lose);
                System.out.println("The " + Enemy.getEnemyName() + " beat you in this round.");
            }
            
            if (tempWizard.getHealth() == 0){
                System.out.println("Your HEALTH is " + tempWizard.getHealth() + ".");
                System.out.println("The " + Enemy.getEnemyName() + "'s HEALTH is " + Enemy.getHealth() + ".\n");
                System.out.println("The " + Enemy.getEnemyName() + " defeated you!");
                System.out.println("GAME OVER!!!");
                System.out.println("");
                System.out.println("-------- YOUR STATS: --------");
                System.out.println("Your LEVEL at death was: " + tempWizard.getLevel());
                if (vName == "TARNSTEAD"){
                    System.out.println("You reached Stage 1.");
                    System.out.println("You saved 0 villages and defeated 0 of THE NECROMANCER's minions.");
                    System.out.println("You tried your best though...");
                }
                else if (vName == "IRAGORN"){
                    System.out.println("You reached Stage 2.");
                    System.out.println("You saved 1 village and defeated 1 of THE NECROMANCER's minions.");
                    System.out.println("The TARNSTEAD VILLAGE thanks you for saving them and for your sacrifice.");
                }
                else if (vName == "BECKINSDALE"){
                    System.out.println("You reached Stage 3.");
                    System.out.println("You saved 2 villages and defeated 2 of THE NECROMANCER's minions.");
                    System.out.println("The TARNSTEAD VILLAGE and IRAGORN VILLAGE thank you for saving them and for your sacrifice.");
                }
                else if (vName == "MEADSVILLE"){
                    System.out.println("You reached Stage 4.");
                    System.out.println("You saved 3 villages and defeated 3 of THE NECROMANCER's minions.");
                    System.out.println("The TARNSTEAD VILLAGE, IRAGORN VILLAGE and BECKINSDALE VILLAGE thank you for saving them and for your" + 
                    " sacrifice.");
                }
                else if (vName == "DARK HALLOWS"){
                    System.out.println("You reached Stage 5.");
                    System.out.println("You saved 4 villages and defeated 4 of THE NECROMANCER's minions.");
                    System.out.println("The TARNSTEAD VILLAGE, IRAGORN VILLAGE, BECKINSDALE VILLAGE and MEADSVILLE VILLAGE thank you for saving" +
                    " them and for your sacrifice.");
                }
                System.exit(0);
            }
            
            if(Enemy.getHealth() == 0){
                System.out.println("Your HEALTH is " + tempWizard.getHealth() + ".");
                System.out.println("The " + Enemy.getEnemyName() + "'s HEALTH is " + Enemy.getHealth() + ".\n");
                System.out.println("You defeated the " + Enemy.getEnemyName() + "!");
                if (vName != "DARK HALLOWS"){
                    System.out.println("You find the villagers and set them free from the Dungeon!");
                }
                break;
            }
        }
        return tempWizard.getHealth();
    }
    
    public int faceNecromancer(int playerCurrentHealth, int playerCurrentLevel, String vName)
    {
        Rounds [] Round = new Rounds[100];
        final int lose = 20;
        boolean secret = false;
        
        Entity tempWizard = new Wizard("");
        tempWizard.setHealth(playerCurrentHealth);
        tempWizard.setLevel(playerCurrentLevel);
        
        Entity Necromancer = new Necromancer();
        Necromancer.setLevel(100);
        Necromancer.setEvilBoss(true);
        Necromancer.setEnemyName("NECROMANCER");
        for (int i = 0; i < 100; i++) {
            System.out.println("---------------- BATTLE OF THE " + vName + ": ROUND " + (i+1) + " ----------------");
            
            System.out.println("Your HEALTH is " + tempWizard.getHealth() + ".");
            
            System.out.println("THE " + Necromancer.getEnemyName() + "'s HEALTH is " + Necromancer.getHealth() + ".");
            
            if (Necromancer.getEvilBoss() == false){
                System.out.println("This is a COMMON enemy");
            }
            else {
                System.out.println("This is a BOSS enemy");
            }
            
            int necroSpell = Necromancer.randomSpell();
            int playerSpell = inputInt("What spell would you like to choose?\n [1]: Defense Spell\n [2]: Attack Spell\n [3]: Confuse Spell");
                           
            Round[i] = new Battle(playerSpell,necroSpell,tempWizard.getLevel(),Necromancer.getLevel(),tempWizard.getHealth(),Necromancer.getHealth());
            System.out.println("\nYou cast the " + Round[i].getPlayerRoll() + " spell and your LEVEL is worth " + tempWizard.getLevel() + ".");
            System.out.println("THE " + Necromancer.getEnemyName() + " cast the " + Round[i].getOpponentRoll() + " spell and his LEVEL is worth " + Necromancer.getLevel() + ".\n");
            if (Round[i].battlePlay() == true){
                System.out.println("You beat THE " + Necromancer.getEnemyName() + " in this round.");
                Necromancer.changeHealth(lose);
            }
            else {
                System.out.println("THE " + Necromancer.getEnemyName() + " beat you in this round.");
                tempWizard.changeHealth(lose);
            }
            
            if (tempWizard.getHealth() == 0){
                System.out.println("Your HEALTH is " + tempWizard.getHealth() + ".");
                System.out.println("THE " + Necromancer.getEnemyName() + "'s HEALTH is now " + Necromancer.getHealth() + ".\n");
                System.out.println("THE " + Necromancer.getEnemyName() + " defeated you!");
                System.out.println("The TARNSTEAD VILLAGE, IRAGORN VILLAGE, BECKINSDALE VILLAGE and MEADSVILLE VILLAGE thank you for saving" +
                " them and for your sacrifice.");
                System.out.println("GAME OVER!!!");
                System.out.println("");
                System.out.println("-------- YOUR STATS: --------");
                System.out.println("Your LEVEL at death was: " + tempWizard.getLevel());
                System.out.println("You reached Stage 6.");
                System.out.println("You saved 4 villages and defeated 5 of The Necromancer's minions.");
                System.exit(0);
            }
            
            if (secret == false){
                System.out.println("Your HEALTH is " + tempWizard.getHealth() + ".");
                System.out.println("THE " + Necromancer.getEnemyName() + "'s HEALTH is now " + Necromancer.getHealth() + ".\n");
                int secretWeapon = inputInt("Would like to use your secret weapon? You can only use it once in this battle.\n [1]: Yes, let's " + 
                "use it now\n [2]: Maybe later");
                if (secretWeapon == 1){
                    System.out.println("You initiate your secret weapon.");
                    System.out.println("You shout 'NOWWWW!' and all the villagers shoot arrows from their hidden locations in the fortress.");
                    System.out.println("Most of the arrows hit the THE " + Necromancer.getEnemyName() + " and it hurts him quite a bit.");
                    Necromancer.changeHealth(40);
                    secret = true;
                }
            }
            
            if(Necromancer.getHealth() <= 0){
                System.out.println("Your HEALTH is " + tempWizard.getHealth() + ".");
                System.out.println("THE " + Necromancer.getEnemyName() + "'s HEALTH is now 0.\n");
                System.out.println("You defeated THE " + Necromancer.getEnemyName() + "!");
                System.out.println("The TARNSTEAD VILLAGE, IRAGORN VILLAGE, BECKINSDALE VILLAGE and MEADSVILLE VILLAGE thank you for saving them.");
                System.out.println("All of Skyfire thanks you for keeping their land free of EVIL!");
                System.out.println("THE END!!!");
                System.out.println("");
                System.out.println(titleMaker(""));
                System.out.println("-------- YOUR STATS: --------");
                System.out.println("Your HEALTH in the end was: " + tempWizard.getHealth());
                System.out.println("Your LEVEL in the end was: " + tempWizard.getLevel());
                System.out.println("You completed all 6 stages in the game!");
                System.out.println("You saved 4 villages, defeated 5 of The Necromancer's minions and defeated The Necromancer.");
                System.out.println("");
                System.out.println(titleMaker("skyfire will return..."));
                System.exit(0);
            }
        }
        return tempWizard.getHealth();
    }
    
    public String inputString(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String answer = scanner.nextLine();
        return answer;
    }
    
    public int inputInt(String message)
    {
        String answer = inputString(message);
        return Integer.parseInt(answer);
    }

    public String titleMaker(String text){
        String name = "";
        int number = (text.length() + 2);
        for (int i = 0; i < ((96-number)/2); i++) {
            name += "-";
        }
        if (text.length() == 0) {
            name += "--";
        } else {
            name += " ";
            name += text;
            name += " ";
        }
        for (int i = 0; i < ((96-number)/2); i++) {
            name += "-";
        }
        return name;
    }
}
}