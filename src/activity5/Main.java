package activity5;

public class Main {

  public static void main(String[] args) {

    //create two objects, one with the default constructor
    VehicleChassis Chassis1 = new VehicleChassis();
    System.out.println(Chassis1.toString());

    //and the other with the constructor with parameter
    VehicleChassis Chassis2 = new VehicleChassis("Base");
    System.out.println(Chassis2.toString());

    //
  }
}
