//Vishal Nagamalla
//Vatsal Mehta
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    ArrayList<String> Hogwarts = new ArrayList<String>();
    Hogwarts.add("A NIMBUS TWO-THOUSAND & THREE");  
    Hogwarts.add("2 chocolate frogs"); 
    Hogwarts.add("3 headed-dogs"); 
    Hogwarts.add("4 Hogwart houses");
    Hogwarts.add("5 golden snitches");
    Hogwarts.add("6 Quidditch teams");
    Hogwarts.add("7 Voldemort Horcruxes");
    Hogwarts.add("8 socks for Dobby");
    Hogwarts.add("9 keepers keeping");
    Hogwarts.add("10 polyjuice potions");
    Hogwarts.add("11 seekers seeking");
    Hogwarts.add("12 years in Azkaban");
    
    for (int i = 1; i <= Hogwarts.size(); i++) {
      System.out.println("On my " + i + " day of Hogwarts, Dumbledore gave to me:");
      for (int j = i - 1; j >= 0; j--) {
        System.out.print(Hogwarts.get(j) + ", ");
      }
      System.out.println("");
    }
  }
}