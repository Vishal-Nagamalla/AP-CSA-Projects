class Main extends animal {
  public static void main(String[] args) {
    animal cat = new animal("cat", 86, 13.2, "Cat");
    animal dog = new animal("dog", 72, 45, "dog");
    animal idk = new animal();

    System.out.println(cat);
  }
}