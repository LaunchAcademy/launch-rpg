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
