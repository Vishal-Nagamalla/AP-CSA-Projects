import java.util.ArrayList;
public class Sort{
  public Sort(){
    ArrayList<Integer> original = new ArrayList<Integer>();
    fill(original);
    ArrayList<Integer> temp = new ArrayList<Integer>();
    
    for(int x = 0; x < original.size(); x++){
      System.out.print(original.get(x)+"\t");
      temp.add(original.get(x));
    }
    
    System.out.println();
    System.out.println();
    System.out.println(sequential(original, 58));
    selection(original);
    printList(original);
    
    for(int x = 0; x < temp.size(); x++)
      original.set(x, temp.get(x));
    
    printList(original);
    insertion(original);
    printList(original);
    System.out.println();
    System.out.println((binarySearch(original, 58)));
  }

  public ArrayList<Integer> fill(ArrayList<Integer> list){
    for(int x = 0; x < 50; x++)
      list.add((int)(Math.random()*100)+1);
    
    return list;
  }

  public boolean sequential(ArrayList<Integer> list, int a){
    int x = 0;
    for (int i = 0; i < list.size(); i++){
      x++;
      if (list.get(i) == a)
      {
        System.out.println("Steps: "+x);
        return true;
      }
    }
    System.out.println("Step: "+x);
    return false;
  }

  public void printList(ArrayList<Integer> list){
    System.out.println();
    for(int x = 0; x < list.size(); x++)
      System.out.print(list.get(x)+"\t");
    System.out.println();
  }

  public ArrayList<Integer> selection(ArrayList<Integer> list){
    int y = 0;
    for (int j = 0; j < list.size() - 1; j++)
    {
      y++;
      int min = j;
      for (int k = j + 1; k < list.size(); k++)
        if (list.get(k) < list.get(min))
          min = k;
      int temp = list.get(j);
      list.set(j, list.get(min));
      list.set(min, temp);
    }
    System.out.println("Steps: " + y);
    return list;
  }

  public ArrayList<Integer> insertion(ArrayList<Integer> list){
    int x2 = 0;
    for (int j = 1; j < list.size(); j++)
    {
      x2++;
      int temp = list.get(j);
      int pIndex = j;
      while (pIndex > 0 && temp < list.get(pIndex - 1))
      {
        list.set(pIndex, list.get(pIndex - 1));
        pIndex--;
      }
      list.set(pIndex, temp);
    }
    System.out.println("Steps: "+x2);
    return list;
  }
  
  public int binarySearch(ArrayList<Integer> list, int a){
    int z = 0;
    int l = 0;
    int r = list.size() - 1;
    while (l <= r)
    {
      z++;
      int m = (l + r) / 2;
      if (a < list.get(m))
        r = m - 1;
      else if (a > list.get(m))
        l = m + 1;
           
      else{
        System.out.println("Steps: "+z);
        return m;     
      }
    }
    return -1;
  }
}