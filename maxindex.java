import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int arr[] = {1,2,3,4,5};
      int max = arr[0];
      int maxindex=0;

      for(int i=0; i<arr.length;i++){
        if (arr[i] > max){
          max = arr[i];
          maxindex= i;
        }

      } 
      System.out.println ("max:" +max + "at index :" + maxindex);
    }
    
}