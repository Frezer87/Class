import javax.swing.JOptionPane;
import java.util.Scanner;

public class Class {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter int value");
        int intVar= keyboard.nextInt();
        System.out.println("Enter byte value");
        byte byteVar= keyboard.nextByte();
        System.out.println("Enter long value");
        long longVar= keyboard.nextLong();
        System.out.println("Enter short value");
        short shortVar= keyboard.nextShort();
        System.out.println("Enter float value");
        float floatVar= keyboard.nextFloat();
        System.out.println("Enter double value");
        double doubleVar= keyboard.nextDouble();
        System.out.println("Enter char value");
        char charVar= keyboard.next().charAt(0);
        System.out.println("Enter boolean value");
        boolean booleanVar= keyboard.nextBoolean();
        JOptionPane.showMessageDialog(null, "Hi!  Thank you for checking this application and you have just entered..." +"\n"+ "\n" +"an int value of " + intVar + "\n" + "entered a byte value of " + byteVar + "\n" + "a long value of " + longVar + "\n"
                + "a short value of " + shortVar + "\n" + "a float value of" + floatVar + "\n" + "a double value of " +  doubleVar + "\n"
                + "a character " + charVar + "\n" + "a boolean value"+ ("  ") + booleanVar);
    }
}