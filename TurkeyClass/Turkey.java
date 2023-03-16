import java.util.ArrayList;
public class Turkey {

  private String Name;
  private double AvgSpurLength;
  private double Weight;
  private double BeardLength;
  private double scoreTurkey;

  public Turkey(String Name, double Weight, double AvgSpurLength, double BeardLength) {
    this.Name = Name;
    this.Weight = Weight;
    this.AvgSpurLength = AvgSpurLength;
    this.BeardLength = BeardLength;   
  }

  public Turkey() {
    this.Name = "Unknown";
    this.AvgSpurLength = 0;
    this.Weight = 0;
    this.BeardLength = 0;
  }

  public String getName() {return this.Name;}
  public void setName(String newName) {this.Name = newName;}

  public double getBeardLength() {return this.BeardLength;}
  public void setBeardLength(double newBeard) {this.BeardLength = newBeard;}  

  public double getAvgSpurLength() {return this.AvgSpurLength;}
  public void setAvgSpurLength(double avgSpurLength) {this.AvgSpurLength = avgSpurLength;}

  public double getWeight() {return this.Weight;}
  public void setWeight(double newWeight) {this.Weight = newWeight;}

  public static double getAvgTurkeyWeight(ArrayList<Turkey> array){
    double t = 0;
    for(int i = 0; i < array.size(); i++){
      t += array.get(i).getWeight(); 
    }
    return t/array.size();
  }

  public double scoreTurkey(){
    return 1 * Weight + 2 * BeardLength + 20 * AvgSpurLength;
  }

  public String toString() {
    return "Turkey [Name=" + Name + ", Weight=" + Weight + ", AvgSpurLength=" + AvgSpurLength + ", BeardLength=" + BeardLength + ", Score=" + scoreTurkey() + "]";
  }
}