class Main {
  public static void main(String[] args) {
    mysteryXY(4, 1);	
    System.out.println();
mysteryXY(4, 2);	
System.out.println();
mysteryXY(8, 2);	
System.out.println();
mysteryXY(4, 3);	
System.out.println();
mysteryXY(3, 4);	
System.out.println();

  }
  public static void mysteryXY(int x, int y) {
    if (y == 1) {
        System.out.print(x);
    } else {
        System.out.print(x * y + ", ");
        mysteryXY(x, y - 1);
        System.out.print(", " + x * y);
    }
}
}