import java.util.ArrayList;
import java.util.List;

public class GameRunner {

  public static void main(String[] args) {
    Character zelda = new Character("Zelda", 100, "Staff");
    Character link = new Character("Link", 50, "Sword");
    ComputerCharacter gannon = new ComputerCharacter("Gannon", 200, "Staff");
    Wizard gandalf = new Wizard("Gandalf", 300, "Staff", 50);
    gandalf.castSpell(20);

    List<Character> party = new ArrayList<Character>();
    party.add(zelda);
    party.add(link);
    party.add(gannon);
    party.add(gandalf);

    for(Character character : party) {
//      System.out.println(character.getName());
      character.takeDamage(50);
      System.out.println(character.getStatus());
    }
  }
}
