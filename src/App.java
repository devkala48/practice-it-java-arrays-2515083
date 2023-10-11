import java.util.Arrays;

public class App {
  
  public static Object[] rotateRight(Object[] arr) {
	  if (arr == null) {
      return null;
    }
    Object[] rotateArr = new Object[arr.length];
    for (int i = 0; i < arr.length; i++) {
      rotateArr[(i+1) % arr.length] = arr[i]; //any number module by array length always give valid index
    }
    return rotateArr;
  }
  
  public static void main(String args[]) {
    Object[] arr = new Integer[] {1, 2, 3, 4, 5};
      
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    arr = rotateRight(arr);
    System.out.println(Arrays.toString(arr));
    
    Object[] arr2 = new String[] {"Hello", "there", "my friend"};
    
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
    arr2 = rotateRight(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}