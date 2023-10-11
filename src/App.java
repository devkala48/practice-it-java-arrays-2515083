public class App {
  
  public static void main(String[] args) {
    //double[] lotteryNums; array of double type declare only
    // double[] lotteryNums = new double[5]; declare and allocate memory of size 5
    double[] lotteryNums = {10, 11, 12, 13, 14}; //declare, memory allocate and initalize all in one line
    System.out.println(lotteryNums[2]);
    lotteryNums[2] = 15;
    System.out.println(lotteryNums[2]);
  }
}