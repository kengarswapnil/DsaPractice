import java.util.Scanner;

public class BinaryToDecimal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Binary String :");
    String  s  = sc.nextLine();

    double res = 0;
    int pow = 0;
    for(int i = s.length()-1;i>=0;i--){
      if(s.charAt(i) == '1'){
        res = res + Math.pow(2, pow);
      }
      pow++;
    }
    System.out.println(res);
  }
}
