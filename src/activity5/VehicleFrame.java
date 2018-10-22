package activity5;

public class VehicleFrame implements Chassis {

  //String named vehicleFrameType instance variable.
  private String vehicleFrameType;

  //A public default constructor
  public VehicleFrame() {
    this.vehicleFrameType = "Unibody";
  }

  //An overloaded constructor with a String parameter value of vehicleFrameType
  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  //A public method named getChassisType that didn't have a formal parameter and that returns an
  //instance of the interface Chassis
  @Override
  public Chassis getChassisType() {
    return this;
  }

  //A public method setChassisType that takes a String parameter vehicleFrameType and that returns
  //a void. It should set the instance variable vehicleFrameType.
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  //public toString method
  public String toString() {
    return
            "Chassis      : " + chassis + "\n" +
            "Vehicle Name : " + vehicleFrameType;
  }
}
