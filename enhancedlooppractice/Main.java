import java.util.ArrayList;
class Main {
  public static void main(String[] args) {

    System.out.println("PROBLEM 1:" + "\n");

    int[] array = new int[100];
    for (int i = 0; i< 100; i++) {
      array[i] = (int)((Math.random()*1000)+1);
    }

    for (int odds : array) {
      if (odds % 2 != 0) {
        System.out.print(odds + " ");
      }
    }

       int sum = array[0];
      for (int odds : array) {
      sum+= odds;
    }
    System.out.println();
    System.out.println("AVERAGE: " + sum/100 + " SUM: " + sum);


    int min = 1001;

     for (int odds : array) {
        if (odds < min)
          min = odds;
    }

    int max = 0;

     for (int odds : array) {
        if (odds > max)
          max = odds;
    }

    System.out.println("MIN: " + min + " MAX: " + max);


    System.out.println("\n" + "PROBLEM 2:" + "\n");

    ArrayList<Students> student = new  ArrayList<Students>();

    Students student1 = new Students("Bob", "smith", 12);
        student.add(student1);
    Students student2 = new Students("Joe", "Johnson", 11);
        student.add(student2); 
    Students student3 = new Students("Jeff", "Williams", 10);
        student.add(student3);
    Students student4 = new Students("Kim", "Brown", 9);
        student.add(student4);
    Students student5 = new Students("John", "Jones", 8);
      student.add(student5);

    Students.print(student);
  }
}