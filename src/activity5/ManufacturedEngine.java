package activity5;

import java.util.Date;

public class ManufacturedEngine implements Engine {

  //private instance variables
  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  //A public default constructor with no formal parameters and initialize all instance variables
  public ManufacturedEngine() {
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineType = "85 AKI";
    this.engineCylinders = 0;
    this.driveTrain = "2WD: Two-Wheel Drives";
  }

  //A public overloaded constructor with values for all of the variables defined above.
  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineType = engineType;
    this.engineCylinders = engineCylinders;
    this.driveTrain = driveTrain;
  }

  //Public method implementations for all of the public methods found in the Engine interface.
  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  //A public toString method
  public String toString() {
    return
            "Engine Manufacturer: " + engineManufacturer + "\n" +
            "Engine Manufactured: " + engineManufacturedDate + "\n" +
            "Engine Make        : " + engineMake + "\n" +
            "Engine Model       : " + engineModel + "\n" +
            "Engine Type        : " + engineType + "\n" +
            "Engine Cylinders   : " + engineCylinders + "\n" +
            "Drive Train        : " + driveTrain;
  }
}
