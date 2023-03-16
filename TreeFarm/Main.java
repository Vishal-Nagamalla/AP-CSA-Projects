import java.util.ArrayList;
class Main extends TreeFarm {
  public static void main(String[] args) {
    ArrayList<TreeFarm> trees = new ArrayList<TreeFarm>();

    trees.add(new TreeFarm("Habiak Farms", "Alan Habiak", 4.8));
    trees.add(new TreeFarm("Wolgast Christmas Tree Farm", "Len Wolgast", 5.0));
    trees.add(new TreeFarm("Harris Farm", "David Harris", 5.0));
    trees.add(new TreeFarm("Simonson Farms", "Rodger Jany", 3.2));
    trees.add(new TreeFarm("Barclay’s Christmas Tree Farm", "Steve Barclay", 4.1));

    for(int i = 0; i < trees.size(); i++){
      System.out.println(trees.get(i));
    }

    System.out.println(TreeFarm.getAverageRating((trees)));
  }
}