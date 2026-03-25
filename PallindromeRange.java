public class PallindromeRange{
  public static boolean isPallindrome(int num){
    int original = num;
    int reverse = 0;


    while (num > 0) {
      int rem = num % 10;
      reverse = reverse * 10 + rem;
      num = num /10; 
    }

    return original == reverse;
  }
  public static void main(String[] args) {
    int start = 150;
    int end = 200;

    System.out.println("Pallindrome number between "+ start +" and " + end);

    for(int i=start;i<=end;i++){
      if(isPallindrome(i)){
        System.out.println(i+" ");
      }
    }
  }
}