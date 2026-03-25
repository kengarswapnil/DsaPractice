public class BubbleSort {
  public static void main(String[] args) {
    int arr [] = {2,1,5,1,2,6};
    int n = arr.length;

    for(int i=0;i<n-1;i++){
      boolean swapped = false;
      for(int j=0;j<n-i-1;j++){
         if(arr[j] > arr[j+1]){
          swapped = true;
          int temp = arr[j];
          arr[j] = arr[j +1];
          arr[j+1] = temp;
         }
      }
      if(!swapped){
        break;
      }
    }
   System.out.println("The sorted array using bubble sort is:");
   for(int i = 0; i<n ;i++){
    System.out.print(arr[i] + " ");
   }
  }
}
