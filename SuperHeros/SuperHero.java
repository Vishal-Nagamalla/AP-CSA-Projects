public class SuperHero extends SuperCitizen {
  private String catchPhrase;

  public SuperHero(String name, String job, int hitPoints, int maxDamage, int defenseAbility, String superName, String superPower, boolean cape, int powerLevel, String catchPhrase) {
    super(name, job, hitPoints, maxDamage, defenseAbility, superName, superPower, cape, powerLevel);
    this.catchPhrase = catchPhrase;

  }

  public String getCatchPhrase() {
    return catchPhrase;
  }

  public String toString() {
    return super.toString() + ", catchPhrase " + catchPhrase;
  }

  public int powerLevelModification() {
    powerLevelModification(super.getPowerLevel() + (int) (Math.random() * (9)) + 1);
    return super.getPowerLevel();
  }
}