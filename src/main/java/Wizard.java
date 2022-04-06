public class Wizard extends Character {
  private int maxMagicPoints;
  private int currentMagicPoints;

  public Wizard(String name, int maxEnergyPoints, String weapon, int maxMagicPoints) {
    super(name, maxEnergyPoints, weapon);
    this.maxMagicPoints = maxMagicPoints;
    this.currentMagicPoints = maxMagicPoints - 10;
  }

  @Override
  public String getStatus() {
    String status = super.getStatus();
    status += "Magic: " + currentMagicPoints + "/" + maxMagicPoints + "\n";
    return status;
  }

  public void castSpell(int requiredMagic) {
    currentMagicPoints -= requiredMagic;
  }
}
