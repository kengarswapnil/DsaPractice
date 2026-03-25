import java.util.Scanner;

public class AllNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int decimal = sc.nextInt();

    // System.out.println("------decimal to other conversion -------- ");
    // System.out.println("decimal to binary :"+Integer.toBinaryString(decimal));
    // System.out.println("decimal to octal :"+Integer.toOctalString(decimal));
    // System.out.println("decimal to hexaDecimal :"+Integer.toHexString(decimal));

    System.out.println("----- Binary to decimal------");
    String biInput =  sc.nextLine();
    int biTodec = Integer.parseInt(biInput,2);
    System.out.println("Binary to Decimal"+biTodec);

     System.out.println("----- Binary to decimal------");
    String octInput =  sc.nextLine();
    int octTodec = Integer.parseInt(octInput,8);
    System.out.println("Binary to Decimal"+octTodec);

     System.out.println("----- Binary to decimal------");
    String hexInput  =  sc.nextLine();
    int hexTodec = Integer.parseInt(hexInput ,2);
    System.out.println("Binary to Decimal"+hexTodec);
  }
}
