package leetcode853;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] position = {10,8,0,5,3};
		
		int[] speed = {2,4,1,1,3};
		
		int target = 12;
		
		System.out.println("Position: " + Arrays.toString(position));
		
		System.out.println("Speed: " + Arrays.toString(speed));
		
		System.out.println("Target: " + target);
		
		FindTotalOfCarFleetFunction solution = new FindTotalOfCarFleetFunction();
		
		System.out.println("Total Car Fleet: " + solution.carFleet(target, position, speed));
	}
}
