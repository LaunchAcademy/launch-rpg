public class Wizard extends Character {
  private int maxMagicPoints;
  private int currentMagicPoints;

  public Wizard(String name, int maxHitPoints, String defaultWeapon, int maxMagicPoints) {
    super(name, maxHitPoints, defaultWeapon);
    this.maxMagicPoints = maxMagicPoints;
    this.currentMagicPoints = maxMagicPoints - 10;
  }

  public void castSpell(int mpUsed){
    currentMagicPoints = currentMagicPoints - mpUsed;
  }

  @Override
  public String getStatus() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.getStatus());
    sb.append("\nMagic Points: ");
    sb.append(currentMagicPoints);
    sb.append(" / ");
    sb.append(maxMagicPoints);
    sb.append("----\n");

    return sb.toString();
  }


}
