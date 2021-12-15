import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Challenge2_TwoSum {

	public static void main(String[] args) {
		//Approach 1
		int [] numbers ={2,3,7,4,8};
		int target=7;
		boolean flag =false;
		for(int i=0; i<numbers.length;i++) {
			for(int j= i+1;j<numbers.length;j++) {
				if(numbers[i]!=numbers[j]) {
					if(numbers[i]+numbers[j]==target) {
						System.out.println("index i "+ i + "index j "+ j);
						flag=true;
					}
				}
			}
		}
       if(flag==false) {
    	   System.out.println("There are no numbers that add up to target");

	}
   int [] result =getTwoSum(numbers,target);
       System.out.println(result[0] + " " +result[1]);
       
}
	//EFFECINET WAY TIME AND SPACE BIG O of N complexity
	public static int[] getTwoSum(int [] numbers, int target) {
		 Map<Integer, Integer> visitedNumbers = new HashMap<>();
	       for(int i=0; i<numbers.length; i++) {
	    	 int delta = target -numbers[i];
	    	 if(visitedNumbers.containsKey(delta)) {
	    		return new int[]   {i , visitedNumbers.get(delta)};
	    	 }
	    	 visitedNumbers.put(numbers[i], i);
	       }
	       return new int[] {-1,-1};
	}
}
