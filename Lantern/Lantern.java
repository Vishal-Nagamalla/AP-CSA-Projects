class Lantern {
  public Lantern() {
    control(1, 0, 12, false);
    control(3, 0, 10, false);
    control(5, 0, 8, false);
    control(9, 0, 4, false);
    control(1, 5, 0, true); // starline
    control(9, 0, 4, false);
    control(5, 0, 8, false);
    control(9, 0, 4, false);
    control(13, 0, 0, false);
    control(1, 5, 0, true); // starline
    control(1, 5, 0, true); // starline
    control(13, 0, 0, false);
    control(9, 0, 4, false);
    control(5, 0, 8, false);
    control(9, 0, 4, false);
    control(1, 5, 0, true); // starline
    control(9, 0, 4, false);
    control(5, 0, 8, false);
    control(9, 0, 4, false);
    control(13, 0, 0, false);
    control(1, 5, 0, true); // starline
    control(1, 5, 0, true); // starline
    control(13, 0, 0, false);
    control(5, 0, 8, false);
    control(9, 0, 4, false);
    control(5, 0, 8, false);
    control(3, 0, 10, false);
    control(1, 0, 12, false);
  }

  public static void main(String[] args) {
    Lantern main = new Lantern();

  }

  public void star(int nums) {
    for (int i = 0; i < nums; i++)
      System.out.print("*");
  }

  public void line(int nums) {
    for (int i = 0; i < nums; i++)
      System.out.print(" |");
  }

  public void space(int nums) {
    for (int i = 0; i < nums / 2; i++)
      System.out.print(" ");
  }

  public void control(int star, int line, int space, boolean starline) {
    space(space);
    star(star);
    line(line);
    if (starline) {
      space(2);
      star(star);

    }
    space(space);
    System.out.println();
  }

}