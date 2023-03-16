public class Desktop extends Computer{

  private int screenSize;
  private int memory;
  private double batteryLife;
  private boolean monitor;

  public int getscreenSize() {return this.screenSize;}
  public void setscreenSize(int newscreenSize) {this.screenSize = newscreenSize;}

  public int getmemory() {return this.memory;}
  public void setmemory(int newmemory) {this.memory = newmemory;}  

  public double getbatteryLife() {return this.batteryLife;}
  public void setbatteryLife(double batteryLife) {this.batteryLife = batteryLife;}

  public boolean getmonitor() {return this.monitor;}
  public void setmonitor(boolean newmonitor) {this.monitor = newmonitor;}
}