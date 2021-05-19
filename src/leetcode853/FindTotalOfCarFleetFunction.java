package leetcode853;

import java.util.Map;
import java.util.TreeMap;

public class FindTotalOfCarFleetFunction {
    public int carFleet(int target, int[] position, int[] speed) {
    	// O(log(n))
        TreeMap<Double, Double> sortedMap = new TreeMap<>(); // Sort by key
        
        for(int i = 0; i < position.length; i++){
        	// Key is the distance left to target
        	// Value is the speed of each car
            sortedMap.put((double)(target - position[i]), (double) speed[i]);
        }
        
        int totalFleet = 0;
        
        // Keep track if last car time was the same or not
        double last_time = -1.0;
        
        for(Map.Entry<Double,Double> entry : sortedMap.entrySet()){
        	// Formula to get the time to the target
            double currentTime = entry.getKey()/entry.getValue();
            
            if(currentTime > last_time){
                totalFleet++;
                last_time = currentTime;
            }
        }
        
        
        return totalFleet;
    }
    
    public int carFleet2(int target, int[] position, int[] speed) {
        TreeMap<Integer, Double> sortedMap = new TreeMap<>();
        
        for(int i = 0; i < position.length; i++){
        	// Key is negative since treemap is sorted and we want the biggest at the beginning
        	// Value will be the formula of how much time to target
            sortedMap.put(-position[i], (double)(target - position[i])/speed[i]);
        }
        
        int totalFleet = 0;
        double last_time = -1.0;
        
        for(double currentTime : sortedMap.values()){
            if(currentTime > last_time){
                totalFleet++;
                last_time = currentTime;
            }
        }
     
        return totalFleet;
    }
}
