class Main  {

  public Main() {
    Author bob = new Author("bob", "bob@gmail.com", 'm');
    Author jeff = new Author("jeff", "jeff@gmail.com", 'm');
    Author jimmy = new Author("jimmy", "jimmy@gmail.com", 'm');

    System.out.println(bob.getName());
    System.out.println(jeff.getEmail());
    System.out.println(jimmy.getGender());
    System.out.println(bob.setEmail("nah@gmail.com"));
    System.out.println(jeff.getEmail());
  }


  public static void main(String[] args) {
    Main main = new Main();
  }
}