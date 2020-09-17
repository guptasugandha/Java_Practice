import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
public class reverseStr { 
    public static void main(String[] args) 
    { 
        String str = "string";
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);
    }
}
