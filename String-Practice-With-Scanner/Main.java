import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    //1
    System.out.println("String Practice 1");
    
    Scanner revword = new Scanner(System.in);
    System.out.print("Word: ");
    String word = revword.nextLine();
    String rev = "";
    
    for(int i = word.length()-1; i >= 0; i--){
      rev += word.substring(i, i+1);
    }
    System.out.println("Reverse word: " + rev + "\n");


    
    //2
    System.out.println("String Practice 2");
    
    Scanner asciiword = new Scanner(System.in);
    System.out.print("Word: ");
    String word2 = asciiword.nextLine();
    String ascii = word2;
    
    for(int i = 0; i < word2.length(); i++){
      char temp = ascii.charAt(i);
      if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){
        int ran = (int)(Math.random()*41)+80;
        ascii = ascii.substring(0, i) + (char)ran + ascii.substring(i+1);
      }
    }
    System.out.println("ASCII WORD: " + ascii + "\n");


    
    //3
    System.out.println("String Practice 3");
    
    ArrayList<String> list = new ArrayList<String>();
    Scanner chopword = new Scanner(System.in);
    System.out.print("Word: ");
    String word3 = chopword.nextLine();
    
    while(word3.indexOf(" ") != -1){
      list.add(word3.substring(0, word3.indexOf(" ")));
      word3 = word3.substring(word3.indexOf(" ") +1); 
    }
    list.add(word3);
    
    for(int i = 0; i < list.size(); i++){
      String currentWord = list.get(i);
      currentWord = currentWord.substring(1, currentWord.length()-1); 
      list.set(i, currentWord);
    }
    System.out.print("Output: ");
    
    for(int i = 0; i < list.size(); i++){
      System.out.print(list.get(i) + " ");
    }
  }
}