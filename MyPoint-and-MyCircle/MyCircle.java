public class MyCircle {

  private MyPoint center;
  private int radius;

  public MyCircle(MyPoint center, int radius) {
    this.center = center;
    this.radius = radius;
  }
  public MyCircle(int x, int y, int radius) {
    center = new MyPoint(x, y);
    this.radius = radius;
  }

  public MyCircle() {
    center = new MyPoint(0, 0);
    this.radius = 1;
  }


  public int getX() {
    return center.getX();
  }
  public MyPoint getCenter() {
    return this.center;
  }

  public int getY() {
    return center.getY();
  }


  public void setX(int x) {
    center.setX(x);
  }

  public void setY(int y) {
    center.setY(y);
  }

  public String toString() {

  return "MyCircle[radius = " + radius+ " , center = " + center.toString() + "]";  
  }

  public double getArea() {
    double area = Math.PI * radius * radius;
    return area;
  }

  public double distance(MyPoint another) {
    return center.distance(another);
  }
}