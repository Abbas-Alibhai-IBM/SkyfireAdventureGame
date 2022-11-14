import java.util.Scanner;
/**
  * The class Game is the superclass where the core structure of the game and its methods and variables are located.
  *
  * @author Abbas Alibhai
  **/
public class Game
{
    // methods
    public String intro()
    {   
        
        System.out.println(titleMaker(""));
        System.out.println(titleMaker("WELCOME TO SKYFIRE"));
        System.out.println(titleMaker(""));
        String name = inputString("What is your name, fellow Wizard?");
        Entity tempWizard = new Wizard(name);
        tempWizard.setName(name);
        System.out.println("We've heard of your power through many legends, " + tempWizard.getName() + ".");
        System.out.println("We are so glad you came. Welcome to the realm of SKYFIRE!");
        System.out.println("An evil presence by the name of THE NECROMANCER has plagued our land."); 
        System.out.println("THE NECROMANCER has attacked several VILLAGES and colonized the BLACK HALLOWS FORTRESS.");
        System.out.println("Currently, his minions are keeping the villagers hostage in each village's DUNGEON.");
        System.out.println("We hope you will be able to save our villagers and defeat THE NECROMANCER.");
        System.out.println(titleMaker(""));
        return name;
    }
            
    public void howToPlay()
    {
        System.out.println("HOW TO PLAY SKYFIRE:");
        System.out.println("First, you are supposed to free all hostages in the 4 villages.");
        System.out.println("Only then, you can go to the fortress and defeat THE NECROMANCER.\n");
        System.out.println("In battles, you and your opponent choose 1 out of 3 spells to defeat the other."); 
        System.out.println("The DEFENSE spell beats the ATTACK spell.");
        System.out.println("The ATTACK spell beats the CONFUSE spell.");
        System.out.println("The CONFUSE spell beats the DEFENSE spell.");
        System.out.println("If you both pick the same spell, the person with the higher LEVEL wins.");
        System.out.println("If one of you has a very high LEVEL, they could win the round even if you pick the wrong spell.");
        System.out.println("As you win battles, your LEVEL increases.");
        System.out.println("If you lose battles, your HEALTH decreases.\n");
        System.out.println("In every village, you can roll the DICE OF DESTINY, which could increase or decrease your LEVEL.");
        System.out.println("The minimum LEVEL you can have is 10 and the maximum LEVEL you can have is 120.");
        System.out.println("You can only run the DICE OF DESTINY 3 times in each village.\n");
        System.out.println("If your HEALTH reaches 0, GAME OVER!");
        System.out.println("");
        System.out.println("Good Luck and Have Fun saving SKYFIRE!");
        System.out.println(titleMaker(""));
        System.out.println("");
    }
            
    public void Game(String name)
    {
        Entity Player = new Wizard(name);
        int current = 0;
                
        // Stage 1 - THE TARNSTEAD VILLAGE
        Stages village1 = new Stages();
        System.out.println(titleMaker("STAGE 1"));
        String v1Name = "TARNSTEAD";
        System.out.println("You have entered " + v1Name + " VILLAGE.");
        System.out.println("");                
        while (village1.getComplete() == false){
            System.out.println("");
            System.out.println("NAME: " + name);
            System.out.println("HEALTH: " + Player.getHealth());
            System.out.println("LEVEL: " + Player.getLevel());
            System.out.println("You are in: " + v1Name + " VILLAGE");
            System.out.println("");
            int temp1 = inputInt("What would you like to do?\n [1]: Roll the DICE OF DESTINY\n [2]: Enter the DUNGEON \n [3]: Quit the game");
            if (temp1 == 1){
                DiceOfDestiny Dice1 = new DiceOfDestiny();
                if(current !=3){
                    Player.setLevel(Dice1.randomLevel(Player.getLevel()));
                    current += 1;
                    System.out.println("Your LEVEL is now " + Player.getLevel());
                }
                else {
                    System.out.println("You have already rolled the Dice of Destiny 3 times in this village.");
                    System.out.println("Your LEVEL is still " + Player.getLevel());
                }
            }
                    
            if (temp1 == 2){
                Player.setHealth(village1.enterDungeon(Player.getHealth(),20,Player.getLevel(),15, v1Name, "ORC"));
                System.out.println("You have been awarded +15 LEVEL by the villagers for saving them!");
                Player.changeLevel(15);
                break;
            }
                    
            if (temp1 == 3){
                System.exit(0);
            }
                
        }
        System.out.println(titleMaker(""));
        System.out.println("");
        
        // Stage 2 - THE IRAGORN VILLAGE
        Stages village2 = new Stages();        
        System.out.println(titleMaker("STAGE 2"));
        String v2Name = "IRAGORN";
        System.out.println("You have entered " + v2Name + " VILLAGE.");
        System.out.println("");     
        current = 0;
        while (village2.getComplete() == false){
            System.out.println("");   
            System.out.println("NAME: " + name);
            System.out.println("HEALTH: " + Player.getHealth());
            System.out.println("LEVEL: " + Player.getLevel());
            System.out.println("You are in: IRAGORN VILLAGE");
            System.out.println("");
            int temp2 = inputInt("What would you like to do?\n [1]: Roll the DICE OF DESTINY\n [2]: Enter the DUNGEON \n [3]: Quit the game");
            if (temp2 == 1){
                DiceOfDestiny Dice2 = new DiceOfDestiny();
                if(current !=3){
                    Player.setLevel(Dice2.randomLevel(Player.getLevel()));
                    current += 1;
                    System.out.println("Your LEVEL is now " + Player.getLevel());
                }
                else {
                    System.out.println("You have already rolled the Dice of Destiny 3 times in this village.");
                    System.out.println("Your LEVEL is still " + Player.getLevel());
                }
            }
                    
            if (temp2 == 2){
                Player.setHealth(village2.enterDungeon(Player.getHealth(),40,Player.getLevel(),30, v2Name, "SORCERESS"));
                System.out.println("You have been awarded +15 LEVEL by the villagers for saving them!");
                Player.changeLevel(15);
                break;
            }
                    
            if (temp2 == 3){
                System.exit(0);
            }
                
        }
        System.out.println(titleMaker(""));
        System.out.println("");
        
        // Stage 3 - THE BECKINSDALE VILLAGE
        Stages village3 = new Stages();
        System.out.println(titleMaker("STAGE 3"));
        String v3Name = "BECKINSDALE";
        System.out.println("You have entered " + v3Name + " VILLAGE.");
        System.out.println("");
        current = 0;
        while (village3.getComplete() == false){
            System.out.println("");
            System.out.println("NAME: " + name);
            System.out.println("HEALTH: " + Player.getHealth());
            System.out.println("LEVEL: " + Player.getLevel());
            System.out.println("You are in: " + v3Name + " VILLAGE");
            System.out.println("");
            int temp3 = inputInt("What would you like to do?\n [1]: Roll the DICE OF DESTINY\n [2]: Enter the DUNGEON \n [3]: Quit the game");
            if (temp3 == 1){
                DiceOfDestiny Dice3 = new DiceOfDestiny();
                if(current !=3){
                    Player.setLevel(Dice3.randomLevel(Player.getLevel()));
                    current += 1;
                    System.out.println("Your LEVEL is now " + Player.getLevel());
                }
                else {
                    System.out.println("You have already rolled the Dice of Destiny 3 times in this village.");
                    System.out.println("Your LEVEL is still " + Player.getLevel());
                }
            }
                    
            if (temp3 == 2){
                Player.setHealth(village3.enterDungeon(Player.getHealth(),60,Player.getLevel(),45,v3Name,"WARLOCK"));
                System.out.println("You have been awarded +15 LEVEL by the villagers for saving them!");
                Player.changeLevel(15);
                break;
            }
                    
            if (temp3 == 3){
                System.exit(0);
            }
                
        }
        System.out.println(titleMaker(""));
        System.out.println("");
                
        // Stage 4 - THE MEADSVILLE VILLAGE
        Stages village4 = new Stages();
        System.out.println(titleMaker("STAGE 4"));
        String v4Name = "MEADSVILLE";
        System.out.println("You have entered " + v4Name + " VILLAGE.");
        System.out.println("");        
        current = 0;
        while (village4.getComplete() == false){
            System.out.println("");
            System.out.println("NAME: " + name);
            System.out.println("HEALTH: " + Player.getHealth());
            System.out.println("LEVEL: " + Player.getLevel());
            System.out.println("You are in: " + v4Name + " VILLAGE");
            System.out.println("");
            int temp4 = inputInt("What would you like to do?\n [1]: Roll the DICE OF DESTINY\n [2]: Enter the DUNGEON \n [3]: Quit the game");
            if (temp4 == 1){
                DiceOfDestiny Dice4 = new DiceOfDestiny();
                if(current !=3){
                    Player.setLevel(Dice4.randomLevel(Player.getLevel()));
                    current += 1;
                    System.out.println("Your LEVEL is now " + Player.getLevel());
                }
                else {
                    System.out.println("You have already rolled the Dice of Destiny 3 times in this village.");
                    System.out.println("Your LEVEL is still " + Player.getLevel());
                }
            }
                    
            if (temp4 == 2){
                Player.setHealth(village4.enterDungeon(Player.getHealth(),80,Player.getLevel(),60, v4Name,"GHOUL"));
                System.out.println("You have been awarded +15 LEVEL by the villagers for saving them!");
                Player.changeLevel(15);
                break;
            }
                    
            if (temp4 == 3){
                System.exit(0);
            }
                
        }
        System.out.println(titleMaker(""));
        System.out.println("");
        
        // Stage 5 - ENTRANCE THE DARK HALLOWS FORTRESS
        Stages outerfortress = new Stages();
        System.out.println(titleMaker("STAGE 5"));
        String v5Name = "THE DARK HALLOWS";
        System.out.println("You are hiding in the bushes, looking at the entrance of " + v5Name + " FORTRESS");
        System.out.println("");      
        current = 0;
        while (outerfortress.getComplete() == false){
            System.out.println("");
            System.out.println("NAME: " + name);
            System.out.println("HEALTH: " + Player.getHealth());
            System.out.println("LEVEL: " + Player.getLevel());
            System.out.println("You are: OUTSIDE "+ v5Name + " FORTRESS");
            System.out.println("");
            int temp5 = inputInt("What would you like to do?\n [1]: Roll the DICE OF DESTINY\n [2]: Attack the WARLOCK guarding the entrance\n"
                + " [3]: Quit the game");
            if (temp5 == 1){
                DiceOfDestiny Dice5 = new DiceOfDestiny();
                if(current !=3){
                    Player.setLevel(Dice5.randomLevel(Player.getLevel()));
                    current += 1;
                    System.out.println("Your LEVEL is now " + Player.getLevel());
                }
                else {
                    System.out.println("You have already rolled the Dice of Destiny 3 times in this village.");
                    System.out.println("Your LEVEL is still " + Player.getLevel());
                }
            }        
            if (temp5 == 2){
                Player.setHealth(outerfortress.enterDungeon(Player.getHealth(),80,Player.getLevel(),70,v5Name, "DEMON"));
                System.out.println("You have been awarded +15 LEVEL by the villagers for saving them!");
                Player.changeLevel(15);
                break;
            }
                    
            if (temp5 == 3){
                System.exit(0);
            }
                
        }
        System.out.println(titleMaker(""));
        System.out.println("");
        
        // Stage 6 - THE DARK HALLOWS FORTRESS
        Stages fortress = new Stages();
        System.out.println(titleMaker("STAGE 6"));
        String v6Name = "DARK HALLOWS FORTRESS";
        System.out.println("You enter the " + v6Name);
        System.out.println("");       
        current = 0;
        while (fortress.getComplete() == false){
            System.out.println("");
            System.out.println("NAME: " + name);
            System.out.println("HEALTH: " + Player.getHealth());
            System.out.println("LEVEL: " + Player.getLevel());
            System.out.println("You are in: " + v6Name);
            System.out.println("");
            int temp6 = inputInt("What would you like to do?\n [1]: Roll the DICE OF DESTINY\n [2]: Face THE NECROMANCER\n"
                + " [3]: Quit the game (like a chicken xD)");
            if (temp6 == 1){
                DiceOfDestiny Dice6 = new DiceOfDestiny();
                if(current !=3){
                    Player.setLevel(Dice6.randomLevel(Player.getLevel()));
                    current += 1;
                    System.out.println("Your LEVEL is now " + Player.getLevel());
                }
                else {
                    System.out.println("You have already rolled the Dice of Destiny 3 times in this village.");
                    System.out.println("Your LEVEL is still " + Player.getLevel());
                }
            }
                    
            if (temp6 == 2){
                System.out.println("As a gift of saving them, the Villagers give you a HEALING POTION which restores your health to max.");
                System.out.println("You drink it, in preparation for the upcoming battle.\n");
                Player.setHealth(100);
                System.out.println("You walk out into the light, revealing yourself to THE NECROMANCER.");
                System.out.println("'I've been expecting you, " + Player.getName() + "' he says.");
                System.out.println("'I'm here to end you NECROMANCER' you say.");
                System.out.println("'My sources say you have some power, but not enough to defeat me' he says.");
                System.out.println("'Enough chitchat NECROMANCER. Let's fight!' you say.");
                Player.setHealth(fortress.faceNecromancer(Player.getHealth(),Player.getLevel(),v6Name));
            }
                    
            if (temp6 == 3){
                System.exit(0);
            }
        }
        System.out.println(titleMaker(""));
        System.out.println("");
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