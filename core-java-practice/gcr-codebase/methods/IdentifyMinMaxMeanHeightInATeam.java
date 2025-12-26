public class IdentifyMinMaxMeanHeightInATeam {
	public static int findSum(int[] heights) {
		int sum = 0;
		for(int i = 0;i<heights.length;i++) {
			sum = sum + heights[i];
		}
		return sum;
	}
	public static double findMean(int[] heights) {
		int sum = findSum(heights);
		double mean = (double)sum / heights.length;
		return mean;
	}
	public static int findShortest(int[] heights) {
		int min = heights[0];
		for(int i = 1;i<heights.length;i++) {
			if(heights[i] < min) {
				min = heights[i];
			}
		}
		return min;
	}
	public static int findTallest(int[] heights) {
		int max = heights[0];
		for(int i = 1;i<heights.length;i++) {
			if(heights[i] > max) {
				max = heights[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] heights = new int[11];
		for(int i = 0;i<heights.length;i++) {
			heights[i] =(int)( Math.random()*101)+150;
		}
		System.out.println("Players Height:");
		for(int i = 0;i<heights.length;i++) {
			System.out.println(heights[i]);
		}
		System.out.println("Shortest height among the players is: " + findShortest(heights));
		System.out.println("Tallest height among the players is: " + findTallest(heights));
		System.out.println("Mean height of the players is: " + findMean(heights));
	
	}
}

