public class SuperVillan extends SuperCitizen {
  private String evilPlan;

  public SuperVillan(String name, String job, int hitPoints, int maxDamage, int defenseAbility, String superName, String superPower, boolean cape, int powerLevel, String evilPlan) {
    super(name, job, hitPoints, maxDamage, defenseAbility, superName, superPower, cape, powerLevel);
    this.evilPlan = evilPlan;
  }

  public String getEvilPlan() {return evilPlan;}
  public String toString() {
    return super.toString() + ", Evil Plan: " + evilPlan;
  }
}