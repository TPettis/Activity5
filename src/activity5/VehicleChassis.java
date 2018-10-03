package activity5;

import java.util.Set;

public class VehicleChassis implements Chassis {

  //  Create a String named chassisName instance variable.
  public String chassisName;

  //  A public default constructor
  //  Set the chassisName instance variable using the interface constant as the default String value.
  public VehicleChassis() {
    this.chassisName = chassis;
  }

  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  //  A public method named getChassisType that doesnt have a formal parameter
  public Chassis getChassisType() {
    return this;
  }

  //  A public method setChassisType that takes a String parameter vehicleChassis and that returns a void. It sets the instance variable chassisName.
  public void setChassisType(String vehicleChassis) {
    chassisName = vehicleChassis;
  }

  //  A public toString method that returns Chassis Name : Chassis
  public String toString() {
    return "Chassis Name : " + chassisName;
  }
}
