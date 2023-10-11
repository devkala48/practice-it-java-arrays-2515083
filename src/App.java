import java.util.Arrays;

public class App {
  
  public static void main(String[] args) {
    int[] arr = new int[]{92, 12, 38, 74};
    //printing each items of an array
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println();
    //printing each items of an array in reverse order 
    for (int i = arr.length -1; i >= 0; i--) {
      System.out.println(arr[i]);
    }
    System.out.println();

    //printing every other items of an array
    for (int i = arr.length - 1; i >= 0; i = i - 2) {
      System.out.println("array index : " + i);
      System.out.println(arr[i]);
    }
    System.out.println();

    //Java Stream, converting an array to stream
    Arrays.stream(arr).forEach(System.out::println);
  }
}