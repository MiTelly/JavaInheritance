class Vehicle {
  String color;
  int wheels;

  public Vehicle() {
   color = "blue";
   wheels = 2;
  }
  public int getWheels() {
   return wheels;
  }
}

public class Truck extends Vehicle {
  int age;

  public Truck(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
   }

  public static void main(String args[]) {
    Truck demo = new Truck(4);
    System.out.println("The # of wheels is:" + demo.getWheels() );
    System.out.println("The # of wheels is:" + demo.getAge() );
  }
}
