import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int arr[] = {1,2,3,4,5};
      int max = arr[0];
      int secmax = arr[0];
      

      for(int i=0; i<arr.length;i++){
        if (arr[i] > max){
          secmax= max;
          max = arr[i];
          
        }
        else if (arr[i] > secmax){
          secmax= arr[i];

        }

      } 
      System.out.println ("max:" +secmax);
    }
    
}