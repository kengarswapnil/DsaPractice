public class RangeofPrime {
  public static boolean Isprime(int n){
    if(n <= 1){
      return false;
    }


    for(int i = 2 ; i * i <= n ; i++){
      if(n % i == 0){
       return false;
      }
    }
    return true;
  }
  public static void isPrimeOrNot(int a , int b){
    for(int i=a;i<=b;i++){
        if(Isprime(i)){
        System.out.println(i + "");
       }
    }    
  }
  public static void main(String[] args) {
    int a = 10 , b = 17;
    isPrimeOrNot(a,b);
  }
}
