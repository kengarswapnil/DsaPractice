public class InsertionSort {
  public static void main(String[] args) {
    int arr[] ={2,1,3,5,1,7,4};
    int n = arr.length;

    for(int i=0;i < n ;i++){
      int temp = arr[i];
      int j = i -1;
      while (j >= 0 && arr[j] > temp) {
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = temp; 
    }

    System.out.println("Arrya after insertion sorting");
    for(int i=0;i<n;i++){
      System.out.println(arr[i] + " ");
    }
  }
}
