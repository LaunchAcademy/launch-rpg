# Launch RPG

- Create character class
  - Constructor
  - state
  - getters
  - getStatus
    - use SB because that's what `+` does anyway
  - create main
    - create 2 characters
    - create ArrayList party
      - party.add
    - Sb
      - for Character character : party
      - sb.append(character.getStatus())
- Create NPC class
  - extends Character
  - Constructor with
    - super(each|args)
  - @Override
    - getStatus()
    - return "(Computer\n)" super.getStatus();
  - return to character class
    - create an NPC (NPC name = new NPC(stats))
    - add to party
- Create Wizard Class
  - Constructor (same as other + maxMagicPoints)
  - super (args)
  - this.maxMP and this.currentMP
  - @Override getStatus to append MP
## Characters

- Characters have:
  * A character name
  * Hitpoints
  * A default weapon
  * a `getStatus`
  * a `takeDamage` method
- Nonplayer Characters have:
  * a `getStatus` that indicates it's a non player character
- A wizard has:
  * Magic Points
  * a `getStatus` that includes their magic points
  * a `takeDamage` method that has a 25% chance of healing

- import java.util.ArrayList;
- public class Character {
  - private data (state)

  - Constructor(args) {
    this.arg = arg
  }

  - use cmd n to generate setters

  - public String getStatus() {
    StringBuilder sb = new StringBuilder();
    sb.append(name);
    sb.append("\n");
    sb.append("---\nCurrent Health: ");
    sb.append(currentHitpoints);
    sb.append(" / ");
    sb.append(maxHitpoints);
    return sb.toString();
  }

  - public static void main(String[] args){
    Character character = new Character("name",
    maxhp,
    "Weapon of Choice");
   -  make two characters
   - ArrayList<Character> party = new ArrayList<Character>():
   - party.add(characterVariable)

   - StringBuilder sb = new StringBuilder();
      for(Character character : party) {
      sb.append(character.getStatus());
      sb.append("\n\n");
    }

    System.out.println(sb.toString());
  }
}
-----
--- NPC
public class NPC extends Character {
  public NPC(String name, int maxHitpoints, String defaultWeapon) {
    super(name, maxHitpoints, defaultWeapon);
  }

  @Override
  public String getStatus() {
    return "(COMPUTER)\n" + super.getStatus();
  }
}
----

--- wizard
public class Wizard extends Character {
  private int maxMagicPoints;
  private int currentMagicPoints;

  public Wizard(String name, int maxHitpoints, String defaultWeapon, int maxMagicPoints) {
    super(name, maxHitpoints, defaultWeapon);
    this.maxMagicPoints = maxMagicPoints;
    this.currentMagicPoints = maxMagicPoints;
  }

  @Override
  public String getStatus() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.getStatus());
    sb.append("\nMagic Points:");
    sb.append(currentMagicPoints);
    sb.append(" / ");
    sb.append(maxMagicPoints);
    return sb.toString();
  }
}
