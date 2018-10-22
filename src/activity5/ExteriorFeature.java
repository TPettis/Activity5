package activity5;

public class ExteriorFeature implements Feature {
  //String named exteriorFeature as an instance variable.
  private String exteriorFeature;

  //A public default constructor without parameters
  public ExteriorFeature(){
    this.exteriorFeature = "Generic";
  }

  //An overloaded constructor
  public ExteriorFeature(String exteriorFeature){
    this.exteriorFeature = exteriorFeature;
  }

  //A public method that doesn't have a formal parameter and that returns an instance of String.
  public String getFeature(){
    return exteriorFeature;
  }

  //A public method that takes a String parameter and returns a void.
  public void setFeature(String exteriorFeature){
    this.exteriorFeature = exteriorFeature;
  }

  //A public toString method
  public String toString(){
    return "Exterior Feature   : [" + exteriorFeature + "]";
  }
}
