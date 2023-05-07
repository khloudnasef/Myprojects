package assignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Client {

 public static void main(String[] args) {

 String hostName = "127.0.0.1";
 int portNum = 5435;
 try (
 Socket sock = new Socket(hostName, portNum);
 PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
 BufferedReader in = new BufferedReader( new InputStreamReader(sock.getInputStream()));
 BufferedReader stdIn = new BufferedReader( new InputStreamReader(System.in))
 ) {
 while(!sock.isClosed()) {
 String message;
 while((message = in.readLine()) != null) {
 System.out.println(message);
 if (!in.ready()) {
 break;
 }
 }
 String reply = stdIn.readLine();
 out.println(reply);
 }
 System.out.println("Connection closed.");
 } catch (IOException e) {
 throw new RuntimeException(e);
 }

 }
CCS20903 CLIENT SERVER COMPUTING
5

}