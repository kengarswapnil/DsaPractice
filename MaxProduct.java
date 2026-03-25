public class MaxProduct {
  public static void main(String[] args) {
    int arr [] =  {1,2,3,4,5};

   int max = 0;
   for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
      int product = arr[i] * arr[j];
      if(product > max){
        max = product;
      }
    }
   }
   System.out.println(max);
  }
}
