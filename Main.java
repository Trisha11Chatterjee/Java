import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int a =10,  b=20;
      int temp=a;
      a=b;
      b=temp;
      System.out.println(a);
      System.out.println(b);
      int arr[] = new int [5];
      arr[0]=10;
      arr[1]=20;
      arr[2]=30;
      arr[3]=40;
      arr[4]=50;
      System.out.println(arr[1]);
      for(int i=0; i<arr.length;i++) {
        System.out.println(arr[i]);
      }
    }
}