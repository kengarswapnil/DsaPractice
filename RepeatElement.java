import java.util.Scanner;

public class RepeatElement {
  public static void main(String[] args) {
    int arr [] = {1,2,3,1,2,4};
    for(int i=0;i<arr.length;i++){
        boolean isRepeat = false;
      for(int j=i+1;j<arr.length;j++){
      
        if(arr[i] == arr[j]){
          isRepeat = true;
          break;
        }
      }
        if (isRepeat) {
            System.out.println(arr[i]);
        }
      
      
    }
    
  }
}
