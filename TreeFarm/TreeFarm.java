import java.util.ArrayList;
public class TreeFarm {

  private String name;
  private String owner;
  private double rating;

  public TreeFarm(String name, String owner, double rating) {
    this.name = name;
    this.owner = owner;
    this.rating = rating;   
  }

  public TreeFarm() {
    this.name = "Unknown";
    this.owner = "Unknown";
    this.rating = 0.0;
  }

  public String getName() {return this.name;}
  public void setName(String newName) {this.name = newName;}

  public String getOwner() {return this.owner;}
  public void setOwner(String newOwner) {this.owner = newOwner;}

  public double getRating() {return this.rating;}
  public void setRating(double newRating) {this.rating = newRating;}  

  public static double getAverageRating(ArrayList<TreeFarm> array){
    double t = 0;
    for(int i = 0; i < array.size(); i++){
      t += array.get(i).getRating(); 
    }
    return t/array.size();
  }

  public String toString() {
    return "TreeFarm[Name=" + name + ", Owner=" + owner + ", Rating=" + rating + "]";
  }
}