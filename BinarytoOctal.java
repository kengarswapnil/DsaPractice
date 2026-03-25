import java.util.Scanner;
// import java.util.*;

public class BinarytoOctal {
  public static void main(String[] args) {
    // Scanner sc  = new Scanner(System.in);
    // String binary = sc.nextLine();

    // int decimal = Integer.parseInt(binary,2);
    // String octal = Integer.toOctalString(decimal);
    // System.out.println("Octal :"+ octal);

   int n = 2;
  String binary = "1010";

   System.out.println( "binary : "+Integer.toBinaryString(n));
   System.out.println("binary to decimal : " + Integer.parseInt(binary,2));
  }
}
