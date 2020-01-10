package kata2;

// @author Jesus Larez
import java.util.*;
import java.util.HashMap;
public class Kata2 {

    public static void main(String[] args) {
        int data [] = {1,2,2,3,3,3,4,4,4,4};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int key : data) {
            
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
            
        }
        
        System.out.println(histogram);
    }
    
}
