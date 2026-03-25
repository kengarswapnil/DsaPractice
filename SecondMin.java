import java.util.Scanner;
import java.util.Arrays;
public class SecondMin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();

    int arr[] = new int[n];

    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    System.out.println("Second largest Element :"+arr[arr.length -2]);
    System.out.println("second smallest number"+arr[1]);
  }
}
