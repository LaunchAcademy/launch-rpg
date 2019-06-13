public class ComputerCharacter extends Character {
  public ComputerCharacter(String name, int maxHitpoints, String defaultWeapon) {
    super(name, maxHitpoints, defaultWeapon);
  }

  @Override
  public String getStatus() {
    return "(COMPUTER)\n" + super.getStatus();
  }
}
