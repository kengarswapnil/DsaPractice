public class Amstrong {
  public static void main(String[] args) {
    int n = 154;
    int temp = n , sum = 0;
    while( temp > 0){
     int rem = temp %10;
     sum += rem * rem * rem;
     temp /= 10;  
    }
    System.out.println(sum == n ? "Amstrong number" :"Not Amstrong Number");
  }
}
