import java.util.ArrayList;

public class Character {
  private String name;
  private int currentHitpoints;
  private int maxHitpoints;
  private String defaultWeapon;

  Character(String name, int maxHitpoints, String defaultWeapon) {
    this.name = name;
    this.maxHitpoints = maxHitpoints;
    this.currentHitpoints = maxHitpoints;
    this.defaultWeapon = defaultWeapon;
  }

  public String getName() {
    return name;
  }

  public int getMaxHitpoints() {
    return maxHitpoints;
  }

  public String getDefaultWeapon() {
    return defaultWeapon;
  }

  public String getStatus() {
    StringBuilder sb = new StringBuilder();
    sb.append(name);
    sb.append("\n");
    sb.append("---\nCurrent Health: ");
    sb.append(currentHitpoints);
    sb.append(" / ");
    sb.append(maxHitpoints);
    return sb.toString();
  }

  public static void main(String[] args) {
    Character christianTheStrong = new Character("Christian",
      50,
      "Brass Knuckles");
    Character cameronTheBold = new Character("Cameron",
      51,
      "Battle Axe");
    Character amberTheStrongFemaleProtagonist = new Character("Amber",
      60,
      "Bubble Tea Straw");
    ComputerCharacter apprentiBot = new ComputerCharacter("Apprenti Bot",
      80,
      "Freaking laser beams");
    Wizard matteaTheWise = new Wizard("Mattea", 40, "Staff", 50);

    ArrayList<Character> party = new ArrayList<Character>();
    party.add(amberTheStrongFemaleProtagonist);
    party.add(cameronTheBold);
    party.add(christianTheStrong);
    party.add(apprentiBot);
    party.add(matteaTheWise);

    StringBuilder sb = new StringBuilder();
    for(Character character : party) {
      sb.append(character.getStatus());
      sb.append("\n\n");
    }

    System.out.println(sb.toString());
  }
}
