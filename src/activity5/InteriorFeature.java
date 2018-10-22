package activity5;

public class InteriorFeature implements Feature {
  //String named interiorFeature as an instance variable.
  private String interiorFeature;

  //A public default constructor without parameters
  public InteriorFeature(){
    this.interiorFeature = "Generic";
  }

  //An overloaded constructor
  public InteriorFeature(String interiorFeature){
    this.interiorFeature = interiorFeature;
  }

  //A public method that doesn't have a formal parameter and that returns an instance of String.
  public String getFeature(){
    return interiorFeature;
  }

  //A public method that takes a String parameter and returns a void.
  public void setFeature(String interiorFeature){
    this.interiorFeature = interiorFeature;
  }

  //A public toString method
  public String toString(){
    return "Interior Feature   : [" + interiorFeature + "]";
  }
}
