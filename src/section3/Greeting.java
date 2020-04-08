package section3;

import javax.swing.JOptionPane;

public class Greeting {
public static void main(String[] args) {
String input = JOptionPane.showInputDialog("What is your name?");

JOptionPane.showMessageDialog(null, "hello " + input);
if(input.equals ("Nikhil")) {
	System.out.println(input + " is awesome ");
}
else {
  System.out.println(input + " is just ok ");}
}
}