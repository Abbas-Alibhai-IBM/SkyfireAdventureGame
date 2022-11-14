/**
  * The class RunGame is the subclass of Game that runs all the methods inside the Game class.
  *
  * @author Abbas Alibhai
  **/
public class TitleCard 
{
    private int totalNumber = 96;
    private String text;
    private int number;
    private String name = "";

    public TitleCard(String text)
    {
        this.text = text;
        this.number = (text.length() + 2);
    }

    public String getName(){ 
      for (int i = 0; i < ((totalNumber-number)/2); i++) {
        name += "-";
      }
      if (text.length() == 0) {
        name += "--";
      } else {
        name += " ";
        name += text;
        name += " ";
      }
      for (int i = 0; i < ((totalNumber-number)/2); i++) {
        name += "-";
      }
      return name;
    }
}