package assignment2;
public class Box {
 private double length;
 private double width;
 private double height;

 public Box(double length, double width, double height)
 {
 this.length =length;
 this.width = width;
 this.height = height;
 }

 public double getArea(){
 return 2 * (length * width * width * height * length * height);
 }
 public double getVolume(){
 return length * width * height;
 }
}