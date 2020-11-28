
import java.util.*;


public class KidsWithTheGreatestNumberOfCandies{

	private class Kid implements Comparable<Kid>{
		int index;
		int candies;

		Kid(int index, int candles){
			this.index = index;
			this.candies = candies;
		}


		public int compareTo(Kid k){
			return this.candies - k.candies;
		}
	}

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<>();
		
		if(candies.length == 0){
			return result;
		}

		if(candies.length == 1) {
			result.add(true);
		}
		int max = 0;
		for(int i=0; i< candies.length; i++){
			if(max < candies[i])
				max = candies[i];
		}

		for(int i = 0; i<candies.length; i++){
			if(max <= candies[i] + extraCandies){
				result.add(true);
			} else {
				result.add(false);
			}
		}

		return result;
	}
	

	public static void main(String[] args){
		System.out.println("hello world");
		int[] arr = {2,3,5,1,3};
		KidsWithTheGreatestNumberOfCandies candies = new KidsWithTheGreatestNumberOfCandies();
		candies.kidsWithCandies(arr, 3);
	}
}
