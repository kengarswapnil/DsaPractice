public class Amstrong2 {
  public static void IsAmstrong(int n){
    int temp = n;
    int res = 0;
    while( n > 0){
      int rem = n %10;
      res = res + (rem * rem *rem);
      n = n/10;
    }

    if(temp == res){
      System.out.println("It is Amstrong number");
    }else{
      System.out.println("It is not Amstrong Number");
    }
  }
  public static void main(String[] args) {
    int n = 151;
    IsAmstrong(n);
    
  }
}
