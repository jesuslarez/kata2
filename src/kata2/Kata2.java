package kata2;

// @author Jesus Larez
import java.util.*;
import java.util.HashMap;
import kata2.Histogram;


public class Kata2 {

    public static void main(String[] args) {
        int data [] = {1,2,2,3,3,3,4,4,4,4};
        Histogram histo = new Histogram(data);
        
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (int key : data) {
            histogr.put(key, histogr.containsKey(key) ? histogr.get(key) + 1 : 1);
            
        }
        System.out.println(histogr);
    }
    
}
