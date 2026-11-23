import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      String s= "good";
      int n = s.length ();
      String rev = " ";
      for (int i= n-1 ; i >=0; i--){
        rev += s.charAt(i);
      }
    System.out.println(rev);
    }
}