package activity5;

//generic class called Cuboid that will store the three dimensions of a cuboid.
public class Cuboid<T> {

  //Methods to set and get the length, breadth and height.
  private T length;
  private T breadth;
  private T height;

  public T getLength() {
    return length;
  }

  public void setLength(T length) {
    this.length = length;
  }

  public T getBreadth() {
    return breadth;
  }

  public void setBreadth(T breadth) {
    this.breadth = breadth;
  }

  public T getHeight() {
    return height;
  }

  public void setHeight(T height) {
    this.height = height;
  }

  //Add a method public String toString()
  // that will return all of the dimensions.  The type of the dimensions will be decided at
  // construction of the cuboid instance.  Example:Cuboid<Double> c1 = new Cuboid<>();
  // Cuboid<String> c1 = new Cuboid<>();
  @Override
  public String toString() {
    return "Cuboid{" +
        "length=" + length +
        ", breadth=" + breadth +
        ", height=" + height +
        '}';
  }

  //Modify your generic class Cuboid so that it only accepts Numbers.
  //Add a method with the following definition and complete its body.
  //Hint: Look at the method doubleValue() in the Number class.public double getVolume(){ ...... }

}

//2-3v1 generic
//2-3v2
//2-3v3 enum
//2-3-1-1 public class Cuboid<T> {
//2-3-1-2 T
//2-3-3
//2-3-4 pair something. check oracle generic class
