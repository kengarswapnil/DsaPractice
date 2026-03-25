import java.util.Scanner;

public class Pallindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();

 
    // int res = n;
    int rev = 0;
    while(n > 0){
      int temp = n %10;
      rev = rev *10 +temp;
      n = n /10;
    }

    // if(rev == res){
    //   System.out.println("It is pallindrome");
    // }else{
    //   System.out.println("Not pallindrome");
    // }
System.out.println(rev);

  }
}
