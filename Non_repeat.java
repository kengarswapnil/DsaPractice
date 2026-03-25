import java.util.Scanner;

public class Non_repeat {
  public static void main(String[] args) {
    int arr[] = {1,2,3,3,2};
    for(int i=0;i<arr.length;i++){
      boolean isNonRepeat = true;
      for(int j=0;j<arr.length;j++){
        if(i != j && arr[i] == arr[j]){
          isNonRepeat = false; 
          break;
        }
      }
      if(isNonRepeat){
        System.out.println(arr[i]);
      }
    }
  }
}
