public class PrimeNumber {
  public static boolean Isprime(int n){
   for(int i=2;i< Math.sqrt(n);i++){
    if(n%i == 0){
      return false; 
    }
   }
   return true;
  }
  public static void main(String[] args) {
    int n = 5;
    boolean ans = (Isprime(n));
    
    if(n != 1 && ans == true){
      System.out.println("Prime number");
    }else{
      System.out.println("Not a prime number");
    }
  }
}
