import java.util.ArrayList;

public interface SearchingSortingInterface {

  public ArrayList<Integer> selectionSort(ArrayList<Integer> a);

  public ArrayList<Integer> insertionSort(ArrayList<Integer> a, int c);

  public ArrayList<Integer> mergeSort(ArrayList<Integer> a);

  public boolean binarySearch(ArrayList<Integer> a);

  public boolean linearSearch(ArrayList<Integer> a, int targ);

}