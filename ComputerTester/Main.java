class Main {
  public static void main(String[] args) {
    Laptop macBook = new Laptop();
    macBook.setbatteryLife(8.5);
        
    Desktop dell = new Desktop();
    dell.setscreenSize(18);
        
    Computer surface = new Computer();
    surface.setscreenSize(11);
        
    System.out.println(macBook.getbatteryLife());
    System.out.println(dell.getscreenSize());
    System.out.println(surface.getscreenSize());
  }
}