public class SuperCitizen extends Person {

  private String superPower;
  private boolean cape;
  private int powerLevel;
  private String superName;

  public SuperCitizen(String name, String job,int hitPoints, int maxDamage, int defenseAbility, String superName, String superPower, boolean cape, int powerLevel) {
    super(name, job, hitPoints, maxDamage, defenseAbility);
    this.superPower = superPower;
    this.cape = cape;
    this.powerLevel = powerLevel;
    this.superName = superName;
  }

  public String toString() {
    return super.toString() + "SuperName: " + superName + ", SuperPower: " + superPower + ", Cape: " + cape + ", PowerLevel " + powerLevel; 

  }

  public int getPowerLevel() {return powerLevel;}
  public String getSuperPower() {return superPower;}
  public boolean getCape() {return cape;}


  public void powerLevelModification(int newLevel) {
    powerLevel = newLevel;
  }
}