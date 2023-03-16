import java.util.ArrayList;

class Main { 
  public static void main(String args[]){ 
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
      
      int find = 3; //HARD CODED, CAN BE REPLACED WITH SCANNER
    
      Main code = new Main(); 
      int run = code.binarySearch(list, list.size() - 1, find); 
      System.out.println("Index: " + run); 
  }
  
  public int binarySearch(ArrayList<Integer> list, int x, int find){ 
    if (list.get(x / 2) == find) 
      return (x / 2); 

    if (list.get(x / 2) > find) 
      return binarySearch(list, (x / 2) - 1, find); 

    return binarySearch(list, x, find); 
  } 
}