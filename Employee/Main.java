class Main{
  private String name;
  public Employee(){
    name = "Unknown";
  }

  public Employee(String name){
    this.name = name;
  }

  public String getname(){return name;}
  public int getHours(){
    return 40;
  }
  public int getVacDays(){
    return 10;
  }
  public int getSalary(){
    return 55000;
  }
  
}