public class MyPoint {

  private int x;
  private int y; 

  public MyPoint() {
    this.x = 0;
    this.y = 0;
  }

  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }


  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }
  public void setX(int newX) {
    x = newX;
  }
  public void setY(int newY) {
    y = newY;
  }

  public String toString() {
    return "(" + x + " , " + y + ")"; 

  }

  public double distance(int newX, int newY) {
    double distance = 0;
    int Xdist = Math.abs(this.x-newX);
    int Ydist = Math.abs(this.y-newY);

    distance = Math.sqrt((Xdist*Xdist) + (Ydist*Ydist));

    return distance;
  }

  public double distance(MyPoint another) {
    double distance = 0;

    int Xdist = Math.abs(this.x-another.getX());
    int Ydist = Math.abs(this.y-another.getY());

    distance = Math.sqrt((Xdist*Xdist) + (Ydist*Ydist));

    return distance;
  }

  public double distance() {
    double distance = 0;
    int Xdist = Math.abs(this.x-0);
    int Ydist = Math.abs(this.y-0);

    distance = Math.sqrt((Xdist*Xdist) + (Ydist*Ydist));

    return distance;
  }
}