public class ComputerCharacter extends Character {
  public ComputerCharacter(String name, int maxEnergyPoints, String weapon) {
    super(name, maxEnergyPoints, weapon);
  }

  @Override
  public String getStatus() {
    return "(COMPUTER)\n" + super.getStatus();
  }
}
