package assignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
public class Server {
 static class ClientHandler implements Runnable {

 private Socket clientSocket;
 public ClientHandler(Socket clientSocket) {

 this.clientSocket = clientSocket;
 }
 @Override
 public void run() {
 try {
 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
 BufferedReader in = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));
 out.println("""
 WELCOME TO SHAPE CALCULATOR
 ---------------------------------
 """);
 out.println("Enter the width of the box: ");
 double boxWidth = parseDouble(in.readLine());
 out.println("Enter the height of the box: ");
 double boxHeight = parseDouble(in.readLine());
 out.println("Enter the length of the box: ");
 double boxLength = parseDouble(in.readLine());
 Box box = new Box(boxLength, boxWidth, boxHeight);
 out.println("Enter the radius of the sphere: ");
 double sphereRadius = parseDouble(in.readLine());
 Sphere sphere = new Sphere(sphereRadius);
 System.out.println("");
 out.println("""
 Select an Option to Calculate:
 ---------------------------------
 A) Surface area of the Box object.
 B) Volume of the Box object.
 C) Surface area of the Sphere object.
 D) Volume of the Sphere object""");
 char resp = in.readLine().charAt(0);
 switch (resp) {
 case 'A': {
 out.println("Surface area of the box: " + box.getArea());
 break;
 }
 case 'B': {
 out.println("Volume of the box: " + box.getVolume());
 break;
 }
 case 'C': {
 out.println("Surface area of the sphere: " + sphere.getArea());
 break;
 }
 case 'D': {
 out.println("Volume of the sphere: " + sphere.getVolume());
 break;
 }
 }
 out.close();
 in.close();
 clientSocket.close();

 } catch (IOException e) {
 throw new RuntimeException(e);
 }
 }
 }
 public static void main(String[] args) {
 int portNumber = 5435;
 ServerSocket serverSocket = null;
 try {
 serverSocket = new ServerSocket(portNumber);
 System.out.println("Server running on port " + portNumber);
 } catch (IOException e) {
 throw new RuntimeException(e);
 }
 while (true) {
 try {
 Socket clientSocket = serverSocket.accept();
 System.out.println("Connection Received!");
 Thread thread = new Thread(new ClientHandler(clientSocket));
 thread.start();
 } catch (IOException e) {
 throw new RuntimeException(e);
 }
 }
 }
}