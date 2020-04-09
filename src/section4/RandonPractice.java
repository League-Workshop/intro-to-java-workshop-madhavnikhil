package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandonPractice {
public static void main(String[] args) {
Random randy = new Random();
int randonNum = randy.nextInt(10); //0-9
int a = randy.nextInt(21);
JOptionPane.showMessageDialog(null, randonNum);
JOptionPane.showMessageDialog(null, a);
}
}
