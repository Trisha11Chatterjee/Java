import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int rows = sc.nextInt();
      int coln = sc.nextInt();
      int arr[][] = new int [rows][coln];

      for (int i =0; i <rows ; i++){
        for (int j = 0; j< coln; j++){
          System.out.println("enter matrix [" +i+ "][" +j+ "]");
          arr[i][j] = sc.nextInt();

        }
        System.out.println();
      }
    }
}
