import java.util.ArrayList;
import java.util.List;

public class Character {
  private String name;
  private int maxEnergyPoints;
  private String weapon;
  private int currentEnergyPoints;

  public Character(String name, int maxEnergyPoints, String weapon) {
    this.name = name;
    this.weapon = weapon;
    this.maxEnergyPoints = maxEnergyPoints;
    this.currentEnergyPoints = maxEnergyPoints;
  }

  public String getName() {
    return name;
  }



  public String getStatus() {
    String status = name + "\n------\n";
    status += "Energy: " + currentEnergyPoints + "/" + maxEnergyPoints + "\n";
    return status;
  }

  public void takeDamage(int damage) {
    // if the damage brings them down to 0 energy,
    if(damage >= currentEnergyPoints) {
    // alert the user that their character died
      System.out.println("Your character " + name + " has died, please play again!");
    // and change the currentEnergyPoints to 0
      currentEnergyPoints = 0;
    } else {
      // otherwise, decrease the currentEnergyPoints by the provided damage
      currentEnergyPoints -= damage;
    }
  }
}
