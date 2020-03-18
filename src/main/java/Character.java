import java.util.ArrayList;

public class Character {
  private String name;
  private int maxHitPoints;
  private int currentHitPoints;
  private String defaultWeapon;
  private boolean conscious;

  public Character(String name, int maxHitPoints, String defaultWeapon ) {
    this.name = name;
    this.maxHitPoints = maxHitPoints;
    this.currentHitPoints = maxHitPoints;
    this.defaultWeapon = defaultWeapon;
    this.conscious = true;
  }

  public String getName() {
    return name;
  }

  public int getMaxHitPoints() {
    return maxHitPoints;
  }

  public int getCurrentHitPoints() {
    return currentHitPoints;
  }

  public String getDefaultWeapon() {
    return defaultWeapon;
  }

  public String getStatus(){
    StringBuilder sb = new StringBuilder();
    sb.append("Name: ");
    sb.append(name);
    sb.append("\n");
    sb.append("Hit Points: ");
    sb.append(currentHitPoints);
    sb.append(" / ");
    sb.append(maxHitPoints);
    sb.append("\n Status: ");
    sb.append(conscious);

    return sb.toString();
  }

  public void takeDamage(int damageTaken){
    currentHitPoints = currentHitPoints - damageTaken;
    if (currentHitPoints < 1){
      currentHitPoints = 0;
      conscious = false;
    }
  }

  public static void main(String[] args) {
    Character spiderMan = new Character("Peter Parker", 50, "Webs");
    Character ironMan = new Character("Tony Stark", 100, "Armor");
    NonPlayerCharacter drDoom = new NonPlayerCharacter("Victor Von Doom", 200, "Magic");
    Wizard drStrange = new Wizard("Stephen Strange", 50, "Magic", 100);

    spiderMan.takeDamage(1060);
    drDoom.takeDamage(50);
    drStrange.castSpell(50);

    ArrayList<Character> party = new ArrayList<Character>();
    party.add(spiderMan);
    party.add(ironMan);
    party.add(drDoom);
    party.add(drStrange);

    StringBuilder sb = new StringBuilder();
    for(Character character : party){
      sb.append(character.getStatus());
      sb.append("\n\n");
    }

    System.out.println(sb.toString());
  }

}
