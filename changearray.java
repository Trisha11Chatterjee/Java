import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr [] = {1,2,9,10,8};
      System.out.println(Arrays.toString(arr));
      change(arr);
      System.out.println(Arrays.toString(arr));
    }
    

    public static void change(int arr[]){
      arr[1] = 200;
    }
}