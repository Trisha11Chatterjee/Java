import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr [] = {1,2,9,10,8};
      int target = 10;
      int n = arr.length , ans = -1;


      for (int i =0; i< n; i++){
        if (arr[i] == target){
          ans = i;
          break;

        }
      }
      System.out.println(ans);
    }
}