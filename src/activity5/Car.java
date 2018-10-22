package activity5;

import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];

  private int carAxle;

  //A public default constructor with no formal parameters and initialize all instance variables
  public Car() {
    super();
    Feature[] f = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};
    this.feature = feature;
    this.carAxle = 0;
  }

  //A public overloaded constructor with a super() method call
  public Car(Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      Chassis vehicleFrame,
      String vehicleType,
      String driveTrain,
      Engine vehicleEngine,
      Feature[] feature,
      int carAxle) {
    super(vehicleManufacturedDate,
        vehicleManufacturer,
        vehicleMake,
        vehicleModel,
        vehicleFrame,
        vehicleType,
        driveTrain,
        vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;
  }

  //Public methods to return formatted strings of the Internal and External features
  public String getExteriorFeatures() {
    String exFeatures = "";
    for (Feature f : feature) {
      if (f instanceof ExteriorFeature) {
        exFeatures += f.toString() + "\n";
      }
    }
    return exFeatures;
  }

  public String getInteriorFeatures() {
    String inFeatures = "";
    for (Feature f : feature) {
      if (f instanceof InteriorFeature) {
        inFeatures += f.toString() + "\n";
      }
    }
    return "\n" + inFeatures;
  }

  public int getCarAxle() {
    return carAxle;
  }

  @Override
  public String toString() {
    return super.toString() +
        getInteriorFeatures() +
        getExteriorFeatures() +
        "Car Axle           : " + carAxle;
  }
}
