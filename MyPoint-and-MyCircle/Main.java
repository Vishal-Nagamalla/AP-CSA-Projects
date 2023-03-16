class Main {
  public static void main(String[] args) {
    MyPoint one = new MyPoint(1,8);
    MyPoint two = new MyPoint(1,3);
    System.out.println(one.distance(two));
    System.out.println(one.distance(2, 4));

    MyCircle c1 = new MyCircle();
    MyCircle c2 = new MyCircle(4, 7, 5);
    MyCircle c3 = new MyCircle(two, 5);
      
    System.out.println(c1.distance(c3.getCenter()));
      
    System.out.println(c2.getX());
    System.out.println(c2.getY());
    System.out.println(c2.getCenter());
    c2.setX(4);
    c2.setY(5);
    System.out.println(c2.getX());
    System.out.println(c2.getY());
    System.out.println(c2.toString());
  }
}