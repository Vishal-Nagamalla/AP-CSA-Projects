import java.util.ArrayList;
public class Students {
  private String first;
  private String last;
  private int grade;

  public Students(String first, String last, int grade) {
    this.first = first;
    this.last = last;
    this.grade = grade;
  }

  public static void print(ArrayList<Students> students) {
    for (Students bongo : students) {
      System.out.println(bongo.first + " " +  bongo.last + " is in grade " + bongo.grade);
    }
  }
}