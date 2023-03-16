public class Computer{

  private int screenSize;
  private int memory;
  private double batteryLife;
  private boolean monitor;

  public Computer(int screenSize, int memory, double batteryLife, boolean monitor) {
    this.screenSize = screenSize;
    this.memory = memory;
    this.batteryLife = batteryLife;
    this.monitor = monitor;   
  }

  public Computer() {
    this.screenSize = 0;
    this.memory = 0;
    this.batteryLife = 0.0;
    this.monitor = false;   
  }

  public int getscreenSize() {return this.screenSize;}
  public void setscreenSize(int newscreenSize) {this.screenSize = newscreenSize;}

  public int getmemory() {return this.memory;}
  public void setmemory(int newmemory) {this.memory = newmemory;}  

  public double getbatteryLife() {return this.batteryLife;}
  public void setbatteryLife(double batteryLife) {this.batteryLife = batteryLife;}

  public boolean getmonitor() {return this.monitor;}
  public void setmonitor(boolean newmonitor) {this.monitor = newmonitor;}
}