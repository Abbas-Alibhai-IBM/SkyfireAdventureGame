/**
  * The class RunGame is the subclass of Game that runs all the methods inside the Game class.
  *
  * @author Abbas Alibhai
  **/
public class RunGame extends Game
{
    public static void main(String[] args){
      // TitleCard TitleCard = new TitleCard("");
      // System.out.println(TitleCard.getName());
        Game Game = new Game();
        String name = Game.intro();
        Game.howToPlay();
        Game.Game(name);        
    }   
}