public class animal {

  private String name;
  private int age;
  private double weight;
  private String type;

 public animal(String n, int a, double w, String type) {
    name = n;
    age = a;
    weight = w;
    this.type = type;

  }

  public animal() {
    name = "Unkown";
    age = 0;
    weight = 0;
    type = "Unkown";

  }

  public int Age1() { return age; }
  public String Name1() {return name;}
  public double Weight1() { return weight;}
  public String Type1() {return type;} 


/*public int changeAge(int abc) { 
  age = abc; 
  return age;  
}
  public String changeName(String abc) {
    name = abc;
    
    return name;}
  public double changeWeight(double abc) { 
    weight = abc;
    
    return weight;}
  public String changeType(String abc) {
    type = abc;
    
    return type;}*/



  /*public String toString() {
    String cat = "Name: " + name + ", Age: " + age + ", weight: " + weight + ", Type: " + type + ".";
    return cat;
  }
public String String() {
    String dog = "Name: " + name + ", Age: " + age + ", weight: " + weight + ", Type: " + type + ".";
    return dog;
}*/
}