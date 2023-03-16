public class Author { 

  private String name;
  private String email; 
  private char gender; 

  public Author(String name, String email, char g) {
    this.name = name;
    this.email = email; 
    this.gender = g;
  }


  public String getName() {
    return this.name; 
  }

  public String getEmail() {
    return this.email; 
  }

  public char getGender() {
    return this.gender; 
  }

  public String setEmail(String emailb) {
    this.email = emailb;  

    return this.email;
  }

  public String toString() {
    String lol = name + ", " + email + ", " + gender;
    return lol;
  } 
}