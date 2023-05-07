package assignment2;
public class Sphere {

 private double radius;

 public Sphere(double radius){
 this.radius =radius;
 }

 public double getArea(){
 return 4* Math.PI *radius *radius;
 }
 public double getVolume(){
 return (4/3)* Math.PI *radius *radius* radius;
 }