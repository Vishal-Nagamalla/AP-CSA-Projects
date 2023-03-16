import java.util.ArrayList;
class Main {
  public static void main(String[] args) { 
    Sorter sort = new Sorter();
    ArrayList<Integer> a = new ArrayList<Integer>();
     a.add(0);
     a.add(8);
     a.add(6);
     a.add(-1);
     sort.selectionSort(a); 
  }
}