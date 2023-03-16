import java.util.ArrayList;
public class GothamLikeAdventureTown {
  public String[] firstNames = { "Liam", "Noah", "Oliver", "Elijah", "Lucas", "Levi", "Mason", "Asher", "James", "Ethan", "Mateo" };

  public String[] lastNames = { "Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson", "Martinez" };

  public String[] jobs = { "Cashier", "Chef", "Janitor", "Bartender", "Mechanic", "Doctor", "IT", "Lawyer", "President", "Police" };

  public Person spiderMan = new SuperHero("Peter Parker", "Photographer", 50, 30, 20, "Spider Man", "Spider Sense", false, 10, "It's your friendly neighborhood spiderman");

  public Person venom = new SuperVillan("Eddie Brock", "Journalist", 75 , 30 , 10, "Venom", "Symbiote", false, 10, "We are Venom");

  public ArrayList<Person> dailyPlanetStreet = new ArrayList<Person>();
  public ArrayList<Person> unfortunatelyFatallyWoundedPeople = new ArrayList<Person>();
  public ArrayList<Person> safetyLand = new ArrayList<Person>();
  
  public Person createPerson() {
    int p1 = (int) (Math.random() * (10));
    int p2 = (int) (Math.random() * (10));
    int p3 = (int) (Math.random() * (10));

    String name = firstNames[p1] + " " + lastNames[p2];
    Person p = new NormalCitizen(name, jobs[p3], 0, 0, 0);
    return p;
  }

  public void code() {
    street();
    herovillanposition();
    fight();
  }

  public void street() {
    for (int i = 0; i < 48; i++) {
      dailyPlanetStreet.add(createPerson());
    }
    dailyPlanetStreet.add((int) (Math.random() * (49)), spiderMan);
    dailyPlanetStreet.add((int) (Math.random() * (49)), venom);
  }

  public void herovillanposition() {
    while (dailyPlanetStreet.size() > 2) {
        villanP();
        heroP();
      }
  }

  public void villanP() {
    int position = 0;
    int delete = (int) (Math.random() * (10));
    for (int i = 0; i < dailyPlanetStreet.size(); i++) {
      if (dailyPlanetStreet.get(i) == venom)
        position = i;
    }


    if  ((position != 0) && ( position != dailyPlanetStreet.size()-1)) {
      if ((dailyPlanetStreet.get(position-1) != spiderMan) && (dailyPlanetStreet.get(position+1) != spiderMan)) {
        if (delete % 2 == 0)  {
          unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.get(position+1));
          dailyPlanetStreet.remove(position+1);
           
        }
        else {
          unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.get(position-1));
          dailyPlanetStreet.remove(position-1);
        }
      }
    }

    if ((position == 0) && (dailyPlanetStreet.get(position+1) != spiderMan)) {
        unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.get(position+1));
      dailyPlanetStreet.remove(position+1);
    }
    if ((position == dailyPlanetStreet.size()-1) && (dailyPlanetStreet.get(position-1) != spiderMan)) {
      unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.get(position-1));
      dailyPlanetStreet.remove(position-1);
    }
  }

  public void heroP() {
    int position = 0;
    for (int i = 0; i < dailyPlanetStreet.size(); i++) {
      if (dailyPlanetStreet.get(i) == spiderMan)
        position = i;
    }

    int newSpace = (int) (Math.random() * (dailyPlanetStreet.size()));

    if ((dailyPlanetStreet.get(newSpace) != venom) && (dailyPlanetStreet.get(newSpace) != spiderMan)) {
      dailyPlanetStreet.add(dailyPlanetStreet.get(position));
      dailyPlanetStreet.remove(position);
      safetyLand.add(dailyPlanetStreet.get(newSpace));
      dailyPlanetStreet.remove(newSpace);
    }
  }

  public boolean firstAttacker() {
    int f = (int) (Math.random() * (10));
    if (f % 2 == 0)
      return true;
    else
      return false;
  }

  public int heroHealth() {
    if (spiderMan.getHitPoints() > 0)
      return spiderMan.getHitPoints();
    else
      return 0;
  }

  public int villanHealth() {
    if (venom.getHitPoints() > 0)
      return venom.getHitPoints();
    else
      return 0;
  }

  public void fight() {
    System.out.println("\n" + spiderMan + "\n" + "\n" + "VERSUS" + "\n" + "\n" + venom + "\n" + "\n" + "\n" + "FIGHT!" + "\n" + "\n");
    while ((spiderMan.getHitPoints() > 0) && (venom.getHitPoints() > 0)) {
      if (firstAttacker()) {
        heroFirst();
      }
      else{
        villanFirst();
      }
      fightStatus();
      System.out.println();
    }
    if (spiderMan.getHitPoints() < 0)
      villanW();
    else
      heroW();
  }

  public void heroFirst() {
    int damage = (int) (Math.random() * (spiderMan.getMaxDamage()) + 1);
    if (damage >= venom.getDefenseAbility()) {
      System.out.println("Spider Man uses WEB BARRAGE for " + damage + " damage");
      venom.hpReduction(damage);
    } 
    else
      System.out.println("Spider Man uses WEB BARRAGE, it does NO damage");
  }

  public void villanFirst() {
    int damage = (int) (Math.random() * (venom.getMaxDamage()) + 1);
    if (damage >= spiderMan.getDefenseAbility()) {
      System.out.println("Venom uses SYMBIOTE PUNCH for " + damage + " damage");
      spiderMan.hpReduction(damage);
    } 
    else
      System.out.println("Venom uses SYMBIOTE PUNCH, it does NO damage");
  }

  public void fightStatus() {
    System.out.println("Spider Man has " + heroHealth() + " hitpoints left and Venom has " + villanHealth() + " hitpoints left");
  }

  public void heroW() {
    System.out.println("SPIDER MAN HAS DEFEATED VENOM AND SAVED NEW YORK");
  }

  public void villanW() {
    System.out.println("VENOM HAS DEFEATED SPIDER MAN AND DESTROYED NEW YORK...");
  }
}