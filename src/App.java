import java.util.Arrays;

public class App {
    
  public static void reverse(int[] arr) {
    for (int i = 0; i < arr.length /2; i++) {
     // {1, 2, 3, 4}
      int temp = arr[i]; //1 first loop index 0 //2 index 1
      arr[i] = arr[arr.length -1 -i]; //point to last index i.e 3 as arr.length = 4 -1 -0 first loop
                                      //2nd loop point to index 2 (4-1-1)
      arr[arr.length -1] = temp; //1
    }
  }
  
  public static void main(String args[]) {
    int[] arr = new int[] {};
    System.out.println(Arrays.toString(arr));
    reverse(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println();
    
    int[] arr2 = new int[] {1};
    System.out.println(Arrays.toString(arr2));
    reverse(arr2);
    System.out.println(Arrays.toString(arr2));
    System.out.println();
    
    int[] arr3 = new int[] {1, 2, 3};
    System.out.println(Arrays.toString(arr3));
    reverse(arr3);
    System.out.println(Arrays.toString(arr3));
    System.out.println();
    
    int[] arr4 = new int[] {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(arr4));
    reverse(arr4);
    System.out.println(Arrays.toString(arr4));
    System.out.println();

    int[] arr5 = new int[] {9, 3, 4, 1};
    System.out.println(Arrays.toString(arr5));
    reverse(arr5);
    System.out.println(Arrays.toString(arr5));
    System.out.println();
    
    int[] arr6 = new int[] {1, 2, 3, 4, 5, 6, 7};
    System.out.println(Arrays.toString(arr6));
    reverse(arr6);
    System.out.println(Arrays.toString(arr6));
    System.out.println();
  }
}