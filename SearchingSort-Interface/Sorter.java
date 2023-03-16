import java.util.ArrayList;
public class Sorter implements SearchingSortingInterface {
  public ArrayList<Integer> selectionSort(ArrayList<Integer> a) {
    int min = Integer.MAX_VALUE;
    int pas = 0;
    for (int i = 0; i < a.size(); i++) {
      for (int k = i; k < a.size(); k++) {
        if (a.get(k) < min)
          min = a.get(k);
          pas = k;
        }
        int temp = a.get(i);
        a.set(i, a.get(pas));
        a.set(pas, temp);
     }
    return a;
  }
  
      
  public ArrayList<Integer> insertionSort(ArrayList<Integer> a, int c) {
    int i, key, j;
    for (i = 1; i < c; i++){
      key = a.get(i);
      j = i - 1;
      while (j >= 0 && a.get(j) > key){
        a.set(j+1, key); 
        j = j - 1;
      }
      a.set(j+1, key);
    }
  }
  
  public boolean linearSearch(ArrayList<Integer> a, int targ) {
   for (int i = 0; i < a.size(); i++) {
     if (a.get(i) == targ)
       return true;
   }
    return false;
  }  
}